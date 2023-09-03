package org.example.hellorama;

import com.rpl.rama.Depot;
import com.rpl.rama.RamaModule;
import com.rpl.rama.module.StreamTopology;
import com.rpl.rama.ops.Ops;
import com.rpl.rama.test.InProcessCluster;
import com.rpl.rama.test.LaunchConfig;

public class MyFirstModule implements RamaModule {
    @Override
    public void define(Setup setup, Topologies topologies) {
        setup.declareDepot("*depot", Depot.random());
        StreamTopology s = topologies.stream("s");
        s.source("*depot").out("*data")
                .each(Ops.PRINTLN, "*data");
    }

    public static void main(String[] args) throws Exception {
        try (InProcessCluster cluster = InProcessCluster.create()) {
            cluster.launchModule(new MyFirstModule(), new LaunchConfig(1, 1));

            Depot depot = cluster.clusterDepot(MyFirstModule.class.getName(), "*depot");
            depot.append("Hello, world!!");
        }
    }
}
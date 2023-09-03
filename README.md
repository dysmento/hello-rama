# Hello Rama
This project is the bare minimum Rama example, showing what you need in your pom file
and the code for a trivial Rama module. You can learn about Rama in detail at the
[Rama documentation](https://redplanetlabs.com/docs/~/index.html).

### Project Contents
It's just this README, the `pom.xml` file, and a single class called `MyFirstModule`.
```
.
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── org
    │   │       └── example
    │   │           └── hellorama
    │   │               └── MyFirstModule.java
    │   └── resources
    └── test
        └── java
```
### Prerequisites
We assume you're running macOS or Linux (Windows is not yet supported), you have a Java
JDK installed (version 8 or above), and you have Maven installed.

### Running the Example
You can run the main method in `MyFirstModule` using the features in your IDE of choice.
Alternatively, you can use a terminal command to build the project and start a groovy shell:

    mvn compile gplus:shell

From the shell, you can execute the main method like this:

    groovy:000> org.example.hellorama.MyFirstModule.main(null)

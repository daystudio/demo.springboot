# demo.springboot

Simply a Spring Boot CRUD demo

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### Installing - Gradle

A step by step series of examples that tell you how to get a development env running

Clone the project, and build with
```
gradle clean build
```

and then run with

```
gradle bootRun
```

will show
```
2018-11-14 17:42:52.003  INFO 67780 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2018-11-14 17:42:52.007  INFO 67780 --- [           main] mou.Application                          : Started Application in 2.333 seconds (JVM running for 2.747)
```

that means the server is UP and RUNNING.  Ready to accept request at
```
http://<ip-address>:9090/
```

e.g. if you run on local machine, the IP address should be 127.0.0.1
```
http://127.0.0.1:9090/
```

configure the server.port (e.g.=9090 above) in
```
./src/main/resources/application.properties
```

### Installing - Maven

Maven also works for this prototype

Clone the project, and build with
```
mvn clean install
```

and then run with

```
java -jar target/xxx.jar
```

will show
```
2018-11-14 17:42:52.003  INFO 67780 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2018-11-14 17:42:52.007  INFO 67780 --- [           main] mou.Application                          : Started Application in 2.333 seconds (JVM running for 2.747)
```

that means the server is UP and RUNNING.  Ready to accept request at
```
http://<ip-address>:9090/
```

e.g. if you run on local machine, the IP address should be 127.0.0.1
```
http://127.0.0.1:9090/
```


## Running the tests

Running the test

GET a list of Prototype

```
http://<ip-address>:9090/
```

this is the postman script has all the API included in the demo
```
./_doc/demo.springboot.postman_collection.json
```
Simply download a Postman freeware app and import the script to test ALL the script.

## Deployment

The app is also readily deployable on Tomcat

First build with
```
gradle clean build
```

and simply deploy
```
./build/libs/demo.springboot-0.1.war
```

## Working with Eclipse

To import code into Eclipse, install Buildship, and then use 
```
Import -> Gradle -> Existing Gradle Project
Import -> Maven -> Existing Maven Projects
```

Then simply
```
Run As -> Spring Boot App
```

Can also run with Spring Tool Suite

## Built With

* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) - Java
* [Maven](https://maven.apache.org/) - Dependency Management
* [Gradle](https://gradle.org) - Dependency Management
* [Spring Boot](http://spring.io/projects/spring-boot) - Spring Boot Framework
* [Spring Tool Suite](https://spring.io/tools) - Spring Tool Suite 4, plugin on Eclipse for Springboot
* [Buildship](https://projects.eclipse.org/projects/tools.buildship) - Eclipse Support for building with Gradle
* [Postman](https://www.getpostman.com) - Postman API tool


## Contributing


## Versioning


## Authors

* **ck chan** - *Initial work* - [cck](https://github.com/daystudio)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

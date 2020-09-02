# First steps Docker with Spring Boot development

Docker ready dev environment with Spring Boot. 

- [x] _initiate a simple Spring Boot app;_
- [x] _create a simple docker image;_
- [x] _configure Dockerfile;_
- [x] _build that docker image;_
- [x] _get docker up and running;_
- [x] _run configuration to handle dev modifications & live reload_

## Necessary adaptations to use DevTools's Remote Live Reload:

### < pom.xml >

We know DevTools scope is at _runtime_. So, we have to configure to exclude DevTools from the build by doing something like that:

```
<build>
  <plugins>
    <plugin>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-maven-plugin</artifactId>
      
      <configuration>
        <excludeDevtools>false</excludeDevtools>
      </configuration>
      
    </plugin>
  </plugins>
</build>
```

### application.properties

Just set a secret to allow Remote connection by adding this configuration `spring.devtools.remote.secret=YOUR_SECRET`.

### _RUN CONFIGURATION_

It's necessary to adapt a _RUN CONFIGURATION_ inside the IDE (Eclipse, IntelliJ) to run the following Main class:

```
org.springframework.boot.devtools.RemoteSpringApplication
```

And the _PROGRAM ARGUMENTS_ must include the address of the app container, in this example: `http://localhost:8081`

## Acknowledgements 

[@algaworks](https://github.com/algaworks): "Usando Docker para criar um ambiente de desenvolvimento" [_(video)_](https://youtu.be/c-Bq6JUfRnk)

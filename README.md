# Spring Boot & Apache Camel learning

Hands-on project to learn Spring Boot and Apache Camel

## How to run

You can run this example using

```bash
mvn spring-boot:run
```

## To get health check

To show a summary of spring boot health check

```bash
curl -XGET -s http://localhost:8080/actuator/health
```

And you can see some info details as well

```bash
curl -XGET -s http://localhost:8080/actuator/info`
```

See the `application.properties` to control what information to present in actuator.

## Camel Developer Console

This application includes `camel-console-starter` which is a basic developer console
that is accessible as a Spring Boot actuator endpoint via:

```bash
curl -XGET -s http://localhost:8080/actuator/camel
```

For example to get route information:

```bash
curl -XGET -s http://localhost:8080/actuator/camel/routes
```

## Camel CLI

This application is integrated with the Camel CLI via the `camel-cli-connector-starter` dependency (see `pom.xml`).
This allows to use the Camel CLI to manage this application, such as:

```bash
$mvn spring-boot:run
```

And then use the CLI to see status:

```bash
$camel get
PID   NAME                          CAMEL   PLATFORM            READY  STATUS   AGE  TOTAL  FAILED  INFLIGHT  SINCE-LAST
86000  sample.camel.MyCamelApplica…  3.19.0  Spring Boot v2.7.3   1/1   Running  11s      5       0         0          0s
```
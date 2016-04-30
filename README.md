# elk4j-docker

Aggregate logs from docker containers using ELK stack
+ Special treatment for logs from your jvm-based dockerized microservices

### Basic Usage

- Spin up ELK containers manually or using provided docker-compose.yml
- Run your containers with gelf logging-driver using options:
```
--log-driver=gelf --log-opt gelf-address=udp://${logstash-container-host}:${logstash-container-port} --log-opt tag=${tag}
```
- Write your logs to `stdout` and `stderr` as usual.

### Usage with JVM-based services

To get detailed (including stacktrace) logs from your JVM application use SLF4J backend with JSON-layout for the Console Appender.

Some possible implementations are provided in `/example/jvm/`

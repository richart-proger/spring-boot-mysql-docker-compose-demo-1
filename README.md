# About project

## Simple Spring Boot project based on MySQL and Docker Compose

To run the project, download it to your computer or clone it from:
<https://github.com/richart-proger/spring-boot-mysql-docker-compose-demo-1>

*If you are NOT using a Linux machine, you need a virtualized server. If you install VirtualBox, other tools like the Mac’s boot2docker can seamlessly manage it for you. Visit <a href="https://www.virtualbox.org/wiki/Downloads">VirtualBox’s download site</a> and pick the version for your machine. Download and install. Do not worry about actually running it.*

*You also need Docker, which only runs on 64-bit machines. See https://docs.docker.com/installation/#installation for details on setting Docker up for your machine. Before proceeding further, verify you can run docker commands from the shell. If you use boot2docker, you need to run that first.*

### How to configure

1. Build the jar file using Intellij IDEA or command line from the project root:
```bash
mvn clean package
```

2. Next, we build the application and MySQL containers using the command (run from the Intellij IDEA terminal or from the ***target*** package command line
```bash
docker-compose up
```
3. The app will start running at <http://localhost:8088/api/students/list>.

4. To stop the application, use Ctrl + C in the terminal or this command from the command line:
```bash
docker-compose down
```

5. The normal operation of the application (without Docker Compose) is carried out on the resource <http://localhost:8080/api/students/list>.

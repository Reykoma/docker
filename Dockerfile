FROM    maven:3.6.3-jdk-11-openj9

RUN     mkdir -p /docker

WORKDIR /docker

COPY    pom.xml .
RUN     mvn dependency:resolve

COPY    testng.xml .
COPY src/ src/


RUN     mvn clean verify
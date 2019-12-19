FROM    maven:3-jdk-9

RUN     mkdir /docker

WORKDIR /docker

COPY    pom.xml .
RUN     mvn dependency:resolve

COPY    testng.xml .
COPY    src .

RUN     mvn clean verify
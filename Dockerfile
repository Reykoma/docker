FROM markhobson/maven-chrome
COPY . .
RUN mvn test
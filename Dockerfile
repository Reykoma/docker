FROM maven:3.5.3-jdk-8-alpine




# Install dependencies
RUN apk update
RUN apk --update \
    add build-base \
    chromium \
    chromium-chromedriver 




COPY . .
RUN mvn test
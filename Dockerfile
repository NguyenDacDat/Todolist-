FROM openjdk:22-jdk
WORKDIR /opt/app
ARG APP_NAME="todoProject"
ARG APP_VERSION="0.0.1"
COPY /target/${APP_NAME}-${APP_VERSION}-SNAPSHOT.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

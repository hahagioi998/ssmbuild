FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/ssmbuild.jar ssmbuild.jar
ENTRYPOINT ["java","-jar","/ssmbuild.jar", "&"]
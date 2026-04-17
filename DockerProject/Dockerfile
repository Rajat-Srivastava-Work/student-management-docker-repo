FROM eclipse-temurine:17-jre-alipne
WORKDIR /app
COPY target/dockerproject.war dockerproject.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/dockerproject.jar"]
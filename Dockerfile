FROM maven:3.8.4-openjdk-17-slim

#Clone from github
RUN git clone https://github.com/work-sample-projects/springboot-serverless-demo-1.git

#Change the workingdir to the sprintboot folder
WORKDIR "/springboot-serverless-demo-1"

#Run a maven clean install
RUN mvn clean install

# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar

# ENTRYPOINT ["java", "-jar", "app.jar"]

# EXPOSE 8080

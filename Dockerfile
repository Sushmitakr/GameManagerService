FROM openjdk
VOLUME /tmp
ADD target/GameManager-0.0.1-SNAPSHOT.jar usr/project/gameManager-app.jar
WORKDIR usr/project/
RUN sh -c 'touch gameManager-app.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://condescending_thompson:27000/gamemanagerdb", "-jar","gameManager-app.jar"]

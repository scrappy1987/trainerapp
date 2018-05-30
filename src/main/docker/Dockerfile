FROM java:8
VOLUME /tmp
ADD trainerapp.jar trainerapp.jar
RUN bash -c 'touch /trainerapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/trainerapp.jar"]
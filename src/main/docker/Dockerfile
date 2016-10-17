FROM java:8
VOLUME /tmp
ADD ozi_service.jar ozi_service.jar
RUN sh -c 'touch /ozi_service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ozi_service.jar"]
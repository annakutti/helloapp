FROM openjdk:8
ADD target/helloboot.jar helloboot.jar
EXPOSE 8009
ENTRYPOINT ["java","-jar","helloboot.jar"]
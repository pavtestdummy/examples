ARG v1=17
FROM openjdk:${v1}
COPY ./target/MyClient.jar MyClient.jar
EXPOSE 7777
ENV MY_PATH=http://wrongdata
CMD ["java","-jar","MyClient.jar"]
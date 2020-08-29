ARG DB_URL
ARG API_KEY

FROM openjdk:8-jdk-alpine
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/* ./app.jar
EXPOSE 8080
CMD [ "sh", "-c", \
    "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -Dspring.datasource.url=$DB_URL -Dspring.datasource.url=$DB_URL -jar app.jar" ]
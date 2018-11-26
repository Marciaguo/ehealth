FROM java:8
VOLUME /tmp
ADD target/user-management-0.1.jar app.jar
RUN bash -c 'touch /app.jar'
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone \
EXPOSE 8001
ENTRYPOINT ["java","-Xmx400m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

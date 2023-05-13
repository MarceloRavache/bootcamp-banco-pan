FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/ /app

EXPOSE 8080

CMD ["java", "-jar", "classes/com/challenger/crud/CrudApplication.class"]
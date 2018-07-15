# SpringDataJpaBootGradleMySQLFlywaySwaggerEntityRelationships"

Pre requisite
Create a database "tutorialDatabase" in MySQL.
database connection : sa/pa55w0rd

Customer and address database tables will be created by flyway on build

Build: gradle clean build flywayMigrate

Steps to start Tomcat:
1. Start the Java main class SpringdatajpaApplication . Tomcat will start on port 8080
2. Go to http://localhost:8888/shopping/swagger-ui.html#
3. You will see an end point to create ustomer and address

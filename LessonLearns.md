###Database connection Issues during Sprint boot Startup

https://stackoverflow.com/questions/52480973/h2-in-memory-test-db-closed-despite-db-close-on-exit-false


https://stackoverflow.com/questions/34964066/spring-boot-doesnt-use-datasource-properties

https://stackoverflow.com/questions/60726203/error-while-running-a-spring-application-org-h2-jdbc-jdbcsqlnontransientconnect

####This resolved the headache after couple of hours or solution for the issue
Check if you have <dependency> <groupId>org.springframework.boot</groupId> 
<artifactId>spring-boot-starter-tomcat</artifactId> </dependency> in your pom.xml, remove it

###Spring Connection Properties

https://stackoverflow.com/questions/51691744/spring-boot-with-h2-database-auto-create

###Include Tomcat Server in Maven dependency
https://stackoverflow.com/questions/53259267/spring-boot-hikari-pool-shutdown-early-error

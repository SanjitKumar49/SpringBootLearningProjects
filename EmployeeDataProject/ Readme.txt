✅ Entry Level
 
 1- how to run the project
     if i use SPring boot  then no need to intigarte external service in springboot 
     have own tomcat server that way it run atumatically. 
     below dependency gives everthing that are need to run webapplication
     <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
 2-  how to setup the database	
       step1- create database.
       step2-add your user id, password and url in properties file.
       step3- impliment jpa or habernate  for CRUD Opertion.
 	
 3-   API documentation( https://restless-star-397005.postman.co/workspace/My-Workspace~cfc33b3b-3693-4bd7-8c14-3a3a5dc91377/collection/29780906-448e41a7-a98a-44e3-9265-5d37d50fc243?action=share&creator=29780906  )
      add-http://localhost:8080/addEmployee
      get-http://localhost:8080/getEmployee
      delete-http://localhost:8080/employee/1
      update-http://localhost:8080/updateEmployee
      
 
 
 Note:-I try to impliment NoSQL database but some error is coming to my project and 
       i try to resolve but i did't able resolved so that way in this project 
       i impliment MySQl data base becouse i know very well SQL DATABASE..
        
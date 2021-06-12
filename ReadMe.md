Hello,

Project Setup

Install Gradle if you do not have it installed

Navigate to root folder
/factor-scaffold--spring-backend

Run:
Gradle clean build

There are two ways to run this:

Through IDE or creating a jar and running the Jar:

Jar Option:

In the root folder(listed above) run
gradle jar

Navigate to
/factor-scaffold--spring-backend/build/libs
run

java -jar scaffoldBackend-0.0.1-SNAPSHOT.jar


IDE Option:

Import the project as a gradle project

Run ScaffoldBackendApplication -> main method

When the server is running it will be on

localhost:7000

[You can change the port in the application.yml file under src/main/resources]

There are three endpoints in the MainController.java file under src/main/java/controller
/getUserPackages
/getPackageDetails
/addNewPackage

When the server starts up, it will run the setup method under ScaffoldBackendApplication.java

There is a H2 in memory database you can connect to using :
localhost:7000/h2

default information will allow you to log in and see two tables

Things left to do:

Create a multiple file upload - For this, my idea was to alter the post request,
to require files as part of the request parameters and uploading the data to a predefined storage location,
and store that location into the database in a new column under product_package table

Authentication - For Authentication, I would incoropate the Authentication manager and adding a hashed  field to the users
table for the users table. Using the authentication manager, I can confirm the user is who they say they are. After it is confirmed,
I can use a token that expires after a set period of time. 

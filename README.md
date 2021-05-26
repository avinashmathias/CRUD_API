# CRUD API initialisation

## Database initialisation and JDBC Connection

Create a database in mysql called **Student**.

```
create database Student;
```

Once the database is initialised, goto `application.properties` and change the username and password of mysql database.

```
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
```

After setting up jdbc connections, hibernate will automatically create all the required tables.

## Running the application

The username and password for the spring security are,\
username = admin\
password = password

### URLs

#### Login Page
http://127.0.0.1:8080/showMyLoginPage

#### Logout Page
http://127.0.0.1:8080/logout

#### Retrieve all students
`GET` http://localhost:8080/students

#### Retrieve particular student
`GET` http://localhost:8080/students/{id}

#### Create student
`POST` http://localhost:8080/students

#### Update a student
`PUT` http://localhost:8080/students

#### Delete a student
`DELETE` http://localhost:8080/students


> **NOTE:** Initially database will be empty, so you need to add some students

#### Sample Data

```
{
  "name": "Jacob",
  "email": "Jacob@gmail.com"
}
```
```
{
  "name": "JOJO",
  "email": "JOJO@gmail.com"
}
```
```    
{
  "name": "Mohan",
  "email": "Mohan@Yahoo.co.in"
}
```
```
{
  "name": "Gigi",
  "email": "gigi@Yahoo.co.in"
}
```

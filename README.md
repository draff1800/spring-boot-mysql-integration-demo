# Spring Boot MySQL Integration Demo

A demo showcasing MySQL integration in a Spring Boot application.

### Guide

* Create a MySQL instance with a database. You can use [MySQL Workbench](https://www.mysql.com/products/workbench/) for this.
* Create a user, give them a password, and grant all access privileges.
* Add the following environment variables (You can do so by running `export [VARIABLE NAME HERE]=[VARIABLE VALUE HERE`]):
  * **MYSQL_HOST** - The host name in your JDBC connection string (eg. `localhost`)
  * **MYSQL_PORT** - The port in your JDBC connection string (eg. `3306`)
  * **DB_NAME** - Your database name
  * **DB_USERNAME** - User username
  * **DB_PASSWORD** - User password

<br />

* Run `./gradlew bootRun` to start the app. This will also create a `customer` table as defined in `Customer.java`.
* From a separate terminal window, you can now add and retrieve Customer table records: 
    * Run `curl -X POST http://localhost:8080/customers -d name=[CUSTOMER NAME HERE] -d email=[CUSTOMER EMAIL HERE]` to add a Customer.
    * Run `curl -X GET http://localhost:8080/customers` to retrieve all Customers.

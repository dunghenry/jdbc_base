CREATE DATABASE JDBC

GO

USE JDBC

GO

CREATE TABLE users(
	id  int IDENTITY(1,1) PRIMARY KEY,
	username varchar(20) NOT NULL,
	age int NOT NULL
)

INSERT INTO users(username, age) VALUES (N'TranDung', 21)
SELECT * from users

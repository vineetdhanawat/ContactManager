# Basic Contact Manager
Assignment part of Coursework CS 6360

## Introduction
Create a screen that lets you add, change, and delete contact.
Multiple tables such as address, phone number, and the like.
Create a second screen that lets you add, change, and delete one other table of your choice.
Always maintain referential integrity.
Make sure to include constraints like date cannot be in future etc.

## Usage
Included NetBeans project, coded for SQLServer. ConnectMSSQLServer.java is meant for testing DB connection.
Create a Sequence Generator on DB as dbo.cmsequence .
Import and fix the following issues
In DBConnection.java, edit your DB connection string

	private final String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Contact_Manager;integratedSecurity=true";
	
In the project properties >> libraries, import the included sqljdbc4.jar file

## DB Structure
Table Details

	Contact(contact_id,dob,notes,group_id,fname,minit,lname)
	Email_Address(email_id,contact_id,type)
	Phone_Number(phone_number,type,contact_id)
	Schedule(schedule_id,type,schedule_date,contact_id,description,date_added)

## License

MIT: http://vineetdhanawat.mit-license.org/
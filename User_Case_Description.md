# User_Case_Description

- Target Customer: Individual Seller  
- Problem Statement: Individual Seller need an Inventory System that is user-friendly and convenient for the seller to manage their stock
- Register for E-Commerce seller  ask if they have an account in One-Stock, if yes then login with that account then extract the user details and ask the user to fill in the extra information
- Target Customer: Individual Seller (SellerInfo)

## SellerInfo
- First Name 
- Last Name
- NRIC/FIN (Pk)
- Email
- Contact Number
- Address
- DateOfBirth
- Gender
- Nationality

## Register

|		|		|
| --- 	| --- 	|	
| Use Case ID 		| 1 |
| Use Case Name 		| Register for One-Stock |
| Primary Actor 		| User | 
| Secondary Actor 	| None |
| Description	 		| Allow the user to register an account with One-Stock 

- Precondition
	1. User has successfully connected to our website
	2. User should not have an existing account

- Postcondition
	1. Account successfully created
	2. Able to login using the newly created account

- Normal flow 	
	1. User inputs required fields in the Registration Page
	2. User input the captcha information
	- System validate all the input
	- Successfully created an account with inactive status
	- System send a link via the input email
	- User click on the link and redirect to our login page
	- User enter ID and Password
	- Successful Login
	- System change the status to active
	- The system display the relevant home page 
- Alternative flow 	
	- 3a invalid Input
      1. The system prompts for re-enter
      2. Use case resumes at main flow step 1
	- 7a Invalid username and password 
      1. The system display “Invalid username and password” message
      2. The system prompts for username and password
      3. Use case resumes at main flow step 7

First Name 
Last Name
NRIC/FIN (Pk)
Email
Contact Number
Address
DateOfBirth
Gender
Username
Password
Status

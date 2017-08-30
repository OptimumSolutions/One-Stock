# User_Case_Description
Target Customer: Individual Seller

**Problem Statement:** Individual Seller need an Inventory System that is user-friendly and convenient for the seller to manage their stock


**Register for E-Commerce seller** --> ask if they have an account in One-Stock, if yes then login with that account then extract the user details and ask the user to fill in the extra information


**SellerInfo**
- First Name 
- Last Name
- NRIC/FIN (Pk)
- Email
- Contact Number
- Address
- DateOfBirth
- Gender
- Nationality



**Target Customer**
- Individual Seller (SellerInfo)

Use Case ID | 1
:---------- | :-
Use Case Name | Registration for One-Stock
Primary Actor | User
Secondary Actor | None
Description | Allow the user to register an account with One-Stock 
Precondition | User has successfully connected to our website <br/> User should not have an existing account
PostCondition | Account sucessfully created <br/> Able to login using the newly created account 
Normal Flow | 1. User inputs required fields in the Registration Page <br/> 2. User input the captcha information <br/> 3. System validate all the input <br/> 4. Successfully created an account with inactive status <br/> 5. System send a link via the input email <br/> 6. User click on the link and redirect to our login page<br/> 7. User enter ID and Password <br/> 8. Successful Login <br/> 9. System change the status to active <br/> 10. The system display the relevant home page
Alternative Flow | **3a invalid Input** <br/> 1.The system prompts for re-enter <br/> 2.Use case resumes at main flow step 1 <br/> **7a Invalid username and password** <br/> 1.The system display "Invalid username and password" message <br/>2.The system prompts for username and password <br/>3.Use case resumes at main flow step 7


**User Database Version 1**
- First Name 
- Last Name
- NRIC/FIN (Pk)
- Email
- Contact Number
- Address
- DateOfBirth
- Gender
- Username
- Password
- Status

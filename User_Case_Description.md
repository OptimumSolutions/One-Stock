# User_Case_Description
1. [something](#something)
2. [Use Case](#use_case)

**Target Customer**
- Individual Seller (SellerInfo)

**Problem Statement:** Individual Seller need an Inventory System that is user-friendly and convenient for the seller to manage their stock

**Register for E-Commerce seller** --> ask if they have an account in One-Stock, if yes then login with that account then extract the user details and ask the user to fill in the extra information

## SellerInfo <a name="something"></a>
- First Name 
- Last Name
- NRIC/FIN (Pk)
- Email
- Contact Number
- Address
- DateOfBirth
- Gender
- Nationality

## User Database Version 1
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

## Use Case: <a name="use_case"></a>

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

Use Case ID | 2
:---------- | :-
Use Case Name | Login
Primary Actor | User
Secondary Actor | None
Description | Allow user to login into our system
Pre-Condition | Owns an “active” user account
Post-Condition | Login successfully and redirect to user homepage
Normal Flow | 1. User input username and password<br/>2. User input the captcha information<br/>3. System verify inputs<br/>4. Successfully login to One-Stock<br/>5. Redirect to user homepage
Alternative Flow  | **3a. Invalid input**<br/>1. System prompt “Invalid username/password”<br/>2. Use case resume at main flow step 1<br/>**3b. Invalid input 3 times for valid username**<br/>1. System prompt “Invalid username/password”<br/>2. System change account status to “Lock”<br/>3. System sent account lock notification email to user account<br/>4. Use case resume at main flow step 1


Use Case ID | 3a
:---------- | :-
Use Case Name | Reset Password with valid username
Primary Actor | User
Secondary Actor | None
Description | with the correct username and wrong password more than 3 times and an email with a session link will be send out to the user.
Pre-Condition | Key in with the correct username and wrong password more than 3 times
Post-Condition | An email with a session link will be send out to the user
Normal Flow | 1. User enter the valid username and wrong password more than 3 times<br/>2. System change the account status to lock<br/>3. Sent email that contain an session link to the user<br/>4. Directly go to reset password page when user click the given link in the email<br/>5. User directly change password<br/>6. System update password and change account status to “active”
Alternative Flow | **3a. Session link expire**<br/>Will be redirected to forget password page.<br/>Use case end.

Use Case ID | 3b
:---------- | :-
Use Case Name | Forget Password
Primary Actor | User
Secondary Actor | None
Description | User forget either/both password and handphone number and use the forget password function to reset/recover their password
Pre-Condition | Owns an account<br/>Forget either/both password and handphone number
Post-Condition | reset/recover their password
Normal Flow | 1. User click on the reset password link<br/>2. System redirect to reset password page<br/>3. User enter valid email and handphone number<br/>4. System verify input<br/>5. Use case continue at use case ID 3a: step 3
Alternative Flow | **4a. Invalid input**<br/>1. System prompt error message<br/> 2.Use case resume at main flow step 3

Use Case ID | 3c
:---------- | :-
Use Case Name | change password
Primary Actor | User
Secondary Actor | None
Description | User change password after login
Precondition | User has successfully login
PostCondition | password change successfully
Normal Flow | 1. User click `change password` in `account` page<br/> 2. User input old password and new password twice <br/> 3. System verify old pwd and validate new pwd <br/> 4. system update database accordingly <br/>5. password changed successfully <br/> 
Alternative Flow | **3a invalid Input** <br/> 1.The system prompts for re-enter <br/> 2.Use case resumes at main flow step 2

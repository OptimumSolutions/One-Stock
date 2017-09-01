# User_Case_Description  
<a name="Top"></a>
[Use Case 1: Registration](#use_case_1)  
[Use Case 2: Login](#use_case_2)  
[Use Case 3a: Reset password with valid username](#use_case_3a)  
[Use Case 3b: Forget password](#use_case_3b)  
[Use Case 3c: Change password](#use_case_3c)  
[Use Case 4: Add stock](#use_case_4)  
[Use Case 5: Display stock](#use_case_5)  
[Use Case 6: Update stock](#use_case_6)  
[Use Case 7: Search stock](#use_case_7)  

**Target Customer**
- Individual Seller (SellerInfo)

**Problem Statement:** Individual Seller need an Inventory System that is user-friendly and convenient for the seller to manage their stock

**Register for E-Commerce seller** --> ask if they have an account in One-Stock, if yes then login with that account then extract the user details and ask the user to fill in the extra information

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

## Use Case: 

<a name="use_case_1"></a>  

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

[Top](#Top)  

<a name="use_case_2"></a>

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

[Top](#Top)  

<a name="use_case_3a"></a>

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

[Top](#Top)  

<a name="use_case_3b"></a>

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

[Top](#Top)  

<a name="use_case_3c"></a>

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

[Top](#Top)  

<a name="use_case_4"></a>

Use Case ID | 4 
:---------- | :-
Use Case Name | Add stock
Primary Actor | User
Secondary Actor | None
Description | Add new items
Precondition | User has successfully login
PostCondition | Add new items succefully
Normal Flow | 1. User click `Add stock` in `home` page <br/> 2. User input details of new item. <br/> 3. Click `Add`<br/> 4. system validate input <br/> 5. system prompt "confirmation" <br/> 6. User click `Confirm` <br/> 7. system update database <br/> 8. Add new items succefully <br/> 9. system prompt "Successful" <br/> 10.redirect to useCase_5
Alternative Flow | **4a invalid input** <br/> 1. system prompt "invalid input" <br/> 2. use case resumes at main flow step-2 <br/>  **6a User click `cancle`** <br/> 1. use case resumes at main flow step-2

[Top](#Top)  

<a name="use_case_5"></a>

Use Case ID | 5 
:---------- | :-
Use Case Name | Display product
Primary Actor | User
Secondary Actor | None
Description | Display products to user based on the criteria that user give
Precondition | User has successfully login
PostCondition | Display products 
Normal Flow | 1. User click `display product` in `home` page<br/> 2. system display product list grouped by `update date`. <br/> 3. User choose `month` (mmm-yyyy) and `catergory` then click `display` <br/> 4. system display product accordingly <br/> 5. User click `item name` to display item details
Alternative Flow | None

[Top](#Top)  

<a name="use_case_6"></a>

Use Case ID | 6 
:---------- | :-
Use Case Name | Update Inventory
Primary Actor | User
Secondary Actor | None
Description | Change stock amount, price etc. Except product ID <br/>set item status to list/not listed (`display product` in `home` page)
Pre-Condition | Owns an active account and login successfully
Post-Condition | Update inventory
Normal Flow | **Main flow 1:**<br/><br/> 1. User enters the `update inventory` main page<br/> 2. System will display a overall view of all inventory items currently under the user account<br/> 3. User update the stock quantity or item status(listed/unlisted) through the “overall view” of the inventory.<br/> 4. System prompt confirmation.<br/> 5. User confirm<br/> 6. System updates database and prompt user about successful update<br/> 7. System refresh the overall view of the inventory.<br/><br/>**Main flow 2:**<br/><br/> 1. User enters the `update inventory` main page <br/> 2. System will display a overall view of all inventory items currently under the user account<br/> 3. User click on the product to view full details<br/> 4. System redirects user to the `update product details` page<br/> 5. System populate the page with full details of the item selected and also includes all comments that is attached to this item (below the `update product detail` page)<br/> 6. User able to update most items details except some fields e.g product code<br/> 7. System validates inputs <br/> 8. System prompt confirmation<br/> 9. User confirm update changes<br/> 10. System updates database and prompt user about successful update<br/> 11. System refresh the overall view of the inventory.
Alternative Flow | **Alternate flow 1:**<br/><br/>**2a. Product display error**<br/> 1. System prompt user that display fail, ask user to refresh page again.<br/> 2. Use case end<br/>**5a. Cancel confirmation**<br/> 1. Use case resume at main flow 1 step 3<br/>**6a. Update fail**<br/> 1. System prompt update fail, ask user to try again later<br/> 2. Use case resume at main flow 1 step 2<br/><br/>**Alternate flow 2:**<br/><br/>**2a. Product display error**<br/> 1. System prompt user that display fail, ask user to refresh page again.<br/> 2. Use case end<br/>**5a. Product detail display error**<br/> 1. System prompt user that display fail, ask user to try again.<br/> 2. Use case resume at main flow 2 step 2<br/>**7a. Invalid input**<br/> 1. System prompt user which input validation fail<br/> 2. Use case resume at main flow 2 step 6<br/>**9a. Cancel confirmation**<br/> 1. Use case resume at main flow 2 step 6<br/>**10a. Update fail**<br/> 1. System prompt update fail, ask user to try again later<br/> 2. Use case resume at main flow 2 step 6

[Top](#Top)  

<a name="use_case_7"></a>

Use Case ID | 7 
:---------- | :-
Use Case Name | Search product
Primary Actor | User
Secondary Actor | None
Description | Allow the user to search their item within our website 
Precondition | User successfully login to One-Stock
PostCondition | User has successfully search their items
Normal Flow | 1. User select the search bar in the menu bar <br/> 2. User input the item keyword they want to search <br/> 3. System autocomplete the keyword and search for relevant result <br/> 4. System display the items that contain the keyword (will be using display page)
Alternative Flow | None

[Top](#Top)  

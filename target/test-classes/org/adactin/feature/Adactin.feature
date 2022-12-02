Feature: Hotel Booking Using Adactin Website
Scenario: Login Functionality
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Buttion And It Navigate To Search Hotel Page
Scenario: Search Hotel Functionality
When user Select The Location In Select Location Field
And user Select The Hotel In Select Hotel Page
And user Select RoomType In Roomtype Field
And user Select No of Rooms In No Of Rooms Field
And user Enter The Checkindate In Check In Date Field
And user Enter The CheckOutDate In Check Out Date Field
And user Select No Of Adults In Adults Per Room
And user Select No Of Children In Children Per Room Field
Then user Click On Search Button And It Navigate to Select Hotel Page
Scenario: Select Hotel Functionality
When user Select The Hotel In Select Button Field
Then user Click The Countinue Button And It Navigate To User Deatils Page
Scenario: User Enter Details Functionality
When user Enter First Name In First Name Field
And user Enter Last Name In Last Name Field
And user Enter Address In Billing Address Field
And user Enter Credit Card No in Credit Card No Field
And user Select The Card Type In Credit Card Type Field
And user Select The Expiry Month In Select Month Field
And user Select The Expiry Year In Select Year Field
And user Enter The CVV No in CVV No Field
Then user Click BookNow Button And It Navigate To Show Page
Scenario: Logout Functionality
Then user Click Logout Button And It Navigate To Login Page

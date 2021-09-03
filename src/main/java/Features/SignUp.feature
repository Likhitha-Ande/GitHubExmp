Feature: SignUp Application feature

Scenario: User SignUp Scenario
		Given User is on Application Home Page 
		When Application Page Title is PHP Travels
		Then User clicks on Sign Up option
		When User navigate to Sign Up page
		Then User enters the details and details are validated 
		 | Likhitha | Ande | 9121686729 | likiande@gmail.com | Travels#123 |
		Then click on Sign Up button
		And Close the Browser
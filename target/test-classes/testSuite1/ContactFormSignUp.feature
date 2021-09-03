@ContactFormSignUp
Feature:Navigate to MycontactsForm 

Scenario Outline: Add Details to Basic details form
	Given Go to mycontactsform site
	Then  Add the "<name>" and "<email>"
	Then  Enter the "<message>"
	Then  Click on submit Button
	
	Examples:
	|name|email|message|
	|shivani|shivani@gmail.com|Hello shivani|
    
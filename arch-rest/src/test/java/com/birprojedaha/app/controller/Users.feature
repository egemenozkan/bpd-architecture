Feature: Users api test

	Background:
	* url 'http://localhost:8080'

	Scenario: Test Users Get API
		Given path  '/users/1'
		When method GET
		Then status 200
		
		Scenario: Test Users POst API
		  Given path '/users'
		  And request { firstName: 'Egemen', lastName: 'Ozkan' }
		  When method post
		  Then status 200
		

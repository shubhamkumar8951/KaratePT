
Feature: PT testing


Scenario: Test get request
* url 'https://jsonplaceholder.typicode.com/'
Given path 'users'
When method GET
Then status 200
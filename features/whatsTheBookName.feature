Feature: Get search results based on any book parameter
Description Test search functionality based on Plot/Year/Author/Quotes/Trivia/character Images

Scenario: Verify search functionality to get books
	Given the user launch the web browser
	And the user navigates to "https://readbooks.com"
	And login with email "ssaaii4499@gmail.com" and password "Test@123"
	When user enter value in console, search with that text and display results in console
	Then save the whole search data and results in bookNames excel sheet
Feature: Feature to test google search functionality
Scenario: Validate google search is working

Given Browser is open
And user is on google search page
When user enters a text in search box
And hits enter
Then user is navigated to search results
And Click on the dunnes link
Then Accept the Cookies
And Search Bag in the search bar
Then Click on the bag link
And Select the size of the bag
Then click on Add to Cart
And Click on Go to Bag
Then Go to checkout Page

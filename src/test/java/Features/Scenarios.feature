Feature: Automate all the given scenarios in the amazon app

	
@categoryResultCount
Scenario:
Check the total displayed number of results for category Smart Home Televisions
	Given Click on Shop by Department from burger menu
	When Choose category Electronics, Choose subcategory category TV & VIDEO, Filter with Smart TV and click show results
	Then Check the total number of results match the total displayed in filter

Feature: Automate category result count, product price currency and Product details in the amazon app

	
@categoryResultCount
Scenario:
Check the total displayed number of results for category Smart Home Televisions
	Given Click on Shop by Department from burger menu
	When Choose category Electronics, Choose subcategory category TV & VIDEO, Filter with Smart TV and click show results
	Then Check the total number of results match the total displayed in filter
	
	
@productPriceCurrency
Scenario:
Assert on selected currency displayed for Deals and Promotions products
	Given Go to Currency Settings, Select Country & Language
	When Change currency from USD to AED, Save changes
	Then Assert on selected currency displayed for Deals and Promotions products
	

@productDetails
Scenario:
Check Product Detail Page image swipe, Payments Option, Pricing, Stock, Add to Cart
	Given Tap on the Search bar and search for "Apple", Tap the picture of the product and swipe Left to Right
	When The price of the product is displayed, Verify payment options are displayed
	Then Verify out of stock or in stock, information is showing on the page, Tap and verify add to cart feature
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Automate category result count, product price currency and Product details in the amazon app",
  "description": "",
  "id": "automate-category-result-count,-product-price-currency-and-product-details-in-the-amazon-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 21,
  "name": "",
  "description": "Check Product Detail Page image swipe, Payments Option, Pricing, Stock, Add to Cart",
  "id": "automate-category-result-count,-product-price-currency-and-product-details-in-the-amazon-app;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@productDetails"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Tap on the Search bar and search for \"Apple\", Tap the picture of the product and swipe Left to Right",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "The price of the product is displayed, Verify payment options are displayed",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Verify out of stock or in stock, information is showing on the page, Tap and verify add to cart feature",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple",
      "offset": 38
    }
  ],
  "location": "ProductDetail.tap_on_the_search_bar_and_search_for_something_tap_the_picture_of_the_product_and_swipe_left_to_right(String)"
});
formatter.result({
  "duration": 60658176767,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetail.the_price_of_the_product_is_displayed_verify_payment_options_are_displayed()"
});

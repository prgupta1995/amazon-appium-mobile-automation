$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Automate all the given scenarios in the amazon app",
  "description": "",
  "id": "automate-all-the-given-scenarios-in-the-amazon-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Check the total displayed number of results for category Smart Home Televisions",
  "id": "automate-all-the-given-scenarios-in-the-amazon-app;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@categoryResultCount"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Click on Shop by Department from burger menu",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Choose category Electronics",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Choose subcategory category TV \u0026 VIDEO",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Filter with Smart TV and click show results",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Check the total number of results match the total displayed in filter",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoryResultCount.click_on_shop_by_department_from_burger_menu()"
});
formatter.result({
  "duration": 23897866218,
  "status": "passed"
});
formatter.match({
  "location": "CategoryResultCount.choose_category_electronics()"
});
formatter.result({
  "duration": 29970,
  "status": "passed"
});
formatter.match({
  "location": "CategoryResultCount.choose_subcategory_category_tv_video()"
});
formatter.result({
  "duration": 39285,
  "status": "passed"
});
formatter.match({
  "location": "CategoryResultCount.filter_with_smart_tv_and_click_show_results()"
});
formatter.result({
  "duration": 23139,
  "status": "passed"
});
formatter.match({
  "location": "CategoryResultCount.check_the_total_number_of_results_match_the_total_displayed_in_filter()"
});
formatter.result({
  "duration": 43389,
  "status": "passed"
});
});
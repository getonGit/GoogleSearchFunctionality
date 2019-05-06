$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchTests.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can search any string on Google search bar",
  "description": "",
  "id": "google-search;user-can-search-any-string-on-google-search-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the Google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User types a String into the search field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks the Enter key on the keyboard",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is able to see search results and quits",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_the_Google_home_page()"
});
formatter.result({
  "duration": 8092823676,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_types_a_String_into_the_search_field()"
});
formatter.result({
  "duration": 465742688,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_clicks_the_Enter_key_on_the_keyboard()"
});
formatter.result({
  "duration": 1277035063,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_able_to_see_search_results_and_quits()"
});
formatter.result({
  "duration": 664444992,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Search does not show any test results",
  "description": "",
  "id": "google-search;user-search-does-not-show-any-test-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on the Google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User types an invalid String into the search field",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User is not able to see any test results and quits the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_the_Google_home_page()"
});
formatter.result({
  "duration": 10739018521,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_types_an_invalid_String_into_the_search_field()"
});
formatter.result({
  "duration": 398172817,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_not_able_to_see_any_test_results_and_quits_the_browser()"
});
formatter.result({
  "duration": 1478835308,
  "status": "passed"
});
});
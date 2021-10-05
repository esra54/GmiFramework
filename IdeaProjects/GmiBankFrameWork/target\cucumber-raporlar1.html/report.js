$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/homepage.feature");
formatter.feature({
  "name": "User navigates to homepage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homepage"
    }
  ]
});
formatter.scenario({
  "name": "User should navigate to homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homepage"
    }
  ]
});
formatter.step({
  "name": "User navigates \"gmibankurl\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on iconAccountMenu",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
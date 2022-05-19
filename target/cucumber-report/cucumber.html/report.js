$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9314543700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"Satandard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \u0027high to low\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"ZipPostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 178585700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Satandard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 64
    }
  ],
  "location": "MyStepdefs.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 468337100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 20368931100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iFilterTheProductsByPriceHighToLow()"
});
formatter.result({
  "duration": 303944600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 260271800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iOpenShoppingCart()"
});
formatter.result({
  "duration": 113052400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iGoToCheckout()"
});
formatter.result({
  "duration": 20160013700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "ZipPostalCode",
      "offset": 78
    }
  ],
  "location": "MyStepdefs.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 652846100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnContinueButton()"
});
formatter.result({
  "duration": 20133223300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnFinishButton()"
});
formatter.result({
  "duration": 20194297800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 83155800,
  "status": "passed"
});
});
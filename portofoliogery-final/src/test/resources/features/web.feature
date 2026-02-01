
Feature: Web Automation

Scenario: Open homepage
  Given user open homepage
  Then login success

Scenario: Login success
  Given user open homepage
  When user login with valid credential
  Then login success

Scenario: Login invalid (Negative)
  Given user open homepage
  When user login with invalid credential
  Then login failed

Scenario: Add product to cart
  Given user open homepage
  When user add product to cart
  Then login success

Scenario: End to End Checkout
  Given user open homepage
  When user login with valid credential
  And user add product to cart
  And user checkout product
  Then checkout success

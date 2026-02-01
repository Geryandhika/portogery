
Feature: API Automation

Scenario: Get all users
  Given user hit get all users api
  Then api response success

Scenario: Get user by id
  Given user hit get user by id
  Then api response success

Scenario: Create new user
  Given user create new user
  Then api response success

Scenario: Update user
  Given user update user data
  Then api response success

Scenario: Get user invalid id (Negative)
  Given user hit get user with invalid id
  Then api response error

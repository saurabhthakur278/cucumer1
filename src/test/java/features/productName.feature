Feature: Seaech the place and order for product

 Scenario: Search experiance for product name in both landing and offer page
    Given User is o greencart landing page
    When User search for short name "Tom" and got actual name of product
    Then User search for "tom" tomshort name in offerpage and find actual name of product
    And productname of landingpage and offerpage is similer

Feature: As a user i want to be able play blackjack api and check who wins

  Scenario: Checking for Blackjack
    Given I send GET request to "https://deckofcardsapi.com/"
    And status code is 200
    When I get a new deck
    And I shuffle the deck
    When I deal 3 cards to each of 2 players
    Then I check whether either player has blackjack
    And I display the winning player if any

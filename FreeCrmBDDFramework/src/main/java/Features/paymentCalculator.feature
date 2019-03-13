Feature: payment calculator

Scenario Outline: payment due now

Given customer has a minimum payment "<minPayment>" to make
When customer has arrears "<arrears>"
Then make the payment "<expPayment>" now

Examples:
	| minPayment | arrears | expPayment |
	|	 £10	 | 	 £40   |      30    |
	|	 £50	 | 	 £50   |      50    |
	|	£150	 | 	£340   |     190    |
	|	£160 	 | 	 £25   |     135    |
	|	£170	 | 	 £10   |     160    |
	
Scenario: payment due later

Given customer has a minimum payment "£50" to make
When customer has arrears "£100"
Then make the payment later
	| balance   | expResult |
	|   100		|	 100	|
	|   500		|   500		|
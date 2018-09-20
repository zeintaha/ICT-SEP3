 SDJ3 Exercises 4
Exercise 4.1 – Bank case
A small bank has a headquarters and two branches. The bank has a number of customers and accounts, according to the following business rules:
•	Customers are identified by cpr number
•	Customers are not assumed to change name, but may move to another address
•	All accounts are owned by a customer 
•	All accounts are settled in a certain currency
•	All accounts allow for the following transactions
o	Deposit an amount
o	Withdraw an amount
o	Transfer an amount to another account
•	All transactions need to be saved with a timestamp of when they occurred
•	Transactions in a wrong currency for the account needs to be exchanged according to the exchange rates in the headquarters

a)	Create a domain model for the application. 
b)	Design a 3-tier architecture for the application. 
Tier 1 is the clients at the branches. Tier 2 is the servers at the branches. Tier 3 is the server at the headquarters.
c)	Implement the application using RMI.

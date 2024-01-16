# DIO-Java-Formation-Challange-BankAccount

Here is a translation to English:

## Syntax - Challenge

Let's practice all the content presented in the Syntax module by coding the following scenario.

1. Create the `BankAccount` project that will receive data via the terminal containing the characteristics of a bank account with the attributes below.
2. Within the project, create the `ConsoleAccount.java` class to perform all the coding for our program.

###### Review variable declaration rules

| Attribute  | Type     | Example   
| --------- | ---------| ------- 
| Number    | Integer  | 1021 
| Agency   | Text    | 067-8
| Customer Name | Text    | MARIO ANDRADE
| Balance | Decimal |237.48


###### Review terminal, main args, and the Scanner class
2. Allow the data to be entered via the terminal, where the user will receive a message indicating which information is requested. For example:

* Program: "Please enter the Agency number!"
* User: 1021 *(press ENTER for the next field)* 

###### Review concatenation and String class with the concat method

3. After all the information has been entered, the system should display the following message:

*"Hello [Customer Name], thank you for creating an account with our bank. Your agency is [Agency], account [Number], and your balance [Balance] is already available for withdrawal."*

The fields in [ ] should be replaced with the information entered by the users.

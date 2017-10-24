# Supermarket-Checkout

Demo of Supermarket with simple checkout mechanism

### Business requirements:
- Design and implement supermarket checkout component with readable API that calculates the total price of a number of items.
- Checkout mechanism can scan items and return actual price (is stateful)
- Our goods are priced individually. In addition, some items are multi-priced: "buy n of them, and they’ll cost you y cents"
 
  |Item  | Unit Price |  Special Price |
  |:----:|-----------:|---------------:|
  |  A   |  40        | 3 for 70       |
  |  B   |  10        | 2 for 15       | 
  |  C   |  30        |                |
  |  D   |  25        |                |
 
 
### We value:
- simple, elegant code that reads like a narrative – don't overcomplicate
- excellent testing that acts as documentation
- challenging boundaries where necessary
 
### Additional notes:
- use maven or gradle build system
- make task available on the public GitHub
- if in doubt please document your design choice in README file


## Solutions
* Clone the repository: `https://github.com/kiran1552/Supermarket-Checkout.git`
* Fork the repository

### Prerequisites
To use the source files, you will need to have Maven installed globally. Project is built with 3.3.9 version of Maven.

#### To Start:
* Run `mvn clean install` in the root directory, wait untill dependency downloaded.
* open the `CheckoutIndividualPricedItemsTest.java` test class, run the test cases or run the whole class. This test class is design for getting the items total by their unit price. 
* open the `CheckoutMultiPricedItemsTest.java` test class, run the test cases or run the whole class. This test class is design for getting the items total by their unit price and special price.

## Acknowledgments
Backend backed by:
* [Java]()        - Core Java with java 8 features
* [Maven 3.3]()   - as a build tool


Tested by:
* [JUnit 4]()     - Core testing lib


Belt tool:
* [IntelliJ]()    - as main IDE tool
* [Git]()         - as version source control
* [Github]()      - as repository platform


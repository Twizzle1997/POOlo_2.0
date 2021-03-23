# POOlo 2.0 

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Installation](#installation)
* [Usage](#usage)
  * [Settings](#settings)

<!-- ABOUT THE PROJECT -->
## About The Project

### Built With

* [Java](https://www.java.com/fr/)
* [TestNG](https://testng.org/doc/)
* [Maven](https://maven.apache.org/)

<!-- GETTING STARTED -->
## Getting Started

Get a local copy up and running following these steps.

### Installation

1. Clone the repository :

    ```sh
    git clone https://github.com/Twizzle1997/POOlo_2.0
    ```
    
2. Make sure to install testNG, Maven and it's [surefire plugin](https://maven.apache.org/surefire/maven-surefire-plugin/).


<!-- USAGE EXAMPLES -->
## Usage

* Start the tests :
    ```sh
     mvn clean test
    ```
* All the reports will appear into the [src/test/reports](https://github.com/Twizzle1997/POOlo_2.0/blob/main/src/test/reports) directory.  
* Open the generated html report [index.html](https://github.com/Twizzle1997/POOlo_2.0/blob/main/src/test/reports/index.html):
    ```sh
    start src\test\reports\index.html
    ```

### Settings
* [src > test > java > classes](https://github.com/Twizzle1997/POOlo_2.0/blob/main/src/test/java/classes) contains the java unit test classes.   
* [src > test > testng.xml](https://github.com/Twizzle1997/POOlo_2.0/blob/main/src/test/testng.xml) to edit the test suite.   
* [pom.xml > maven-surefire-plugin](https://github.com/Twizzle1997/POOlo_2.0/blob/main/pom.xml) :  
   - ```<suiteXmlFiles>``` to add test suites ;  
   - ```<reportsDirectory>``` to change the reports' target directory.


# AmazonSignIn

This repository contains a Selenium-based automation framework for testing the Amazon Sign-In page using TestNG and Allure for reporting.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java JDK 8 or higher installed
- Maven installed
- Git installed
- Firefox browser installed

## Installation

1. Clone the repository

```bash
git clone https://github.com/Abdul-Firoz-Khan/AmazonSignIn.git
cd AmazonSignIn
```

2. Install the project dependencies

```bash
mvn clean install
```

## Running the Tests

1. Navigate to the project directory
2. Execute the tests using Maven

```bash
mvn test
```

This will run the TestNG tests and generate an Allure report.

## Project Structure

The project structure is as follows:

```plaintext
src
└── test
    └── java
        └── com
            └── afk
                ├── task
                │   ├── MasterPage.java
                │   └── SignInPage.java
                └── utils
                    └── I1.java
```

### MasterPage.java

Contains the test cases for loading the URL, checking the page status for specific text, and navigating to the Sign-In page.

### SignInPage.java

Contains the method to create a new account by clicking the create account button.

### I1.java

Utility class that contains common properties and methods used across the tests.

## Allure Reporting

To generate and view the Allure report, follow these steps:

1. Run the tests with Maven:

```bash
mvn test
```

2. Generate the Allure report:

```bash
mvn allure:report
```

3. Serve the Allure report:

```bash
mvn allure:serve
```

## TestNG Configuration

The `testng.xml` file is configured to include the Allure TestNG listener and specify the test classes and methods to run.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <listeners>
        <listener class-name="io.qameta.allure.testng.AllureTestNg"/>
    </listeners>
    <test verbose="2" preserve-order="true" name="AmazonSignIn Tests">
        <classes>
            <class name="com.afk.task.MasterPage">
                <methods>
                    <include name="checkStatus"/>
                    <include name="SignInPage"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
```

## Contributing

If you want to contribute to this project, please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-foo`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add feature foo'`)
5. Push to the branch (`git push origin feature-foo`)
6. Create a pull request

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

Abdul Firoz Khan - [GitHub](https://github.com/Abdul-Firoz-Khan)
```

You can adjust and expand the sections as necessary to fit the specifics and future updates of your project.

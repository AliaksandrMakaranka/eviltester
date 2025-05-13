# EvilTester

A Java-based web testing framework using Selenium WebDriver for automated testing.

## Project Description

This project is designed for automated web testing using Selenium WebDriver. It provides a foundation for writing and executing automated tests for web applications.

## Technologies Used

- Java 17
- Selenium WebDriver 4.18.1
- WebDriverManager 5.7.0
- JUnit Jupiter 5.10.2

## Project Structure

```
src/
├── main/java/com/eviltester/
│   └── Main.java
└── test/java/com/eviltester/
    └── (test files)
```

## Setup Instructions

1. Ensure you have Java 17 or later installed
2. Clone this repository
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Running Tests

To run the tests, use the following Maven command:
```bash
mvn test
```

## Dependencies

- Selenium WebDriver: For browser automation
- WebDriverManager: For managing WebDriver binaries
- JUnit Jupiter: For test framework

## License

This project is licensed under the MIT License. 
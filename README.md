# Automated CI/CD Pipeline for Multiple Frameworks

This repository contains automated CI/CD pipelines for five popular testing frameworks: Nightwatch, Postman, Rest Assured, JMeter, and Selenium. The pipelines are set up using GitHub Actions, ensuring that tests are automatically executed upon code changes, pull requests, or releases. This document provides an overview of the frameworks and instructions on how to run the pipeline.

## GitHub Actions Overview

GitHub Actions is a powerful automation tool that allows you to automate, customize, and execute your software development workflows right in your GitHub repository. With GitHub Actions, you can build, test, and deploy your code right from GitHub. You can discover, create, and share actions to perform any job you'd like, including CI/CD, and combine actions in a workflow. Workflows are custom automated processes that you can set up in your repository to build, test, package, release, or deploy any code project on GitHub.

## Frameworks Overview

### Nightwatch

Nightwatch.js is an end-to-end testing solution for browser-based apps and websites. It uses the powerful WebDriver API to perform commands and assertions on DOM elements. Nightwatch tests can be written in JavaScript and run against any web application.

- **Official Documentation**: [Nightwatch.js Documentation](https://nightwatchjs.org/gettingstarted/about/)
- **Trigger Command**: To run Nightwatch tests, use the following commands based on the browser you want to test with:
 - For Firefox:
     ```bash
    npx nightwatch tests/specs/basic/ecosia.js --env selenium.firefox
     ```
 - For Chrome:
     ```bash
    npx nightwatch tests/specs/basic/ecosia.js --env selenium.chrome
     ```
 - For Safari:
     ```bash
    npx nightwatch tests/specs/basic/ecosia.js --env selenium.safari
     ```

### Postman

Postman is a popular API testing tool that allows developers to test, develop, and document APIs. It supports various types of API requests and provides features for automated testing, documentation, and collaboration.

- **Official Documentation**: [Postman Documentation](https://learning.postman.com/)
- **Trigger Command**: Postman tests are typically run through the Postman app or via Newman, Postman's command-line collection runner.
 For example, to run a collection with Newman, use -
 ```bash
    newman run <collection-name>.json
 ```

### Rest Assured

Rest Assured is a Java library used for testing RESTful web services. It simplifies the process of writing tests for RESTful APIs by providing a fluent interface for making HTTP requests and validating responses.

- **Official Documentation**: [Rest Assured Documentation](https://rest-assured.io/)
- **Trigger Command**: To run Rest Assured tests, you would typically use Maven or Gradle. For Maven, the command is `mvn test`.

### JMeter

Apache JMeter is an open-source software designed to load test functional behavior and measure performance. It can be used to simulate heavy loads on a server, group of servers, network, or object to test its strength or to analyze overall performance under different load types.

- **Official Documentation**: [Apache JMeter Documentation](https://jmeter.apache.org/usermanual/index.html)
- **Trigger Command**: To run JMeter tests, you can use the JMeter GUI or run it in non-GUI mode from the command line. For non-GUI mode, the command is `jmeter -n -t <test-plan>.jmx` [3].

### Selenium

Selenium is a suite of tools for automating web browsers. It provides a way to write tests in various programming languages like Java, C#, Python, etc., which can be run against different browsers and operating systems.

- **Official Documentation**: [Selenium Documentation](https://www.selenium.dev/documentation/en/)
- **Trigger Command**: Selenium tests can be run using various tools and frameworks. For example, with Maven, the command is 
   ```bash
    mvn clean test
   ```
## Running the CI/CD Pipeline

To run the CI/CD pipeline, follow these steps:

1. **Clone the Repository**: First, clone the repository to your local machine using `git clone <repository-url>`.

2. **Install Dependencies**: Navigate to each framework's directory and install the necessary dependencies. For example, for Nightwatch, you would run `npm install` in the Nightwatch directory.

3. **Configure GitHub Actions**: Ensure that the GitHub Actions workflow file (`Automate Pipeline.yml`) is correctly set up in the `.github/workflows` directory. This file defines the steps to run the tests for each framework.

4. **Trigger the Pipeline**: Push your changes to the repository, create a pull request, or trigger the pipeline manually through the GitHub Actions tab in your repository.

5. **Monitor the Pipeline**: Check the GitHub Actions tab for the status of your pipeline. You can view logs and results for each step of the pipeline.

## Additional Information

- **Documentation**: For detailed documentation on each framework, refer to the official documentation links provided in the README files within each framework's directory.

This repository aims to provide a comprehensive testing environment for developers, automating the testing process for various frameworks to ensure code quality and reliability.

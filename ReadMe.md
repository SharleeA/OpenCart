# OpenCard Demo UI Tests
## About
This is a demo UI Maven test project for the OpenCart website. It uses java, Cucumber, Selenium webDriver, and is built in the Intellij IDEA 2021.3.1 (Community Edition).
The tests will be executed locally in a Chrome browser.

## Prerequisites
1. Have openjdk version 11.0.00 installed
2. Have Intellij installed
3. Enable Gherkin and Cucumber for java in your Intellij
4. Configured Intellij maven to point to the .m2 folder in your local repository. 
5. Have the right version of chromedriver.exe downloaded in the "webdrivers" folder. The current driver supports Chrome version 102.0.5005.


## How to setup the project
1. Clone this project from https://github.com/SharleeA/OpenCart.git
2. From Intellij run maven clean install to download the dependencies and build the project for the first time.
3. Subsequently, you can right-click the "src/test/java/testRunner/TestRunner.java" file and select "Run 'testRunner'" option.
4. Test result report can be found at "target/reports/report.html".


## I have chosen the three most basic tests for this account registration function:
1. Check error message raised if registering with an invalid credential.
2. Check user can create an account with a unique email.
3. Check user can log into their account using a valid credential.

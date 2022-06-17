# OpenCard Demo UI Tests
# About
This is a domo UI test project for the OpenCart website. It is a java Cucumber project using Selenium webDriver, built in the Intellij IDEA 2021.3.1 (Community Edition).
The tests will be executed locally in a Chrome browser.

# prerequisite
1. Have openjdk version 11.0.00 installed
2. Have Intellij installed
3. Enable Gherkin and Cucumber for java in your Intellij
4. Configured Intellij maven to point to the .m2 folder in your local repository. 
5. Have the right version of chromedriver.exe downloaded in the webdrivers folder. The current webdriver.exe support Chrome version 102.0.5005.


## How setup this project
1. clone this project form https://github.com/SharleeA/OpenCart.git
3. from Intellij run maven clean install to download the dependencies and build the project for the first time.
4. right-click the src/test/java/testRunner/TestRunner.java file and select "Run 'testRunner'" option.
5. test result report can be found at "target/reports/report.html".

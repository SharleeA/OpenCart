### Q:  How long did you spend on the technical test? What would you add to your solution if you had more time? If you didn't spend much time on the technical test then use this as an opportunity to explain what you would add.
A: I spent about 5hrs to set up the framework and script the tests. If I had more time I would use pageFactory to improve scalability and maintainability.

I would include other commonly used browsers for the e-commerce website. 
Consider parallelization if a large number of tests need to be run in a short period of time. 

I would use config files for system variables and application variables, so I do not hard code values in my tests.


I would also implement "Implicit Wait" at some stage if the execution became unreliable. However, it is running fine for now.
#


### Q: What do you think is the most interesting trend in test automation?
A: Automation tests have become increasingly popular in recent years and development teams are moving into DevOps.
#



### Q: How would you implement test automation in a legacy application? Have you ever had to do this?
A: In general, automation is an investment for any application. Automation is not ideal for applications that have already reached the end of their lifecycle.
For critical legacy applications, it is best to test the software's logic tier, because it is most unlikely to change compared to its presentation tier. There are tools for API testing, such as SoapUI, Jmeter, and RestAssured.

I have never needed to build new scripts for a legacy system. I have supported existing scripts built for legacy systems.

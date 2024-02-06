# Bird Bank - Selenium Automation UI Framework

Bird Bank is Java based clean code Selenium UI automation framework architected using several useful design patterns

## Software Dependencies

<table>
  <thead align="left">
    <tr border: 2 px;>
      <td><b>Dependency</b></td>
      <td><b>Version</b></td>
      <td><b>Feature</b></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Selenium</b></td>
      <td><b>4.13.0</b></td>
      <td><b>End to End Browser Automation</b></td>
    </tr>
    <tr>
      <td><b>TestNG</b></td>
      <td><b>7.4.0</b></td>
      <td><b>The Test Runner to execute suite</b></td>
    </tr>
    <tr>
      <td><b>Apache POI</b></td>
      <td><b>5.2.3</b></td>
      <td><b>Read Excel files for test data</b></td>
    </tr>
    <tr>
      <td><b>Data Faker</b></td>
      <td><b>1.6.0</b></td>
      <td><b>Create runtime fake test data</b></td>
    </tr>
    <tr>
      <td><b>Owner</b></td>
      <td><b>1.0.12</b></td>
      <td><b>Minimize the properties file code</b></td>
    </tr>
    <tr>
      <td><b>Extent Reports</b></td>
      <td><b>3.1.5</b></td>
      <td><b>The HTML reporting library</b></td>
    </tr>
  </tbody>
</table>

## Design Patterns Used

 * <b>Factory Pattern</b> is used to reuse existing browser contexts instead of rebuilding them each time.
 * <b>Bridge pattern</b> is used to switch implementations between UI at runtime.
 * <b>Decorator pattern</b> is used to assign extra behaviors like highlight, retry to pages & elements at runtime without breaking the code that uses these objects.
 * <b>Chain of Responsibility pattern</b>is used to navigate from a pattern/page to other.
 * <b>Observer pattern</b> is used to switch to different data and added wait on failure when retried.

## Framework - How to design new test cases using this framework?

* <b>Step 1:</b> Use the main source for the framework design.
* <b>Step 2:</b> Refer the test source for the sample test code (Bird Bank).
* <b>Step 3:</b> Build your pages like the sample using the right method and locator.
* <b>Step 4:</b> Use the test data in your tests from faker or excel.
* <b>Step 5:</b> Build your tests using the pages.
* <b>Step 6:</b> Once ready, run in the debug mode and look at the logs for details.


## Amazing Use cases Built for this Framework

<details><summary>Debug Faster with Snaps with configurable options</summary>
<ul>
 </br>
<li>
    &emsp; Reporter </b> provides full/partial snaps with Configuration only on failures
  
</li>
<li>
    &emsp; Our framework allows configuration for framework user to enable on demand for every run or failures.
</li>
  </br>

   ```java
   #snapshot - when? always | only on failure 
   snap.action = only-on-failure
  ```
</ul>
</details>
<details><summary>Automated logins to avoid too many login tests</summary>
<ul>
 </br>
<li>
    &emsp;Configurable automated logins</b> can avoid unnecessary login tests through storing the state of the user.
</li>
<li>
    &emsp;The user can either use the existing login storage or decide to login automated through configuration.
</li>
  </br>

  ```java
  # Auto Login
  auto.login = true
  ```
</ul>
</details>
<details><summary> Automated retries with different data with added wait</summary>
<ul>
 </br>
<li>
    &emsp;Configurable retries</b> with different wait using the TestNG listener upon failure of the earlier data.
</li>
  </br>

  ```java
# The different pause timers 
pause.low = 1000
pause.medium = 5000
pause.high = 10000
  ```
</ul>
</details>
<details><summary> Automated test data generation </summary>
<ul>
 </br>
<li>
    &emsp;Java Faker</b> is used to generate random test data for TC's.
</li>
  </br>
   ```java
	faker.number().randomNumber(5, false);	
  ```  
</ul>
</details>

## Framework - How does it execute tests?

* <b>Step 01:</b> Run the Test cases using TestNG xml File (testng_Parallel (or) testng_Sequential) --> Click --> Run as TestNG 
* <b>Step 02:</b> The testng annotations (@Before) initialize the setup.
* <b>Step 03:</b> The Selenium script invokes the browser and actions.
* <b>Step 04:</b> Simulatenously, the reporting engine captures the result.
* <b>Step 05:</b> Upon success completion reports are published under reports Folder.
* <b>Step 06:</b> Upon failure, the testng retry is invoked with additional wait.
* <b>Step 07:</b> Step 02 - 06 continues until success or max retries.
* <b>Step 08:</b> Look at the results folder for html results.

## Upcoming Enhancements with this Framework

 * <b>BDD Adoption </b> can integrate the Cucumber BDD with this Framework using the Existing modules
 * <b>CI/CD Integration</b> Framework to be pushed into GIT integrated to Jenkins to acheive CI/CD.


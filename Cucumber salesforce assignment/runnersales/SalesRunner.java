package runnersales;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/salesforce/salesforce.feature",glue="salesforstepdefinition",publish=true)
public class SalesRunner extends  AbstractTestNGCucumberTests {

}

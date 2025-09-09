package runneraccountsales;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/salesaccount/salesaccount.feature" , glue="salesaccountdefinition",publish=true)
public class RunnerSales extends AbstractTestNGCucumberTests{

}

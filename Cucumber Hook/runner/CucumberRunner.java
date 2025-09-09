package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue={"stepdefinition","hooksImplementation"},publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}

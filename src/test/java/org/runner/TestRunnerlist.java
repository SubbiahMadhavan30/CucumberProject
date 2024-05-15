package org.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefilelist",
glue="org.listmapstepsdef",tags ="@smoke",dryRun=false)
public class TestRunnerlist {

}

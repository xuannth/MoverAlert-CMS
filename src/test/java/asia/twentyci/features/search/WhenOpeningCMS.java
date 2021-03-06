package asia.twentyci.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import asia.twentyci.steps.serenity.DashboardSteps;
import asia.twentyci.steps.serenity.LoginCMSSteps;
import asia.twentyci.steps.serenity.ReportSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenOpeningCMS {
	
	@Managed
	WebDriver driver;
	
	@Steps 
	LoginCMSSteps atLoginCMSSteps;
	
	@Steps 
	DashboardSteps atDashboardSteps;
	
	@Steps 
	ReportSteps atReportSteps;
	
	@Test
	public void open_cms() {
		
		String useremail = "admin@twentyea.co.uk";
		String password = "Password123!";
		String startdate = "01/12/2020";
		String enddate = "31/12/2020";

		atLoginCMSSteps.openCMS();
		atLoginCMSSteps.loginCMSWith(useremail, password);
		atDashboardSteps.clickOnReport();
		atReportSteps.CreateReportWith(startdate,enddate);
	}

}

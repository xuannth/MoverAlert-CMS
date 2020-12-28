package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.DashboardPage.REPORT_LINK;
import asia.twentyci.pages.DashboardPage;


public class DashboardSteps {

	DashboardPage onDashboard;
	
	public void clickOnReport() {
		onDashboard.find(REPORT_LINK).click();
	}
}

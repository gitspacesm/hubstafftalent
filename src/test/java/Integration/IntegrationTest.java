package Integration;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import ObjectRepo.HomePage;
import ObjectRepo.JobsPage;
import ObjectRepo.LoginPage;

public class IntegrationTest extends BaseClass
{
    // Create Job → Posted Jobs
    @Test(groups = "IT")
    public void verifyCreatedJobInPostedJobs() throws Exception
    {
        LoginPage lp = new LoginPage(driver);

        lp.loginToApplication(propUtil.getData("employerUsername"),propUtil.getData("employerPassword"));

        HomePage hp = new HomePage(driver);
        hp.getPostJob().click();

        JobsPage jp = new JobsPage(driver);

        String jobTitle = propUtil.getData("jobTitle");

        jp.createJob(jobTitle);
        jp.getSubmitButton().click();

        hp.getPostJob().click();

        jp.getSearchJob().sendKeys(jobTitle);
        jp.verifyCreatedJob();
    }

	   	    
    @Test(groups = "IT")
    public void searchJobAndApply() throws Exception
    {
        LoginPage lp = new LoginPage(driver);

        lp.loginToApplication(
        		propUtil.getData("candidateUsername"),
                propUtil.getData("candidatePassword"));

        HomePage hp = new HomePage(driver);
        hp.getBrowserJobsLink().click();

        JobsPage jp = new JobsPage(driver);

        String jobTitle = propUtil.getData("jobTitle");

        jp.getSearchJob().sendKeys(jobTitle);
        jp.getSearchButton().click();
        jp.getJobResult().click();
        jp.getApplyButton().click();
        jp.verifyApplicationSuccess();
    }
    
    
    
}
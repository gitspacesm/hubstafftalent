package Smoke;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import ObjectRepo.HomePage;
import ObjectRepo.JobsPage;
import ObjectRepo.LoginPage;

public class SmokeTest extends BaseClass
{
    @Test(groups = "ST")
    public void searchJob() throws Exception
    {
        HomePage hp = new HomePage(driver);
        hp.getBrowserJobsLink().click();

        JobsPage jp = new JobsPage(driver);

        String keyword = propUtil.getData("jobKeyword");

        jp.getSearchJob().sendKeys(keyword);
        jp.getSearchButton().click();

        jp.verifyJobResults(keyword);
    }

    @Test(groups = "ST")
    public void verifyPostedJobs() throws Exception
    {
        LoginPage lp = new LoginPage(driver);

        String username = propUtil.getData("employerUsername");
        String password = propUtil.getData("employerPassword");

        lp.loginToApplication(username, password);

        HomePage hp = new HomePage(driver);
        hp.getPostJob().click();

        JobsPage jp = new JobsPage(driver);

        jp.verifyJobResults(password);
    }
}
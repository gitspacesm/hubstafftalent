package SystemTest;

import org.testng.annotations.Test;

import BaseTest.BaseClass;
import ObjectRepo.HomePage;
import ObjectRepo.JobsPage;
import ObjectRepo.LoginPage;

public class SystemTest extends BaseClass
{
    @Test(groups = "ST")
    public void verifyEmployerProfile() throws Exception
    {
        try
        {
            System.out.println("STEP 1: Login");

            LoginPage lp = new LoginPage(driver);

            lp.loginToApplication(
                    propUtil.getData("candidateUsername"),
                    propUtil.getData("candidatePassword"));


            System.out.println("STEP 2: Open Jobs");

            HomePage hp = new HomePage(driver);

            hp.getBrowserJobsLink().click();


            System.out.println("STEP 3: Search Job");

            JobsPage jp = new JobsPage(driver);

            jp.getSearchJob().sendKeys(
                    propUtil.getData("jobTitle"));

            jp.getSearchButton().click();


            System.out.println("STEP 4: Open Job");

            jp.getJobResult().click();


            System.out.println("STEP 5: Open Employer Profile");

            jp.getEmployerProfile().click();


            System.out.println("STEP 6: Verify Employer Profile");

            jp.verifyEmployerProfile();


            System.out.println("TEST PASSED");

        }
        catch(Exception e)
        {
            System.out.println("====================================");
            System.out.println("TEST FAILED");
            System.out.println("ERROR MESSAGE: " + e.getMessage());
            System.out.println("====================================");

            e.printStackTrace();

            throw e;
        }
    }
}
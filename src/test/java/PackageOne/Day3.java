package PackageOne;

import org.testng.annotations.*;

public class Day3 {
@BeforeClass
public void beforeclas()
{
    System.out.println("Before executing any method in the class");
}
    @Parameters({"URL","APIKey/Username"})
    @Test
    public void WebloginCarLoan(String urlname,String key)
    {
        System.out.println("WebLoginCar");
        System.out.println(urlname);
        System.out.println(key);
    }
    @BeforeMethod
    public void beforeevery()
    {
        System.out.println("I will execute before every test methods in day 3 class");
    }
    @AfterMethod
    public void afterevery()
    {
        System.out.println("I will execute after every test methods in day 3 class");
    }
    @AfterClass
    public void aftercls()
    {
        System.out.println("After executing all methods in the class");
    }
    @Test(groups = {"Smoke"})
    public void MobileloginCarLoan()
    {
        System.out.println("MobileLoginCar");
    }
    @BeforeSuite
    public void Bfsuite()
    {
        System.out.println("I am number 1");
    }
    @Test(enabled = false)
    public void MobileSigninCarLoan()
    {
        System.out.println("Mobile SignIn");
    }
    @Test(dataProvider = "getData")
    public void MobileSignoutCarLoan(String username,String password)
    {
        System.out.println("Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(password);

    }
    @Test(dependsOnMethods = {"WebloginCarLoan","MobileSignoutCarLoan"})
    public void APICarLoan()
    {
        System.out.println("APILoginCar");
    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0]= "firstsetusername";
        data[0][1]= "firstpassword";

        //2nd set
        data[1][0]="secondsetusername";
        data[1][1]="secondpassword";

        //3rd set
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";

        return data;

    }
}

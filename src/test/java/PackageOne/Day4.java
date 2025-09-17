package PackageOne;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @Parameters({"URL"})
    @Test
    public void WebloginHomeLoan(String uname)
    {
        System.out.println("WebLoginHomePersonalLoan");
        System.out.println(uname);
    }
    @Test(groups = {"Smoke"})
    public void MobileloginHomeLoan()
    {
        System.out.println("MobileLoginHome");
    }
    @Test
    public void LoginAPICarLoan()
    {
        System.out.println("APILoginHome");
    }
}

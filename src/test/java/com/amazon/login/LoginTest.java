package com.amazon.login;

import com.amazon.BaseTest;
import com.amazon.flow.LoginFlow;
import org.junit.jupiter.api.*;
import static com.amazon.utils.PopHelpers.closeCountryPopUpButton;

public class LoginTest extends BaseTest {

    private LoginFlow loginFlow = new LoginFlow(driver);


    @BeforeEach
    public void navigatePageAndZooming(){
        driver.get("https://www.amazon.de/-/en/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.de%2F%3F%26tag%3Dgoogdeaen-21%26ref%3Dnav_ya_signin%26adgrpid%3D79475470742%26hvpone%3D%26hvptwo%3D%26hvadid%3D394654852953%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D2160304654270229841%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D20235%26hvtargid%3Dkwd-10573980%26hydadcr%3D10627_1833238%26language%3Den_GB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=deflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);

    }

    @Test
    public void testMissingEmail(){
        loginFlow.clickContinueButton();
        //Thread.sleep(3000); chtobi yvidet' chto proishodit
        Assertions.assertTrue(loginFlow.isEmailMissingErrorDisplayed());
        Assertions.assertEquals(loginFlow.getMissingEmailErrorText(), "Enter your e-mail address or mobile phone number");


    }

    @Test
    public void testWrongEmail(){
        loginFlow.setEmailAppField("gfhdjsfghdgf");
        loginFlow.clickContinueButton();
        Assertions.assertTrue(loginFlow.isEmailWrongErrorDisplayed());
        Assertions.assertEquals(loginFlow.getWrongEmailErrorText(), "There was a problem");


    }

    @Test
    public void testSuccessLogin(){
        loginFlow.loginSuccess("alina@gmail.com");
        Assertions.assertFalse(loginFlow.isEmailWrongErrorDisplayed());
        Assertions.assertTrue(loginFlow.isFieldPasswordDisplayed());

    }

    @AfterEach
    public void clean(){
        driver.manage().deleteAllCookies();
    }


}

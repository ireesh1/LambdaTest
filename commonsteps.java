public class commonsteps extends web_platform

@And("^user click on input form submit under input forms$")
public void inputForm() throws Exception {
    platform.inputForm();
}

@And("^user should see (.*) title$")
public void validateFormTitle(String title) throws Exception {
    platform.validateFormTitle(title);
}

@And("^user enters name as (.*) email as (.*) password as (.*) company as (.*) country as (.*) City as (.*) Address 1 as (.*) address 2 as (.*) state as (.*) and zip code as (.*)$")
public void enterContactInformation(String name,String email, String password, String Country, String city,String address1,String address2,String state,String zipcode) throws Exception {
    platform.enterContactInformation(name,email,password,Country,city,address1,address2,state,zipcode);
}

@And("^user click on submit button$")
public void clickOnSubMitButton() throws Exception {
    platform.clickOnSubMitButton();
}
@And("^user should see Thanks for contacting us, we will get back to you shortly$")
public void verifySubmissionText(String subtext) throws Exception {
    platform.verifySubmissionText(subtext);
}
public class LamdatestPlatform implements Lambda_Platform
private LoginPage loginpage;

public LambdaPlatform(){
	driver = initDriver();
	initClasses(driver);

	public void initClasses(WebDriver driver){
	this.driver = driver;
	loginpage = new LoginPage(driver)

	}

	protected abstract WebDriver initDriver();


	@Override
    public void inputForm() throws Exception {
        waitUntilVisibilityOfElement(driver, loginPage.getInputForm());
        loginPage.getInputForm().click();
        loginPage.getInputFormSubmit().click();

    }

    @Override
    public void validateFormTitle(String title) throws Exception {
    waitUntilVisibilityOfElement(driver,loginPage.getTitlePage());
    Assert.assertEquals(title,loginPage.getTitlePage());
    }

    @Override
    public void enterContactInformation(String name, String email, String password, String Country, String city, String address1, String address2, String state, String zipcode) throws Exception {
        waitUntilVisibilityOfElement(driver, loginPage.getTitlePage());
        loginPage.getName().sendKeys(name);
        loginPage.getEmail().sendKeys(email);
        loginPage.getPassword().sendKeys(password);
        loginPage.getCountryDropDown().click();
        loginPage.getCountrySelection().click();
        loginPage.getCity().sendKeys(city);
        loginPage.getAddress1().sendKeys(address1);
        loginPage.getAddress2().sendKeys(address2);
        loginPage.getState().sendKeys(state);
        loginPage.getZipcode().sendKeys(zipcode);
    }

    @Override
    public void clickOnSubMitButton() throws Exception {
loginPage.getSubmitButton().click();
    }

    @Override
    public void verifySubmissionText(String subtext) throws Exception {
        waitUntilVisibilityOfElement(driver,loginPage.getEndMessage());
        Assert.assertEquals(subtext,loginPage.getEndMessage());
    }
}
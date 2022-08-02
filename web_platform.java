public abstract  class abstractstepdefinitions extends abstractsteps{
	
	protected web_platform platform;\

	
void inputForm() throws Exception;

void validateFormTitle(String title) throws Exception;

void enterContactInformation(String name,String email, String password, String Country, String city,String address1,String address2,String state,String zipcode) throws Exception;

void clickOnSubMitButton() throws Exception;

void verifySubmissionText(String subtext) throws Exception;

}
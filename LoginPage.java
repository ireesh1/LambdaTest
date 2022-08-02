public class LoginPage{

public WebElement getQrScanButton(){
    return driver.findElement(By.id("mobile:id/tab-qr"));
}

public WebElement getInputForm(){
    return driver.findElement(By.id("//body/div[@id='__next']/div[1]/section[2]"));
}

public WebElement getInputFormSubmit(){
    return driver.findElement(By.id("mobile:id/tab-qr"));
}

public WebElement getTitlePage(){
    return driver.findElement(By.id("mobile:id/tab-qr"));
}

public WebElement getName(){
    return driver.findElement(By.id("//input[@id='name']"));
}

public WebElement getEmail(){
    return driver.findElement(By.id("//input[@id='inputEmail4']"));
}

public WebElement getPassword(){
    return driver.findElement(By.id("//input[@id='inputPassword4']"));
}

public WebElement getCountryDropDown(){
    return driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/select[1]"));
}

public WebElement getCountrySelection(){
    return driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/select[1]/section[1]"));
}

public WebElement getCity(){
    return driver.findElement(By.id("//input[@id='inputCity']"));
}

public WebElement getAddress1(){
    return driver.findElement(By.id("//input[@id='inputAddress1']"));
}

public WebElement getAddress2(){
    return driver.findElement(By.id("//input[@id='inputAddress2']"));
}


public WebElement getState(){
    return driver.findElement(By.id("//input[@id='inputState']"));
}

public WebElement getZipcode(){
    return driver.findElement(By.id("//input[@id='inputZip']"));
}

public WebElement getSubmitButton(){
    return driver.findElement(By.id("//button[contains(text(),'Submit')]"));
}

public WebElement getEndMessage(){
    return driver.findElement(By.xpath(" //p[contains(text(),'Thanks for contacting us, we will get back to you ')]"));
}
}

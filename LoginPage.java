public class LoginPage {
    WebDriver driver;
    
    @FindBy(id = "username")
    WebElement username;
    
    @FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "loginButton")
    WebElement loginButton;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
}

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }
    
    @Test
    public void testValidLogin() {
        loginPage.login("testuser", "password123");
        Assert.assertEquals(driver.getTitle(), "Dashboard");
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

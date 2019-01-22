import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class test {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/konstantinpolianskii/Desktop/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();

            String baseUrl = "http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html";

            String expextedTitle = "Demo AUT";
            String actualTitle;
            driver.get(baseUrl);
            actualTitle = driver.getTitle();

            if(actualTitle.contentEquals(expextedTitle)){
                System.out.println("Test pass");
            }else {
                System.out.println("Test fail");
            }
            WebElement FirstName = ((ChromeDriver) driver).findElement(By.id("first-name"));
            FirstName.sendKeys("Konstantin");

            WebElement LastName = ((ChromeDriver) driver).findElement(By.id("last-name"));
            LastName.sendKeys("Polianskii");

            WebElement Gender1 = driver.findElement(By.xpath("//html//div[@class='radio-container col-sm-10']//label[1]/input[1]"));
            Gender1.click();

            WebElement DOB = ((ChromeDriver) driver).findElement(By.id("dob"));
            DOB.sendKeys("07/08/1980");

            WebElement Address = ((ChromeDriver) driver).findElement(By.id("address"));
            Address.sendKeys("555 Emerson cir Bolingbook. IL 60440");

            WebElement Email = ((ChromeDriver) driver).findElement(By.id("email"));
            Email.sendKeys("stan@gmail.com");

            WebElement Password = ((ChromeDriver) driver).findElement(By.id("password"));
            Password.sendKeys("password1qwery");

            WebElement Company = ((ChromeDriver) driver).findElement(By.id("company"));
            Company.sendKeys("Home inc");

            Select role = new Select(driver.findElement(By.id("role")));
            role.selectByVisibleText("QA");

            Select job = new Select(driver.findElement(By.id("expectation")));
            job.selectByVisibleText("Good teamwork");
            job.selectByVisibleText("High salary");
            job.selectByVisibleText("Challenging");

            WebElement checkbox1 = driver.findElement(By.xpath("//html//div[2]/label[1]/input[1]"));
            if (!checkbox1.isSelected()) {
                checkbox1.click();
            }

            WebElement checkbox2 = driver.findElement(By.xpath("//html//div[6]/label[1]/input[1]"));
            if (!checkbox2.isSelected()) {
                checkbox2.click();
            }

            WebElement Comment = ((ChromeDriver) driver).findElement(By.id("comment"));
            Comment.sendKeys("Very excited do something new in my life, thank you for your opportunity.");

            FirstName.submit();

//            driver.findElement(By.xpath("//form[@id='infoForm']/div[13]/div")).click();
//            try {
//                assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
//            } catch (Error e) {
//                PrintWriter verificationErrors = null;
//                verificationErrors.append(e.toString());
//            }


            driver.close();
            // driver.quit();


        }
    }

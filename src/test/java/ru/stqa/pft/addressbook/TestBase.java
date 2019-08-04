package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  protected void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  protected void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  private void login(String username, String pass) {
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(pass);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

  protected void DeleteSelectGroups() {
    driver.findElement(By.name("delete")).click();
  }

  protected void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }
}

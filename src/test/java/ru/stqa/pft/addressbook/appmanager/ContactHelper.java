package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver app) {
        super(app);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
    public void fillContactFrom(ContactData contactData, boolean creation){
        type(By.name ("firstname"), contactData.getFirstname());
        type(By.name ("lastname"), contactData.getLastname());
        attach(By.name("photo"), contactData.getPhoto());

        if (creation){
            if (contactData.getGroup() != null) {
                new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
            }
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void reternToHomePage() {
        click(By.linkText("home page"));
    }

    public void initContactModification() {
        click(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}

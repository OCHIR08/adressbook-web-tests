package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test(enabled = false)
    public void testContactModification(){
        app.goTo().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactFrom(new ContactData("test_name","test_surname", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().reternToHomePage();
    }
}

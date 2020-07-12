package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation()  {
        Groups groups = app.db().groups();
        File photo = new File("src/test/resources/stru.png");
        ContactData newContact = new  ContactData().withFirstname("test_name").withSecondname("test_surname").withPhoto(photo)
                .inGroup(groups.iterator().next());
        app.goTo().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactFrom( newContact, true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().reternToHomePage();
    }



    @Test
    public void testCurrentDir() {
        File currentDir = new File(".");
        System.out.println(currentDir.getAbsolutePath());
        File photo = new File("src/test/resources/stru.png");
        System.out.println(photo.getAbsolutePath());
        System.out.println(photo.exists());

    }
}

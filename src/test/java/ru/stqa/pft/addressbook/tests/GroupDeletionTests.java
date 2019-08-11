package ru.stqa.pft.addressbook.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion()  throws Exception{
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().DeleteSelectGroups();
    app.getGroupHelper().returnToGroupPage();
  }


  
}

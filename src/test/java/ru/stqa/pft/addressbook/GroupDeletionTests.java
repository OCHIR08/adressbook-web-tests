package ru.stqa.pft.addressbook;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion()  throws Exception{
    gotoGroupPage();
    selectGroup();
    DeleteSelectGroups();
    returnToGroupPage();
  }


  
}

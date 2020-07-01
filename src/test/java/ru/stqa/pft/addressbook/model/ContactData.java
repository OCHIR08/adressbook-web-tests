package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {

    private int id;
    private String firstname;
    private String secondname;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String allPhone;

    public File getPhoto() {
        return photo;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    private File photo;

    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSecondname() {
        return secondname;
    }

    public ContactData withSecondname(String secondname) {
        this.secondname = secondname;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public ContactData withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    public String getAllPhone() {
        return allPhone;
    }

    public ContactData withAllPhone(String allPhone) {
        this.allPhone = allPhone;
        return this;
    }

//
//    public ContactData(String firstname,String secondname, String group) {
//        this.firstname = firstname;
//        this.secondname = secondname;
//        this.group = group;
//    }

}

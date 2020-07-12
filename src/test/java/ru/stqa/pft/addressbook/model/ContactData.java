package ru.stqa.pft.addressbook.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "addressbook")
public class ContactData {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "home")
    @Type(type = "text")
    private String homePhone;

    @Column(name = "mobile")
    @Type(type = "text")
    private String mobilePhone;

    @Column(name = "work")
    @Type(type = "text")
    private String workPhone;

    @Transient
    private String allPhone;

    @Column(name = "photo")
    @Type(type = "text")
    private String photo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "address_in_groups",
            joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<GroupData> groups = new HashSet<GroupData>();

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public File getPhoto() {
        return new File(photo);
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }



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

    public String getLastname() {
        return lastname;
    }

    public ContactData withSecondname(String secondname) {
        this.lastname = secondname;
        return this;
    }

    public Groups getGroups() {
        return new Groups(groups);
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

    public ContactData inGroup(GroupData group) {
        groups.add(group);
        return this;
    }
}

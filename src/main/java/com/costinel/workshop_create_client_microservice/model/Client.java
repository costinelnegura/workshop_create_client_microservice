package com.costinel.workshop_create_client_microservice.model;

import javax.persistence.*;
import java.util.Objects;

/*
The Client Class will create a client objects with only information about a client.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long iD;

    @Column
    String proNoun;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String homeAddress;

    @Column
    String postCode;

    @Column
    String mobileNumber;

    @Column
    String landLineNumber;

    @Column
    String workNumber;

    @Column
    String emailAddress;

    public Client(long iD, String proNoun, String firstName, String lastName, String homeAddress, String postCode, String mobileNumber, String landLineNumber, String workNumber, String emailAddress) {
        this.iD = iD;
        this.proNoun = proNoun;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.postCode = postCode;
        this.mobileNumber = mobileNumber;
        this.landLineNumber = landLineNumber;
        this.workNumber = workNumber;
        this.emailAddress = emailAddress;
    }

    public Client() {
    }

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public String getProNoun() {
        return proNoun;
    }

    public void setProNoun(String proNoun) {
        this.proNoun = proNoun;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return iD == client.iD && Objects.equals(proNoun, client.proNoun) && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(homeAddress, client.homeAddress) && Objects.equals(postCode, client.postCode) && Objects.equals(mobileNumber, client.mobileNumber) && Objects.equals(landLineNumber, client.landLineNumber) && Objects.equals(workNumber, client.workNumber) && Objects.equals(emailAddress, client.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, proNoun, firstName, lastName, homeAddress, postCode, mobileNumber, landLineNumber, workNumber, emailAddress);
    }

    @Override
    public String toString() {
        return "Client{" +
                "iD=" + iD +
                ", proNoun='" + proNoun + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", landLineNumber='" + landLineNumber + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

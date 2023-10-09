package Beans;

import java.util.Objects;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:44 PM
 */
public class Employee {
    protected int id;
    protected String email, password, firstName, lastName;
    protected int omang, phoneNumber, dateOfBirth;
    protected String physicalAddress, postalAddress;

    public Employee(){
        super();
    }

    public Employee( String email, String password, String firstName, String lastName, int omang, int phoneNumber, int dateOfBirth, String physicalAddress, String postalAddress) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.omang = omang;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.physicalAddress = physicalAddress;
        this.postalAddress = postalAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getOmang() {
        return omang;
    }

    public void setOmang(int omang) {
        this.omang = omang;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && omang == employee.omang && phoneNumber == employee.phoneNumber && dateOfBirth == employee.dateOfBirth && Objects.equals(email, employee.email) && Objects.equals(password, employee.password) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(physicalAddress, employee.physicalAddress) && Objects.equals(postalAddress, employee.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, firstName, lastName, omang, phoneNumber, dateOfBirth, physicalAddress, postalAddress);
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", omang=" + omang +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", physicalAddress='" + physicalAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ']';
    }
}
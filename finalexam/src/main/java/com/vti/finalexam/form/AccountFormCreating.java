package com.vti.finalexam.form;

import com.vti.finalexam.entity.Account;

import java.time.LocalDate;
import java.util.Date;

public class AccountFormCreating {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthday;
    private String email;
    private Account.Role role;
    private Account.Gender gender;


    public AccountFormCreating(String username, String password, String firstName, String lastName, String address, LocalDate birthday, String email, Account.Role role, Account.Gender gender) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.role = role;
        this.gender = gender;
    }

    public AccountFormCreating() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Account.Gender getGender() {
        return gender;
    }

    public void setGender(Account.Gender gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public Account.Role getRole() {
        return role;
    }

    public void setRole(Account.Role role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

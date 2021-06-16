package com.itea.pim.hanna_styslo.user;

public class User {
    String name;
    String surname;
    String login;
    String password;
    String email;

    public User() {
    }

    public User(String polo, String loop, String s, String dassa, String swdxqsd) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayInfo(){
        System.out.println(new StringBuilder().append("Name ").append(name).toString());
        System.out.println(new StringBuilder().append("Surname ").append(surname).toString());
        System.out.println(new StringBuilder().append("Login ").append(login).toString());
        System.out.println(new StringBuilder().append("Password ").append(password).toString());
        System.out.println(new StringBuilder().append("Email ").append(email).toString());
    }
}

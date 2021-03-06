package com.github.donkeyrit.javaapp.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Objects;

/**
 *
 * @author Dima
 */
public class User {

    private int avatarNumber;
    public int getAvatarNumber() {
        return avatarNumber;
    }
    public void setAvatarNumber(int avatarNumber) {
        this.avatarNumber = avatarNumber;
    }

    private String login;
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    private boolean role;
    public boolean isRole() {
        return role;
    }
    public void setRole(boolean role) {
        this.role = role;
    }

    public User(String login, String password, boolean role) {
        this.avatarNumber = (int) (Math.random() * 6 + 1);
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return role == user.role &&
                login.equals(user.login) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, role);
    }
}

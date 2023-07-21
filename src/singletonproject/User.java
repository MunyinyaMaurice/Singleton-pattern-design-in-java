/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonproject;

/**
 *
 * @author munyi
 */
//public class User {
//    
//}
// User.java
public class User {
    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters for properties
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

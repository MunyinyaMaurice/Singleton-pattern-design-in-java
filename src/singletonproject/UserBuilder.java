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
// UserBuilder.java
public class UserBuilder {
    private static volatile UserBuilder instance;
    private String username;
    private String password;

    private UserBuilder() {

    }

    public static UserBuilder getInstance() {
        UserBuilder result= instance;
        if (result == null) {
            synchronized (UserBuilder.class) {
                if (result == null) {
                    result = new UserBuilder();
                }
            }
        }
        return result;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        return new User(username, password);
    }
}



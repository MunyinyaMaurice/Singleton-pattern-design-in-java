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
// Main.java
public class Main {
    public static void main(String[] args) {
        User user1 = UserBuilder.getInstance()
                .setUsername("Munyinya Shema")
                .setPassword("The one")
                .build();

        User user2 = UserBuilder.getInstance()
                .setUsername("Maurice Shema")
                .setPassword("Only")
                .build();

        System.out.println("User 1 - Username: " + user1.getUsername() + ", Password: " + user1.getPassword());
        System.out.println("User 2 - Username: " + user2.getUsername() + ", Password: " + user2.getPassword());
    }
}


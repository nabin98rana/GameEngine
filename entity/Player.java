 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.entity;

/**
 *
 * @author Navin
 */
public class Player {
    private String name;

    /**
     * Default constructor
     */
    public Player() {
        
    }
    
    /**
     * Overloaded constructor
    
    */

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
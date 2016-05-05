/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.commands;

import com.leapfrog.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Navin
 */
public class ExitCommand extends GameCommand{

    public ExitCommand(Scanner input) {
        super(input);
    }
 
    @Override
    public void execute(Player player, String[] param) {
        System.out.print("Do you really want to quite [Y/N]?");
        if(!input.next().equalsIgnoreCase("n")){
       System.out.println("Close Application please wait............");
       System.exit(0);
        }
        
    }
    
}

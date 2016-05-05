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
public class DropCommand extends GameCommand {

    public DropCommand(Scanner input){
        super(input);
    }

    @Override
    public void execute(Player player,String[] param) {
      System.out.println(player.getName()+" has dropped "+param[1]);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

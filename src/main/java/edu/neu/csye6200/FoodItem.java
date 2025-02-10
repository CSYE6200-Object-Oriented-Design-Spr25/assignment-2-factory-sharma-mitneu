/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.util.*;

/**
 *
 * @author sharmamit
 */
public class FoodItem extends Item {
    private String expiration_Date;

    public FoodItem(String csvString){
        super(0,"", 0);
        String[] parts = csvString.split(",");
        if(parts.length == 4){
            super.id = Integer.parseInt(parts[0]);
            super.name = parts[1];
            super.price = Double.parseDouble(parts[2]);
            this.expiration_Date = parts[3];
        }
    }

    @Override
    public String toString(){
        return super.toString() + " (Expires : " + expiration_Date + ")";
    }
}

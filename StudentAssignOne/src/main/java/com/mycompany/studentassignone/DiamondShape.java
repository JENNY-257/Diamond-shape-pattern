/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentassignone;

/**
 *
 * @author educa
 */
public class DiamondShape extends ShapePattern {
    
    @Override
    public  void displayDiamondShape(int n){

        //number of spaces before before the stars on the first row
        int space = n - 1 ;
        
        //print upper part of Diamond
        for(int i = 0; i < n; i++){
            
            for(int j= 0; j < space; j++){
                // Print leading spaces
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i; j++){
                // Print stars followed by a space
                System.out.print("* ");
            }
            
            System.out.println();
            // Decrease the number of leading spaces for the next row
            space--;
        }
        
        // Reset the number of spaces for the lower part
        space = 0;
        
        //print lower part of diamond
        for(int i = n - 1; i > 0; i--){
            
            for(int j= 0; j < space; j++){
                // Print leading spaces
                System.out.print(" ");
            }
            
            for(int j = 0; j < i; j++){
                // Print stars followed by a space
                System.out.print("* ");
            }
            // Move to the next line after printing stars
            System.out.println();
            space++;
        }
        
        
        

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3task;

/**
 *
 * @author Ding Zhe
 */
import java.util.Scanner;
public class LAB3TASK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[][] points = new int[3][2]; // 3 rows 2 columns
        
        for(int i =0;i<3;i++){ // loop
            System.out.println("Enter the x coordinate :");
            points[i][0] = scanner .nextInt();
            System.out.println("Enter the y coordinate :");
            points [i][1] = scanner .nextInt();
            
        }
        int x1 = points[0][0];
        int y1 = points[0][1];
        
        int x2 = points[1][0];
        int y2 = points[1][1];
        
        int x3 = points[2][0];
        int y3 = points[2][1];
        
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        
        if (m1==m2){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    
    
    }
}

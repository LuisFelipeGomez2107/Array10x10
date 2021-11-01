/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10x10;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class metodos {
   static int[][] matriz = new int[10][10]; 

    static int[] matriz2 = new int[100]; 

    static int pointer = 0; 

     int media; 

     int moda; 

     int mediana; 

    static int[] numbers = new int[10]; 
    
     Random rn = new Random(); 
    
    
    public void fill(){ 

       

        for(int i=0; i<10; i++){ 

            for(int j=0; j<10; j++){ 

                matriz[i][j] = rn.nextInt(10); 

            } 

        } 

    } 

  

    public void print(){ 

        for(int i=0; i<10; i++){ 

            for(int j=0; j<10; j++){ 

                System.out.print(matriz[i][j]+" "); 

            } 

            System.out.println(); 

        } 

    }   

  

    public void stepFill(int value, int cant){ 

        for(int i=pointer; i<pointer+cant; i++){ 

            matriz2[i] = value; 

        } 

        pointer += cant; 

    } 

  

    public void calc(){ 

        int suma = 0; 

        for(int i=0; i<10; i++){ 

            for(int j=0; j<10; j++){ 

                int num = matriz[i][j]; 

                int val = numbers[num] + 1; 

                suma += num; 

                numbers[num] = val; 

            } 

        } 

        moda = 0; 

        for(int i=1; i<10; i++){ 

            if(numbers[i]>numbers[moda]){ 

                moda = i; 

            } 

            stepFill(i, numbers[i]); 

        } 

        mediana = matriz2[50]; 

        media = suma / 100;     

    } 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_1_media;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_1_media
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        int media = 0;
        
        System.out.print("Digite o número 1: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o número 2: ");
        n2 = input.nextInt();
        
        System.out.print("Digite o número 3: ");
        n3 = input.nextInt();
        
        if(n1 > n2)
        { if (n1 > n3)
        {System.out.println("O maior o número é o " + n1);}}
        else if( n2 > n1 )
        {if ( n2 > n3 )
        {System.out.print("O maior o número é o " + n2);}}
        else
        {System.out.print("O maior o número é o " + n3);}
        
        media = (n1+n2+n3) / 3;
        
        System.out.print("A média foi de " + media);
    }
}

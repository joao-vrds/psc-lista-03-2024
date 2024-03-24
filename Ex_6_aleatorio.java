/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_6_aleatorio;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.util.Random;

public class Ex_6_aleatorio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        int n1 = 0, n2 = 0;
        
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        
        int menorNumero = Math.min(n1, n2);
        int maiorNumero = Math.max(n1, n2);
        
        int numeroAleatorio = rd.nextInt(maiorNumero - menorNumero + 1) + menorNumero;
        
        System.out.println("O número sorteado entre " + menorNumero + " é: " + numeroAleatorio);
        
        input.close();
    }
}
        


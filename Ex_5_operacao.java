/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_5_operacao;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_5_operacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1 = 0, n2 = 0;
        char opcao = ' ';
        
        System.out.print("Digite o primeiro nnúmero: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        System.out.print("\n(+)\t(-)\t(*)\t(/)\t(^)\nDigite seu operador");
        opcao = input.next().charAt(0);
        
        
        switch (opcao){
            case '+' :
                double conta = n1 + n2;
                System.out.print("O resultado de " + n1 + "+" + n2 + " é " + conta);
                break;
            case '-' :
                conta = n1 - n2;
                System.out.print("O resultado de " + n1 + "-" + n2 + " é " + conta);
                break;
            case '*' :
                conta = n1 * n2;
                System.out.print("O resultado de " + n1 + "*" + n2 + " é " + conta);
                break;
            case '/' :
                conta = n1 / n2;
                
                if (n2 == 0) 
                    { System.out.print("Opção inválida."); }
                else 
                    { System.out.print("O resultado de " + n1 + "/" + n2 + " é " + conta); } 
                break;
            case '^' :
                conta = Math.pow(n1, n2);
                System.out.print("O resultado de " + n1 + "^" + n2 + " é " + conta);
                break;
            default :
                System.out.println("Opção inválida");
        }
        
        input.close();
    }
}

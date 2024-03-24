/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_4_circulo;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_4_circulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double raio = 0;
        char opcao = ' ';
        double pi = 3.141592;
        
        System.out.print("(A) Calcular perímetro\n(B) Calcular Área\n(C) Calcular Volume\nDigite sua opção: ");
        opcao = input.next().charAt(0);
        System.out.print("Digite o raio: ");
        raio = input.nextDouble();
        
        switch ( opcao ){
            case 'A' : 
                double perimetro = 2 * pi * raio;
                System.out.print("A área do círculo de um raio de " + raio + " é de " + df.format(perimetro) + "cm²");
                break;
            case 'B' :
                double area = pi * Math.pow(raio, 2);
                System.out.print("A área de um círculo de um raio de " + raio + " é de " + df.format(area) + "cm²");
                break;
            case 'C' :
                double volumeEsfera = (4/3) * pi * Math.pow(raio, 2);
                System.out.print("O volume de uma esfera de um raio de " + raio + " é de " + df.format(volumeEsfera) + "cm³");
                break;
            default :
                System.out.print("Opção inválida.");
        }
        input.close();
    }
}

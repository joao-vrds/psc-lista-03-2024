/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_2_troco;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_2_troco {

    private static void calcularTroco (double valorPago, double valorCompra)
    {
        double troco = valorPago - valorCompra;

        System.out.print("\nValor Pago: R$ " + valorPago);
        System.out.print("\nValor da Compra: R$ " + valorCompra);
        System.out.print("\n\nTroco: R$ " + troco);

        int[] notas = {50, 20, 10, 5, 2, 1};

        for (int nota : notas) 
        {
            if (troco >= nota)
            {
                int quantidade = (int)(troco / nota);
                System.out.printf("\nNotas de R$ " + nota + ",00 : " + quantidade);
                troco -= quantidade * nota;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorCompra = 0;
        double valorPago = 0;

        System.out.println("Informe o valor da compra: ");
        valorCompra = input.nextDouble();

        System.out.println("Informe o valor pago: ");
        valorPago = input.nextDouble();

        if (valorPago < valorCompra)
        {
            System.out.println("O valor pago é insuficiente para realizar a compra.");
            return;
        }

        calcularTroco (valorPago, valorCompra);
        
        input.close();
    }

}

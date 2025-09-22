/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodescuento.java;

/**
 *
 * @author PC
 */
public class CalculoDescuentoJava {
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    /**
     * Método sobrecargado que aplica un 10% de descuento por defecto.
     * @param montoTotal - El total de la compra.
     * @return El valor del descuento calculado con el 10%.
     */
    public static double calcularDescuento(double montoTotal) {
        return montoTotal * 0.10; // 10% de descuento
    }

    public static void main(String[] args) {
        // Caso 1: Aplicar el descuento por defecto (10%)
        double monto1 = 200.0;
        double descuento1 = calcularDescuento(monto1);
        double montoFinal1 = monto1 - descuento1;

        System.out.println("=== Compra 1 ===");
        System.out.println("Monto Total: $" + monto1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Monto Final a pagar: $" + montoFinal1);

        // Caso 2: Aplicar un descuento específico (15%)
        double monto2 = 500.0;
        double descuento2 = calcularDescuento(monto2, 15.0);
        double montoFinal2 = monto2 - descuento2;

        System.out.println("\n=== Compra 2 ===");
        System.out.println("Monto Total: $" + monto2);
        System.out.println("Descuento aplicado (15%): $" + descuento2);
        System.out.println("Monto Final a pagar: $" + montoFinal2);
    }
}
        
        
       

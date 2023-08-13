package org.example;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double maior = calcularMaior(valor1, valor2, valor3);
        double menor = calcularMenor(valor1, valor2, valor3);
        double media = calcularMedia(valor1, valor2, valor3);

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }

    public static double calcularMaior(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double calcularMenor(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}

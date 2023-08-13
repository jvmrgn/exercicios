package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de N1: ");
        double n1 = scanner.nextDouble();

        System.out.println("Informe o valor de N2: ");
        double n2 = scanner.nextDouble();

        System.out.println("Informe o valor de N3: ");
        double n3 = scanner.nextDouble();

        if (isTriangle(n1, n2, n3)) {
            String tipoTriangulo = determinarTipoTriangulo(n1, n2, n3);
            System.out.println("Os valores informados podem representar um triângulo do tipo " + tipoTriangulo);
        } else {
            System.out.println("Os valores informados não podem representar um triângulo.");
        }

        scanner.close();
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String determinarTipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || a == c || b == c) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}

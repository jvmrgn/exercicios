package org.example;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira string: ");
        String primeiraString = scanner.nextLine();

        System.out.println("Informe a segunda string: ");
        String segundaString = scanner.nextLine();

        int ocorrencias = contarOcorrencias(primeiraString, segundaString);
        int totalCaracteres = primeiraString.length() + segundaString.length();

        System.out.println("A segunda string ocorre " + ocorrencias + " vezes na primeira string.");
        System.out.println("Total de caracteres nas duas strings: " + totalCaracteres);

        scanner.close();
    }

    public static int contarOcorrencias(String texto, String alvo) {
        int ocorrencias = 0;
        int index = texto.indexOf(alvo);

        while (index != -1) {
            ocorrencias++;
            index = texto.indexOf(alvo, index + 1);
        }

        return ocorrencias;
    }
}

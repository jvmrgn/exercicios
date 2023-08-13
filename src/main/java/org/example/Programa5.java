package org.example;
import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        String input = scanner.nextLine();

        int numPalavras = contarPalavras(input);
        int numVogais = contarVogais(input);

        System.out.println("Número de palavras na string: " + numPalavras);
        System.out.println("Número de vogais na string: " + numVogais);

        scanner.close();
    }

    public static int contarPalavras(String texto) {
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }

    public static int contarVogais(String texto) {
        int count = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

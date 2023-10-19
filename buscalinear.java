package buscalinear;

import java.util.Random;
import java.util.Scanner;

public class buscalinear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do array
        int tamanhoArray = 25;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Imprime o array de números aleatórios
        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Solicita ao usuário inserir um número para busca
        System.out.print("\nDigite um número para buscar no array: ");
        int numeroBuscado = scanner.nextInt();

        // Realiza a busca linear
        boolean encontrado = false;
        for (int i = 0; i < tamanhoArray; i++) {
            if (numerosAleatorios[i] == numeroBuscado) {
                encontrado = true;
                break; // Sai do loop se encontrar o número
            }
        }

        // Informa ao usuário o resultado da busca
        if (encontrado) {
            System.out.println("O número " + numeroBuscado + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado no array.");
        }

        scanner.close();
    }
}

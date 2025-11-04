import java.util.Scanner;
import java.util.ArrayList;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        // Criando o vetor
        int[] numeros = new int[tamanho];
        
        // Lendo os números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Calculando a soma
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        
        // Calculando a média
        double media = (double) soma / tamanho;
        
        // Encontrando maior e menor valor
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Criando vetor de pares
        ArrayList<Integer> pares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        
        // Exibindo resultados
        System.out.println("\nResultados:");
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        System.out.println("\nValores pares encontrados:");
        for (int par : pares) {
            System.out.print(par + " ");
        }
        
        scanner.close();
    }
}


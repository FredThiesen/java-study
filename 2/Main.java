import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento da pista (em metros): ");
        double comprimentoPista = input.nextDouble();

        System.out.print("Digite o número total de voltas: ");
        double numVoltas = input.nextDouble();

        System.out.print("Digite o número de reabastecimentos desejados: ");
        double numReabastecimentos = input.nextDouble();

        System.out.print("Digite o consumo de combustível do carro (em Km/L): ");
        double consumoCombustivel = input.nextDouble();

        double distanciaTotal = comprimentoPista * numVoltas;
        double distanciaEntreReabastecimentos = distanciaTotal / (numReabastecimentos + 1);
        double litrosNecessarios = distanciaEntreReabastecimentos / consumoCombustivel;

        System.out.printf("Número mínimo de litros necessários para percorrer até o primeiro reabastecimento: %.2f\n", litrosNecessarios);
    }
}
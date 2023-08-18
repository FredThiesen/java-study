import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a marcação do odômetro (Km) no início do dia: ");
        double kmInicial = input.nextDouble();
        System.out.print("Digite a marcação do odômetro (Km) no final do dia: ");
        double kmFinal = input.nextDouble();
        System.out.print("Digite o número de litros de combustível gasto: ");
        double litrosCombustivel = input.nextDouble();
        System.out.print("Digite o valor total (R$) recebido dos passageiros: ");
        double valorTotal = input.nextDouble();
        double mediaConsumo = (kmFinal - kmInicial) / litrosCombustivel;
        double lucroLiquido = valorTotal - (litrosCombustivel * 4.15);

        System.out.printf("Média do consumo em Km/L: %.2f\n", mediaConsumo);
        System.out.printf("Lucro líquido do dia: R$ %.2f\n", lucroLiquido);
    }
}
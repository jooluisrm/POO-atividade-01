import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoInicial;
        double desconto;

        System.out.println("Informe o preço do produto: ");
        precoInicial = teclado.nextDouble();

        System.out.println("Informe a porcentagem do desconto: ");
        desconto = teclado.nextDouble();

        System.out.printf("Preço do produto: R$ %.2f\nDesconto: %.0f%%\nValor com desconto: R$ %.2f\n", precoInicial, desconto, valorDesconto(precoInicial, desconto));
        
        teclado.close();
    }

    public static double valorDesconto(double precoInicial, double desconto) {
        double novoValor = 0;
        double valorDesconto = 0;
        valorDesconto = (precoInicial * desconto) / 100;
        novoValor = precoInicial - valorDesconto;

        return novoValor;
    }
}

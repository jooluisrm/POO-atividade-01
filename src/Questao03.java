import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        if (verificarParImpar(valor)) {
            System.out.printf("%d e PAR!!!\n", valor);
        } else {
            System.out.printf("%d e IMPAR!!!\n", valor);
        }

        teclado.close();
    }

    public static boolean verificarParImpar(int valor) {
        boolean resultado;
        if (valor % 2 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}

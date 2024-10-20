import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.println("Digite um numero: ");
        valor = teclado.nextInt();


        if(verificarValor(valor)) {
            System.out.printf("%d e POSITIVO!!!\n", valor);
        } else {
            System.out.printf("%d e NEGATIVO!!!\n", valor);
        }

        teclado.close();
    }

    public static boolean verificarValor(int valor) {
        boolean resultado;
        if (valor >= 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}

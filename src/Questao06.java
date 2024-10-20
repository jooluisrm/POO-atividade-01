import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y;

        System.out.println("informe o valor de X: ");
        x = teclado.nextInt();

        System.out.println("Informe o valor de Y: ");
        y = teclado.nextInt();

        System.out.println(dividir(x, y));
        teclado.close();
    }

    public static int dividir(int x, int y) {
        int resultado = 0;
        if (y == 0) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }
}

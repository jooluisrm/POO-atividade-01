import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura;
        String sexo;

        System.out.println("Informe seu sexo: ( f/m ) | ( feminino/masculino )");
        sexo = teclado.nextLine();

        System.out.println("Infome sua altura: ");
        altura = teclado.nextFloat();

        pesoIdeal(altura, sexo);

        teclado.close();
    }

    public static void pesoIdeal(float altura, String sexo) {
        double idealPeso = 0;

        if (sexo.toLowerCase().equals("f") || sexo.toLowerCase().equals("feminino")) {
            idealPeso = (62.1 * altura) - 44.7;
        } else if (sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("masculino")) {
            idealPeso = (72.7 * altura) - 58;
        }

        System.out.printf("Seu peso ideal e: %.2f\n", idealPeso);
    }
}

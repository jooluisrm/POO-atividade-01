import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] codigo = new int[20];
        String[] corOlhos = new String[20];
        int[] idade = new int[20];

        for (int i = 0; i < 20; i++) {
            do {
                System.out.printf("Digite o codigo da Pessoa %d: \n", i);
                codigo[i] = teclado.nextInt();

                if (!validarCodigo(codigo)) {
                    System.out.println("Codigo já cadastrado!!!");
                }
            } while (!validarCodigo(codigo));

            System.out.println("Qual a cor dos seus olhos: ");
            corOlhos[i] = teclado.next();

            do {
                System.out.println("Digite sua idade em anos: ");
                idade[i] = teclado.nextInt();
                if (idade[i] < 0) {
                    System.out.println("idade invalida, tente outra!!!");
                }
            } while (idade[i] < 0);

        }

        listaCadastro(codigo, idade, corOlhos);
        porcentagem18a35Verde(idade, corOlhos);
        mostrarDados(codigo, idade, corOlhos);

        teclado.close();
    }

    public static void listaCadastro(int[] codigo, int[] idade, String[] corOlhos) {
        for (int i = 0; i < codigo.length; i++) {
            System.out.printf("Pessoa %d, codigo: %d Cor dos Olhos: %s idade: %d \n", i, codigo[i], corOlhos[i],
                    idade[i]);
        }
    }

    public static boolean validarCodigo(int[] codigo) {
        for (int i = 0; i < codigo.length; i++) {
            if (codigo[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < codigo.length; j++) {
                if (codigo[i] == codigo[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void porcentagem18a35Verde(int[] idade, String[] corOlhos) {
        int qntdade = 0;
        int qntdadeVerde = 0;
        float porcentagem;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] >= 18 && idade[i] <= 35) {
                qntdade++;
            }
        }

        porcentagem = ((float) qntdade / idade.length) * 100;
        System.out.printf("\nA porcentagem de pessoas que tem idade entre 18 e 35 é de %.2f%% \n", porcentagem);

        for (int i = 0; i < corOlhos.length; i++) {
            if (corOlhos[i] != null && corOlhos[i].toLowerCase().equals("verde")) {
                qntdadeVerde++;
            }
        }

        System.out.printf("\nA quantidade de pessoas com olhos verdes é de: %d \n", qntdadeVerde);
    }

    public static void mostrarDados(int[] codigo, int[] idade, String[] corOlhos) {
        Scanner teclado = new Scanner(System.in);
        int procurarCodigo;
        boolean encontrou = false;

        System.out.println("Digite o codigo da pessoa que deseja buscar os dados: ");
        procurarCodigo = teclado.nextInt();

        for (int i = 0; i < codigo.length; i++) {
            if (procurarCodigo == codigo[i]) {
                System.out.printf("Codigo: %d\nCor dos Olhos: %s\nIdade: %d\n", codigo[i], corOlhos[i], idade[i]);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Pessoa não encontrada!!!");
        }

        teclado.close();
    }

}

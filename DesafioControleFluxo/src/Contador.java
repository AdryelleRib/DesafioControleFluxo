import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
        }
        sc.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é Maior que o parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
             System.out.println("Imprimindo o número " + i);
        }
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
            int resultadoSubtracaoParametroUmEDois = parametroUm - parametroDois;
            for (int impressaoOcorrencias = 1; impressaoOcorrencias <= resultadoSubtracaoParametroUmEDois; impressaoOcorrencias++){
                System.out.println("Imprimindo o número " + impressaoOcorrencias);
            }

        }catch (ParametrosInvalidosException e){
            System.out.println("ERROR: O Segundo número precisa ser menor que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois){
            throw  new ParametrosInvalidosException();
        }
    }
}

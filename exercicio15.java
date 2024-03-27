import java.util.Scanner;

public class exercicio15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite o valor de X1: ");
        float x1 = leitor.nextFloat();
        System.out.printf("Digite o valor de Y1: ");
        float y1 = leitor.nextFloat();
        System.out.printf("Digite o valor de X2: ");
        float x2 = leitor.nextFloat();
        System.out.printf("Digite o valor de Y2: ");
        float y2 = leitor.nextFloat();

        double operacao = Math.sqrt(Math.pow((x2 - x1), 2 ) + Math.pow((y2 - y1), 2));
        
        System.out.printf("O resultado da operação é de %.2f", operacao);
    }
}
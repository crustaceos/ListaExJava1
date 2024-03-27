import java.util.Scanner;

public class exercicio14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("An = a1 + (n - 1) * r\n");
        System.out.printf("Digite o valor de a1: ");
        float a1 = leitor.nextFloat();
        System.out.printf("Digite o valor de n: ");
        float n = leitor.nextFloat();
        System.out.printf("Digite o valor de r: ");
        float r = leitor.nextFloat();

        float An = a1 + (n - 1) * r;

        System.out.printf("O resultado da operação é de: %.2f", An);
   
    }
}
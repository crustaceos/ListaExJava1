import java.util.Scanner;

public class exercicio11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
     
        System.out.printf("Digite o primeiro número inteiro: ");
        int num1 = leitor.nextInt();
        
        System.out.printf("Digite o segundo número inteiro: ");
        int num2 = leitor.nextInt();
        
        System.out.printf("Digite o terceiro número inteiro: ");
        int num3 = leitor.nextInt();
        

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.printf("Os números em ordem crescente são:");
        System.out.printf("%d, %d, %d\n", num1, num2, num3);
        
    }
}
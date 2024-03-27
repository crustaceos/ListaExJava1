import java.util.Scanner;

public class exercicio5 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite o valor de A: ");
    int A = leitor.nextInt();

    System.out.printf("Digite o valor de B: ");
    int B = leitor.nextInt();

    System.out.printf("O valor real dos numeros é A: %d B: %d\n", A , B);

    int C = A;
    A = B;
    B = C;
    
    System.out.printf("O valor dos numeros trocados é A: %d B: %d", A, B);
   
 }
}


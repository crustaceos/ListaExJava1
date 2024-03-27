import java.util.Scanner;

public class exercicio3 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite o valor de A:");
    int A = leitor.nextInt();

    System.out.printf("Digite o valor de B:");
    int B = leitor.nextInt();

    if(A > B){
        System.out.printf("O valor de A é maior que o de B");
    }
    else if(A < B){
        System.out.printf("O valor de B é maior que o de A");
    }
    else{
        System.out.printf("O valores são iguais");
    }
   
    
 }
}

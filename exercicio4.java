import java.util.Scanner;

public class exercicio4 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite o primeiro valor: ");
    float primeiro = leitor.nextFloat();

    System.out.printf("Digite o segundo valor: ");
    float segundo = leitor.nextFloat();

    System.out.printf("A soma dos numeros é: %.2f\n" , primeiro + segundo);
    System.out.printf("A diferença dos numeros é: %.2f\n", primeiro - segundo);
    System.out.printf("A multiplicação dos numeros é: %.2f\n", primeiro * segundo);
    System.out.printf("A divisão dos numeros é: %.2f", primeiro / segundo);
   
    
 }
}

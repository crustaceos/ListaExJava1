import java.util.Scanner;

public class exercicio2 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite o primeiro numero: ");
    float primeiro = leitor.nextFloat();

    System.out.printf("Digite o segundo numero: ");
    float segundo = leitor.nextFloat();

    System.out.printf("A soma dos dois numeros é: %.2f", primeiro + segundo);
    
 }
}

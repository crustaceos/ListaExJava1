import java.util.Scanner;

public class exercicio6 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite um valor em Celsius: ");
    float celsius = leitor.nextFloat();

    float conversao = (9 * celsius + 160) / 5;

    System.out.printf("O valor convertido para Fahrenheit fica: %.2f", conversao);
   
 }
}

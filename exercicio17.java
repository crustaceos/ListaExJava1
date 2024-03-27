import java.util.Scanner;

public class exercicio17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite a primeira nota: ");
        float primeiraNota = leitor.nextFloat();
        System.out.printf("Digite a segunda nota: ");
        float segundaNota = leitor.nextFloat();
        System.out.printf("Digite a terceira nota: ");
        float terceiraNota = leitor.nextFloat();
        System.out.printf("Digite o peso da primeira nota: ");
        float primeiroPeso = leitor.nextFloat();
        System.out.printf("Digite o peso da segunda nota: ");
        float segundoPeso = leitor.nextFloat();
        System.out.printf("Digite o peso da terceira nota: ");
        float terceiroPeso = leitor.nextFloat();

        float media = (((primeiraNota * primeiroPeso) + (segundaNota * segundoPeso) + (terceiraNota * terceiroPeso)) / (primeiroPeso + segundoPeso + terceiroPeso));
        
        System.out.printf("O valor da média é de: %.2f", media);
    }
}
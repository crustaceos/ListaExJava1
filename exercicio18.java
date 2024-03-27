import java.util.Scanner;

public class exercicio18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite a primeira nota: ");
        float primeira = leitor.nextFloat();
        System.out.printf("Digite a segunda nota: ");
        float segunda = leitor.nextFloat();
        System.out.printf("Digite a terceira nota: ");
        float terceira = leitor.nextFloat();

        float media = (3 / ((1 / primeira) + (1 / segunda) + (1 / terceira)));
        
        System.out.printf("A media é de: %.2f", media);
    }
}
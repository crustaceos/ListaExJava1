import java.util.Scanner;
public class exercicio7 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um numero qualquer: ");
        float valor = leitor.nextFloat();

        if((valor > 100) && (valor < 200)){
            System.out.printf("O valor está no intervalo de 100 a 200.");
        }
        else{
            System.out.printf("O valor está fora do intervalo.");
        }
        
    }

    
}

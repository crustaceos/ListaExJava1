import java.util.Scanner;
public class exercicio8 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite qualquer valor: ");
        float valor = leitor.nextFloat();

        if(valor > 50){
            System.out.printf("O valor é maior que 50");
        }
        else if(valor < 50){
            System.out.printf("O valor é menor que 50");
        }
        else{
            System.out.printf("O valor é igual a 50");
        }
    
    }
}
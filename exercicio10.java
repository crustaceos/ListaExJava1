import java.util.Scanner;
public class exercicio10 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um numero de 1 a 5: ");
        int valor = leitor.nextInt();

        if(valor == 1){
            System.out.printf("Numero UM");
        }
        else if(valor == 2){
            System.out.printf("Numero DOIS");
        }
        else if(valor == 3){
            System.out.printf("Numero TRES");
        }
        else if(valor == 4){
            System.out.printf("Numero QUATRO");
        }
        else if(valor == 5){
            System.out.printf("Numero CINCO");
        }
        else{
            System.out.printf("Numero invalido!");
        }

    }      
}
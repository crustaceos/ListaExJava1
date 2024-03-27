import java.util.Scanner;

public class exercicio1 {

    public static void executar(){
    Scanner leitor = new Scanner (System.in);
    
    System.out.printf("Digite qualquer valor: ");
    float valor = leitor.nextFloat();

    if(valor < 10){
        System.out.printf("O valor é menor que dez!");
    }
    else if(valor > 10){
        System.out.printf("O numero é maior que dez!");
    }
    else{
        System.out.printf("O numero é igual a dez!");
    }

 }
}


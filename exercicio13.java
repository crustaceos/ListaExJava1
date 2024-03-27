import java.util.Scanner;

public class exercicio13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite o valor de A: ");
        float A = leitor.nextFloat();
        System.out.printf("Digite o valor de B: ");
        float B = leitor.nextFloat();

        System.out.printf("Digite o caracter da operação que deseja realizar entre os valores: ");
        char operacao = leitor.next().charAt(0);

        switch(operacao){
            case '+':
                System.out.printf("O resultado da operação é: %.2f", A + B);
                break;
            case '-':
                System.out.printf("O resultado da operação é: %.2f", A - B);
                break;
            case '*':
                System.out.printf("O resultado da operação é: %.2f", A * B);
                break;
            case '/':
                System.out.printf("O resultado da operação é: %.2f", A / B);
                break;
            default:
                System.out.printf("Operação não reconhecida");
         }       

         if(operacao == '/'){
            if((A == 0)||(B == 0)){
                System.out.printf("Erro.");
            }
         }
        
        }
   
    }


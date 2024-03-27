import java.util.Scanner;

public class exercicio16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite a prmeira nota do aluno: ");
        float aluno1 = leitor.nextFloat();
        System.out.printf("Digite a segunda nota do aluno: ");
        float aluno2 = leitor.nextFloat();
        System.out.printf("Digite a terceira nota do aluno: ");
        float aluno3 = leitor.nextFloat();

        float media = (aluno1 + aluno2 + aluno3) / 3;

        System.out.printf("A media do aluno é: %.2f", media);

        
    }
}
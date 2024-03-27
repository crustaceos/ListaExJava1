import java.util.Scanner;

public class exercicio19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Volume = 3.14 * raio^2 * altura\n");
        
        System.out.printf("Digite o raio do cilindro: ");
        float raio = leitor.nextFloat();
        System.out.printf("Digite a altura do cilindro: ");
        float altura = leitor.nextFloat();

        float volume = 3.14f * (raio * raio) * altura;

        System.out.printf("O volume do cilindro é de: %.2f", volume);
        
    }
}
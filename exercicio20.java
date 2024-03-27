import java.util.Scanner;

public class exercicio20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite o tempo médio em horas da viagem: ");
        float tempo = leitor.nextFloat();
        System.out.printf("Digite a velocidade média da viagem: ");
        float velocidade = leitor.nextFloat();
        
        float gasto = (tempo * velocidade) / 12;

        System.out.printf("A quantidade de combustível gasto da viagem é de: %.2f litros", gasto);
    }
}
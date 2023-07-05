import models.Carro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Digite o numero de portas do carro: ");
         int numeroDePortas = scanner.nextInt();
         System.out.print("Você pode digitar a cor: ");
         scanner.nextLine();
         String cor = scanner.nextLine();        
         System.out.print("Digite o número do CHASSI: ");
         int numeroDoChassi = scanner.nextInt();
         System.out.print("Digite o ano de fabricação: ");
         int anoDeFabricacao = scanner.nextInt();
         System.out.print("Você pode digitar o combustível usado: ");
         scanner.nextLine();
         String combustivel = scanner.nextLine();

         Carro carro = new Carro();
         carro.setNumeroDePortas(numeroDePortas);
         carro.setCor(cor);
         carro.setNumeroDoChassi(numeroDoChassi);
         carro.setAnoDeFabricacao(anoDeFabricacao);
         carro.setCombustivel(combustivel);

         System.out.println("Carro cadastrado com sucesso!!!");
         System.out.println("------------");
         System.out.println("Carro com: " + carro.getNumeroDePortas() + " portas da cor: " + carro.getCor() + " e combustível: " + carro.getCombustivel());
         System.out.println("Chassi: " + carro.getNumeroDoChassi() + " ano de fabricação: " + carro.getAnoDeFabricacao());
         System.out.println("------------");

         scanner.close();

    }
}

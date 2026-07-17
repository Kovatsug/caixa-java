import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("""
                
                1. Verificar Saldo
                
                2. Realizar Saque 
                
                3. Sair
                
                """);
            switch (sc.nextInt()){
                case 1:
                    caixa.verificar_saldo();
                    break;

                case 2:
                    System.out.println("Digite um valor: ");
                    caixa.realizar_saque(sc.nextInt());
                default:
                    System.out.println("Opção inválida");
            }

        }

    }

}

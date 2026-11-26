import  java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao; 

    do{
        System.out.println();
        System.out.println("SISTEMA DE LOCAÇÃO");
        System.out.println(" 1 - Cadastrar carro");
        System.out.println(" 2 - Cadastrar moto");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opcâo:");
    
        opcao = Integer.parseInt(entrada.nextLine());
        switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: cadastrar carro");
                    break;
                case 2:
                    System.out.println("Você escolheu: cadastrar moto");
                    break;
                case 0:
                    System.out.println("Encerrando. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

    }
    while (opcao != 0);

    System.out.println("Encerrando");
    entrada.close();
    }
}
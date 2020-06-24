import java.util.Scanner;

public class AppBolinhasDeGude {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BolinhasDeGude bolinhasDeGude = new BolinhasDeGude();

        // bem vindo
        System.out.println("Olá, qual seu nome ?");
        String nome = in.nextLine();
        System.out.println("Seja Bem vindo(a) " + nome + "!");

        System.out.println("Digite 1 para abrir o menu!");
        int menu = in.nextInt();
        while(menu != 1){
            System.out.println("Opção inválida, tente novamente!");
            menu = in.nextInt();
        }


        // menu
            do {
            System.out.println("Selecione o que deseja fazer: ");
            System.out.println("1 - Realizar uma compra");
            System.out.println("2 - Quantidade em estoque");
            System.out.println("0 - Sair! ");
            menu = in.nextInt();
            //opções
            switch (menu) {
                case 1:
                    System.out.println("Insira a quantidade de bolinhas que deseja adquirir: ");
                    int quantComprar = in.nextInt();
                    int quantEstoque = bolinhasDeGude.QuantEstoque(quantComprar);
                    String tam = bolinhasDeGude.tamanhoBolinhas();

                    System.out.println("Obrigada pela compra!");
                case 2:
                    System.out.println("Quantidade em estoque:");
                case 0:
                    System.out.println("Volte sempre, Até mais " + nome + "!");
                default:
                    System.out.println("Opção inválida, Tente novamente seguindo as opções dadas acima.");
                     }
                } while( menu != 0);

    } // fecha main

} // fecha tudo

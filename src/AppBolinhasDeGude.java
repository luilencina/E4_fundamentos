import java.util.Scanner;

public class AppBolinhasDeGude {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BolinhasDeGude bolinhasDeGude = new BolinhasDeGude();

        // bem vindo
        System.out.println("Olá, qual seu nome ?");
        String nome = in.nextLine();
        System.out.println("Seja Bem vindo(a) " + nome + "!");

        //para abrir o menu
        System.out.println("Digite 1 para abrir o menu!");
        int menu = in.nextInt();
        while(menu != 1){
            System.out.println("Opção inválida, tente novamente!");
            menu = in.nextInt();
        }


        // menu
            do {
                // espaço so para ficar mais boniitinho <3
                System.out.println(" . ");
            System.out.println(" . ");
            System.out.println(" . ");
                // espaço so para ficar mais boniitinho <3

                System.out.println("Selecione o que deseja fazer: ");
            System.out.println("1 - Realizar uma compra");
            System.out.println("2 - Ver quantidade em estoque");
            System.out.println("3 - Adicionar bolinhas ao estoque");
            System.out.println("0 - Sair! ");
            menu = in.nextInt();
            //opções
            switch (menu) {
                case 0:
                    System.out.println("Volte sempre, Até mais " + nome + "!");
                    break;
                case 1:
                    System.out.println("Insira a quantidade de bolinhas que deseja adquirir: ");
                    int quantComprar = in.nextInt();
                    while(quantComprar < 0){
                        System.out.println("Valor inválido, tente novamente!");
                        quantComprar = in.nextInt();
                    }
                    int quantEstoque = bolinhasDeGude.RealizarCompra(quantComprar);
                    System.out.println("Obrigada pela compra!");
                    break;
                case 2:
                    System.out.println("Quantidade em TOTAL em estoque: " + bolinhasDeGude.QuantEstoque());
                    System.out.println("Quantidade de bolinhas PEQUENAS: " + bolinhasDeGude.quanTamP);
                    System.out.println("Quantidade de bolinhas MÉDIAS: " + bolinhasDeGude.quanTamM);
                    System.out.println("Quantidade de bolinhas GRANDES: " + bolinhasDeGude.quanTamG);
                    break;
                case 3:
                    System.out.println("Insira a quantidade de bolinhas que deseja adicionar ao estoque: ");
                    int quantAdicionar = in.nextInt();
                    while(quantAdicionar < 0){
                        System.out.println("Valor inválido, tente novamente!");
                        quantAdicionar = in.nextInt();
                    }
                    int adicionar = bolinhasDeGude.AdicionarBolinhas(quantAdicionar);
                    System.out.println("Quantidade em TOTAL em estoque: " + bolinhasDeGude.QuantEstoque());
                    System.out.println("Quantidade de bolinhas PEQUENAS: " + bolinhasDeGude.quanTamP);
                    System.out.println("Quantidade de bolinhas MÉDIAS: " + bolinhasDeGude.quanTamM);
                    System.out.println("Quantidade de bolinhas GRANDES: " + bolinhasDeGude.quanTamG);
                    break;
                default:
                    System.out.println("Opção inválida, Tente novamente seguindo as opções dadas acima.");
                    break;
                     }
                } while(menu != 0);

    } // fecha main

} // fecha tudo

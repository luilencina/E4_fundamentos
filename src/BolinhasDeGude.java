import java.util.Scanner;

public class BolinhasDeGude {

    public String tamanhoBolinhas(){
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha o tamanho das bolinhas que deseja comprar:");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Grande");
        int tam = in.nextInt();

        // validação tamanho
        while( tam < 1 || tam > 3){
            System.out.println("Opção inválida, Tente novamente seguindo as opções dadas acima.");
            tam = in.nextInt();
        }

        switch(tam){
            case 1: return "Pequeno";
            case 2: return "Médio";
            case 3: return "Grande";
            default: return "Pequeno";
        }
    }

    public int QuantEstoque(int quantComprado){
        Scanner in = new Scanner(System.in);
        AppBolinhasDeGude appBolinhasDeGude = new AppBolinhasDeGude();

        //variaveis
        int quantTotal = 600;

        //validacao
        while(quantComprado > quantTotal){
            System.out.println("Valor indisponivél para compra. Valor de bolinhas disponivéis: ");
            System.out.println(quantTotal);
            quantComprado = in.nextInt();
        }

        int quantEstoque = quantTotal - quantComprado;

        System.out.println("Nova Quantidade em estoque: " + quantEstoque);
        System.out.println("Quantidade Comprada: " + quantComprado);
        System.out.println("Quantidade de caixas cecessárias para entrega: " + 0);

        return quantEstoque;
    }

}

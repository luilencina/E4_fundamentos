import java.util.Scanner;

public class BolinhasDeGude {

    public int tamanhoBolinhas() {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha o tamanho da(s) bolinha(s): ");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Grande");
        int tam = in.nextInt();

        // validação tamanho
        while (tam < 1 || tam > 3) {
            System.out.println("Opção inválida, Tente novamente seguindo as opções dadas acima.");
            tam = in.nextInt();
        }

        // switch(tam){
        //   case 1: return "Pequeno";
        //  case 2: return "Médio";
        // case 3: return "Grande";
        // default: return "Pequeno";
        //    }

        return tam;
    }

    public int QuantEstoque(int quantComprado) {
        Scanner in = new Scanner(System.in);
        // AppBolinhasDeGude appBolinhasDeGude = new AppBolinhasDeGude();

        //variaveis
        int quantTotal = 600;
        int tam = tamanhoBolinhas();

        //validacao
        while (quantComprado > quantTotal) {
            System.out.println("Valor indisponivél para compra. Valor de bolinhas disponivéis: ");
            System.out.println(quantTotal);
            quantComprado = in.nextInt();
        }

        int quantEstoque = quantTotal - quantComprado;

        System.out.println("Nova Quantidade em estoque: " + quantEstoque);
        System.out.println("Quantidade Comprada: " + quantComprado);
        System.out.println("Quantidade de caixas cecessárias para entrega: " + QuantCaixas(tam, quantComprado));

        return quantEstoque;
    }


    public int QuantCaixas(int tam, int quantComprado) {
        Scanner in = new Scanner(System.in);

        //variaveis
        int quantCaixas = 0;

        switch (tam) {
            case 1:
                quantCaixas = quantComprado % 150;
                if (quantCaixas == 0) {
                    quantCaixas = quantComprado / 150;
                } else {
                    quantCaixas = (quantComprado / 150) + 1;
                }
                System.out.println("Você selecionou o tamanho PEQUENO!");
                break;

            case 2:
                quantCaixas = quantComprado % 100;
                if (quantCaixas == 0) {
                    quantCaixas = quantComprado / 100;
                } else {
                    quantCaixas = (quantComprado / 100) + 1;
                }
                System.out.println("Você selecionou o tamanho MÉDIO!");
                break;

            case 3:
                quantCaixas = quantComprado % 50;
                if (quantCaixas == 0) {
                    quantCaixas = quantComprado / 50;
                } else {
                    quantCaixas = (quantComprado / 50) + 1;
                }
                System.out.println("Você selecionou o tamanho GRANDE!");
                break;

            //caso nao tenha tamanho assumir que ela é pequena :)
            default:
                quantCaixas = quantComprado % 150;
                if (quantCaixas == 0) {
                    quantCaixas = quantComprado / 150;
                } else {
                    quantCaixas = (quantComprado / 150) + 1;
                }
                System.out.println("Você selecionou o tamanho PEQUENO!");
                break;

        }

        return quantCaixas;
    }
}

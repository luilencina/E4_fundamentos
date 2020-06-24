import java.util.Scanner;

public class BolinhasDeGude {
    int quanTamP = 1500;
    int quanTamM = 1000;
    int quanTamG = 500;

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

        int tam = tamanhoBolinhas();
        int quantEstoque = 0;

        switch(tam){
            case 1:
                    System.out.println("Valor disponivel: " + quanTamP);
                    quantEstoque = quanTamP - quantComprado;
                    break;

            case 2:
                    System.out.println("Valor disponivel: " + quanTamM);
                   quantEstoque = quanTamM - quantComprado;
                   break;

            case 3:
                    System.out.println("Valor disponivel: " + quanTamG);
                    quantEstoque = quanTamG - quantComprado;
                    break;

            default:
                    System.out.println("Valor disponivel: " + quanTamP);
                   quantEstoque = quanTamP - quantComprado;
                   break;
        }

        int quantEstoqueTotal = quanTamG + quanTamP + quanTamM;

        System.out.println("Nova quantidade de tamanho " + tam + " disponivel: " + quantEstoque);
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

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

        // caso for diferente, ele vai botar == 1
        while (tam < 1 || tam > 3) {
            System.out.println("Opção inválida, Tente novamente seguindo as opções dadas acima.");
            tam = in.nextInt();
        }

        return tam;
    }

    public String toString(){
        return "Total: " + QuantEstoque() + "\nPequeno: " + quanTamP + " \nMédio: " + quanTamM + "\nGrande: " + quanTamG;
    }

    public int QuantEstoque() {
       int quantEstoqueTotal = quanTamP + quanTamG + quanTamM;
       return quantEstoqueTotal;
    }

    public int AdicionarBolinhas(int quantAdicionar){
        Scanner in = new Scanner(System.in);

        int tam = tamanhoBolinhas();

        switch (tam){
            case 1: return  quanTamP = quanTamP + quantAdicionar;
            case 2: return quanTamM = quanTamM + quantAdicionar;
            case 3: return quanTamG = quanTamG + quantAdicionar;
            default: return quanTamP = quanTamP + quantAdicionar;
        }

    }

    public int RealizarCompra(int quantComprado){
        Scanner in = new Scanner(System.in);

        int tam = tamanhoBolinhas();
        int quantEstoque = 0;

        switch(tam){
            case 1:
                while(quantComprado > quanTamP ) {
                    System.out.println("valor inserido é maior que o disponivel");
                    System.out.println("Valor disponivel: " + quanTamP);
                    quantComprado = in.nextInt();
                }
                quanTamP = quanTamP - quantComprado;
                quantEstoque = quanTamP;
                System.out.println("Nova quantidade de tamanho " + tam + " disponivel: " + quanTamP);
                break;

            case 2:
                while(quantComprado > quanTamM ) {
                    System.out.println("valor inserido é maior que o disponivel");
                    System.out.println("Valor disponivel: " + quanTamM);
                    quantComprado = in.nextInt();
                }
                quanTamM = quanTamM - quantComprado;
                quantEstoque = quanTamM;
                System.out.println("Nova quantidade de tamanho " + tam + " disponivel: " + quanTamM);
                break;

            case 3:
                while(quantComprado > quanTamG ) {
                    System.out.println("valor inserido é maior que o disponivel");
                    System.out.println("Valor disponivel: " + quanTamG);
                    quantComprado = in.nextInt();
                }
                quanTamG = quanTamG - quantComprado;
                quantEstoque = quanTamG;
                System.out.println("Nova quantidade de tamanho " + tam + " disponivel: " + quanTamG);
                break;

            default:
                while(quantComprado > quanTamP ) {
                    System.out.println("valor inserido é maior que o disponivel");
                    System.out.println("Valor disponivel: " + quanTamP);
                    quantComprado = in.nextInt();
                }
                quanTamP = quanTamP - quantComprado;
                quantEstoque = quanTamP;
                System.out.println("Nova quantidade de tamanho " + tam + " disponivel: " + quanTamP);
                break;
        }

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

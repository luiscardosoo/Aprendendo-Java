import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Produto[] estoque = new Produto[10];
        int n = -1;
        int contador = 0;

    while(n != 0){
        System.out.println("-- SISTEMA DE ESTOQUE --");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Remover Produtos");
        System.out.println("0. Sair");
        n = scanner.nextInt();
        if(n == 1){
            System.out.println("Informe o ID do produto: " );
            int id = scanner.nextInt();
            boolean flag = false;
            do {
                flag = false;
                for (int i = 0; i < contador; i++) {
                    if (id == estoque[i].id) {
                        flag = true;
                        System.out.println("Já existe esse ID, informe um ID diferente: ");
                        id = scanner.nextInt();
                    }
                    break;
                }
            } while(flag == true);

            System.out.println("Infome o nome do produto: ");
            String nome = scanner.next();
            System.out.println("Infome o preco do produto: ");
            double preco = scanner.nextDouble();
            System.out.println("Informe se você vai cadastrar um produto Eletronico(1) ou um Livro(2)");
            int cad = scanner.nextInt();
            if(cad == 1){
                System.out.println("Informe a marca do Eletronico: ");
                String marca = scanner.next();
                estoque[contador] = new Eletronico(id, nome, preco, marca);
                contador++;
            }
            if(cad == 2){
                System.out.println("Informe o autor do Livro: ");
                String autor = scanner.next();
                estoque[contador] = new Livro(id, nome, preco, autor);
                contador++;
            }
            }
        if(n == 2){
            for(int i = 0; i < contador; i++){
                estoque[i].exibirDetalhes();
            }
        }
        if(n == 3){
            System.out.println("Informe o ID do produto a ser removido: ");
            int IDremovido = scanner.nextInt();

            for(int i = 0; i < contador; i++){
                if(estoque[i].id == IDremovido){
                    for(int j = i; j < contador - 1; j++) {
                        estoque[j] = estoque[j + 1];
                    }
                }
            }
            estoque[contador] = null;
            contador--;
        }

    }
    }
}
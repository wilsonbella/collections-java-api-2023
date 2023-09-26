package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        items.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();
        for (Item i : items){
            if (i.getNome().equalsIgnoreCase(nome)){
                listaParaRemover.add(i);
            }
        }
        items.removeAll(listaParaRemover);
    }
    public void calculaValorTotal(double preco, int quantidade){
        List<Item> itensCalculados = new ArrayList<>();
        for (Item i : items){

            }

        }



    public void exibirItens(){
        System.out.println(items);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Pão",35, 2 );
        carrinhoDeCompras.adicionarItem("Feijão",65, 2);

        System.out.println("o valor total dos itens é : " );

    }
}

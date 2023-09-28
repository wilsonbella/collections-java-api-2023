package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivros(String titulo,String autor, int anoDePublicacao){
        livrosList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for(Livro l : livrosList)
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList ){
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal)
                    livrosPorIntervaloDeAnos.add(l);
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("livro 1", "autor 1°", 1999);
        catalogoLivros.adicionarLivros("livro 1", "autor 2°", 2000);
        catalogoLivros.adicionarLivros("livro 2", "autor 2°", 2001);
        catalogoLivros.adicionarLivros("livro 3", "autor 3°", 2002);

        System.out.println("O autor 2° publicou esses livrros : " + catalogoLivros.pesquisarPorAutor("autor 2°"));

        System.out.println("O intervalo de ano é : " + catalogoLivros.pesquisarPorIntervaloDeAnos(1999,2000));

        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));


    }
}

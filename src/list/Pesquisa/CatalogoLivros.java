package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pequisarPorIntervaloAno(int anoInicio, int anoFim){
        List<Livro> livrosPorIntervaloAnos = new ArrayList();
        if(!livroList.isEmpty()){
           for(Livro l : livroList){
            if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim){
                livrosPorIntervaloAnos.add(l);
            }

           } 
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pequisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo =  l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogo.pequisarPorIntervaloAno(2020, 2021));
        System.out.println(catalogo.pequisarPorTitulo("Livro 1"));
    }
    
}

package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    } 

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrdenados = new TreeSet<>(produtoSet);
        return produtosOrdenados;

    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorPorPreco());
        produtosOrdenados.addAll(produtoSet);
        return produtosOrdenados;
    }

    public static void main(String[] args){
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Notebook", 123456, 2500.00, 10);
        cadastroProdutos.adicionarProduto("Smartphone", 654321, 1500.00, 20);
        cadastroProdutos.adicionarProduto("Tablet", 111222, 1200.00, 15);
        cadastroProdutos.adicionarProduto("Monitor", 333444, 800.00, 5);

        System.out.println(cadastroProdutos.produtoSet);

         System.out.println("------------------------------");

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("------------------------------");

        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}

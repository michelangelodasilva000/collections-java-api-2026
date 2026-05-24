package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[] args){

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 2);

        estoque.exibirProdutos();

        System.out.println("--------------------------");

        System.out.println("Valor tatal :" + estoque.calcularValorTotal());
        System.out.println("Produto mais caro :" + estoque.obterProdutoMaisCaro());


    }


}



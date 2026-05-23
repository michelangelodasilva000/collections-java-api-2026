package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    
    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigo(int codigoConvidado){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        for(Convidado c : convidadoSet){
            System.out.println(c);
        }
    }

    public static void main(String[] args){
        ConjutoConvidados conjuntoConvidados = new ConjutoConvidados();
        System.out.println("Exibir " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 5678);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 5678);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 3456);
        
        conjuntoConvidados.exibirConvidados();

        

        System.out.println("Exibir " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigo(1234);

        System.out.println("Exibir " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
    }
}

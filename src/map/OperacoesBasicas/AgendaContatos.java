package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atrtibutos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome =agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public void exibirContatos(){
        for(Map.Entry<String, Integer> contato : agendaContatoMap.entrySet()){
            System.out.println("Nome: " + contato.getKey() + " - Número: " + contato.getValue());
        }
    }

    public static void main(String[] args){

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Pedro", 555555555);
        agendaContatos.adicionarContato("Ana", 111111111);
        agendaContatos.adicionarContato("Lucas", 222222222);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Pedro");
        System.out.println("------------------------------");

        agendaContatos.exibirContatos();

        
    }


}

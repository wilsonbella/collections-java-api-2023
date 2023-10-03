package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<Convidado>();
    }
    public void adicionarConvidado(String nome, int codigoDoConvite){
        convidadoSet.add(new Convidado(nome, codigoDoConvite));
    }
    public void removerConvidado(int codigoDoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
           if (c.getCodigoDoConvite() == codigoDoConvite){
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
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
       // System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro de Set Convidados ");

        conjuntoConvidados.adicionarConvidado("João", 1234);
        conjuntoConvidados.adicionarConvidado("Bruno", 1235);
        conjuntoConvidados.adicionarConvidado("Maria", 1235);
        conjuntoConvidados.adicionarConvidado("Silvia", 1236);

        conjuntoConvidados.removerConvidado(1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro de Set Convidados ");
        conjuntoConvidados.exibirConvidados();
    }

}

import java.io.Serializable;
import java.util.ArrayList;

public class DadosPlanos implements Serializable{
    private static ArrayList<Plano> vetPlano = new ArrayList<Plano>();

    public static ArrayList<Plano> getVet(){
        return vetPlano;
    }

    public static void cadastrar(Plano f){
    	DadosPlanos.vetPlano.add(f);
        System.out.println("Cadastrado!");
    }

    public static Plano buscar(String nome_plano){
        Plano p = null;
        for ( Plano objeto : DadosPlanos.vetPlano) {
            if(objeto.getNome_plano().equals(nome_plano)) {
                p = objeto;
                break;
            }
        }
        return p;
    }

    public static boolean excluir(String nome_plano){
    	Plano p = DadosPlanos.buscar(nome_plano);
        if(p != null){
        	DadosPlanos.vetPlano.remove(p);
            return true;
        }
        else {
            return false;
        }
    }
}


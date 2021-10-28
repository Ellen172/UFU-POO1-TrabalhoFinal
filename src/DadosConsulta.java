import java.io.Serializable;
import java.util.ArrayList;

public class DadosConsulta implements Serializable {
    private static ArrayList<Consulta> vetCons = new ArrayList<Consulta>();

    public static ArrayList<Consulta> getVetCons(){
        return DadosConsulta.vetCons;
    }

    public static void cadastrar (Consulta c){
    	DadosConsulta.vetCons.add(c);
        System.out.println("Cadastrado!");
    }

    public static void listar(){
        for(Consulta obj : DadosConsulta.vetCons){
            obj.mostrarDados();;
        }
    }

    public static Consulta buscar(String data, String horario){
        Consulta c = null;
        for(Consulta obj : DadosConsulta.vetCons){
            if(obj.getData().equals(data) && obj.getHorario().equals(horario)){
                c = obj;
                break;
            }
        }
        return c;
    }

    public static boolean excluir(String data, String horario){
        Consulta c = DadosConsulta.buscar(data, horario);
        if(c != null){
        	DadosConsulta.vetCons.remove(c);
            return true;
        }else{
            return false;
        }
    }
}

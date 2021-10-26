import java.io.Serializable;
import java.util.ArrayList;

public class DadosConsulta implements Serializable {
    private ArrayList<Consulta> vetCons = new ArrayList<Consulta>();

    public ArrayList<Consulta> getVetCons(){
        return this.vetCons;
    }

    public void cadastrar (Consulta c){
        this.vetCons.add(c);
        System.out.println("Cadastrado!");
    }

    public void listar(){
        for(Consulta obj : this.vetCons){
            obj.mostrarDados();;
        }
    }

    public Consulta buscar(String data, String horario){
        Consulta c = null;
        for(Consulta obj : this.vetCons){
            if(obj.getData().equals(data) && obj.getHorario().equals(horario)){
                c = obj;
                break;
            }
        }
        return c;
    }

    public boolean excluir(String data, String horario){
        Consulta c = this.buscar(data, horario);
        if(c != null){
            this.vetCons.remove(c);
            return true;
        }else{
            return false;
        }
    }
}

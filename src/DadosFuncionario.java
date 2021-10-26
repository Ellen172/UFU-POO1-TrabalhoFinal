import java.io.Serializable;
import java.util.ArrayList;

public class DadosFuncionario implements Serializable{
    private static ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();

    public static ArrayList<Funcionario> getVetFunc(){
        return vetFunc;
    }

    public static void cadastrar(Funcionario f){
    	DadosFuncionario.vetFunc.add(f);
        System.out.println("Cadastrado!");
    }

    public static void listar(){
        for( Funcionario objeto: DadosFuncionario.vetFunc) {
            objeto.mostrarDados();
        }
    }

    public static Funcionario buscar(String cpf){
        Funcionario f = null;
        for ( Funcionario objeto : DadosFuncionario.vetFunc) {
            if(objeto.getCpf_func().equals(cpf)) {
                f = objeto;
                break;
            }
        }
        return f;
    }

    public static boolean excluir(String cpf){
        Funcionario f = DadosFuncionario.buscar(cpf);
        if(f != null){
        	DadosFuncionario.vetFunc.remove(f);
            return true;
        }
        else {
            return false;
        }
    }
}

import java.util.ArrayList;

public class DadosFuncionario {
    private ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();

    public ArrayList<Funcionario> getVetFunc(){
        return this.vetFunc;
    }

    public void cadastrar(Funcionario f){
        this.vetFunc.add(f);
        System.out.println("Total de funcionários: ");
        System.out.println(this.vetFunc.size());
    }

    public void listar(){
        for( Funcionario objeto: this.vetFunc) {
            objeto.mostrarDados();
        }
    }

    public Funcionario buscar(String cpf){
        Funcionario f = null;
        for ( Funcionario objeto : this.vetFunc) {
            if(objeto.getCpf_func().equals(cpf)) {
                f = objeto;
                break;
            }
        }
        return f;
    }

    public boolean excluir(String cpf){
        Funcionario f = this.buscar(cpf);
        if(f != null){
            this.vetFunc.remove(f);
            return true;
        }
        else {
            return false;
        }
    }
}

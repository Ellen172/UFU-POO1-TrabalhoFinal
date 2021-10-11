import java.util.ArrayList;

class DadosPaciente {
    
    private ArrayList<Paciente> vetPac = new ArrayList<Paciente>();

        public void cadastrar (Paciente c){
            this.vetPac.add(c);
            System.out.println("Total de pacientes:");
            System.out.println(this.vetPac.size());
        }
            
        public void listar(){
            for( Paciente objeto: this.vetPac){
                objeto.mostrarDados();
            }
        }
        public Paciente buscar(String cpf){
            Paciente c = null;
            for(Paciente objeto: this.vetPac){
                if(objeto.getCpf_pac().equals(cpf)){
                    c = objeto;
                    break;
                }
            }
            return c;
        }
        public boolean excluir(String cpf){
            Paciente c = this.buscar(cpf);
            if(c != null){
                this.vetPac.remove(c);
                return true;
            }
            else {
                return false;
            }
        }
    }
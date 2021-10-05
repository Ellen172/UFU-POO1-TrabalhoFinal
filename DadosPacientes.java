import java.util.ArrayList;

class DadosPacientes {
    
    private ArrayList<Pacientes> vetPac = new ArrayList<Paciente>();

        public void cadastrar (Paciente c){
            this.vetPac.add(c);//ADICIONA O PACIENTE NO ARRAY
            System.out.println("Totaldepacientes:");
            System.out.println(this.vetPac.size());
        }
            
        public void listar(){
            for( Paciente objeto: this.vetPac){
                objeto.mostrarDados();
                //métodomostrarDados();
            }
        }
        //este método retorna o objeto Paciente caso encontrado, ou null, caso não encontrado
        public Paciente buscar(String cpf){//pode-se usar também int Paciente c = null;
            for(Paciente objeto: this.vetPac){
                if(objeto.getCPF().equals(cpf)){
                    c = objeto;
                    break;
                }
            }return c;
        }
        //este método usa o método buscar já implementado
        public boolean excluir(String cpf, Object c){
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
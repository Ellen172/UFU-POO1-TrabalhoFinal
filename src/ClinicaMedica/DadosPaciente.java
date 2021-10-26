package ClinicaMedica;
import java.io.Serializable;
import java.util.ArrayList;

public class DadosPaciente implements Serializable{
    
    private static ArrayList<Paciente> vetPac = new ArrayList<Paciente>();

        public ArrayList<Paciente> getVetPac(){
            return DadosPaciente.vetPac;
        }

        public static void cadastrar (Paciente c){
            DadosPaciente.vetPac.add(c);
            System.out.println("Cadastrado!");
        }
            
        public static void listar(){
            for( Paciente objeto: DadosPaciente.vetPac){
                objeto.mostrarDados();
            }
        }
        public static Paciente buscar(String cpf){
            Paciente c = null;
            for(Paciente objeto: DadosPaciente.vetPac){
                if(objeto.getCpf_pac().equals(cpf)){
                    c = objeto;
                    break;
                }
            }
            return c;
        }
        public static boolean excluir(String cpf){
            Paciente c = DadosPaciente.buscar(cpf);
            if(c != null){
                DadosPaciente.vetPac.remove(c);
                return true;
            }
            else {
                return false;
            }
        }
    }
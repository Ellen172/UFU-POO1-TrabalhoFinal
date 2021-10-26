package ClinicaMedica;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

public class Principal implements Serializable{
    public static void main(String args[]){
    	DadosFuncionario func_data = new DadosFuncionario();
    	DadosPaciente pac_data = new DadosPaciente();
    	DadosConsulta cons_data = new DadosConsulta();
 	
    	JanelaPrincipal frame = new JanelaPrincipal();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(550, 240);
    	frame.setVisible(true);
    	    	z
    	for(int i=0; i<pac_data.getVetPac().size(); i++) {
    		pac_data.getVetPac().get(i).mostrarDados();
    	}
    	System.out.println("Fim");
    	
    	
/*
    	Plano p[] = new Plano[2];
    	p[0] = new Plano("prime", "25124145004898");
        p[1] = new Plano("vip", "45487748784198");
        
    	Medico med1 = new Medico("49221854884", p);
        Outro_funcionario o1 = new Outro_funcionario("Atendente", 1200.5, "89053300023");
        Paciente p1 = new Paciente("Karen", "49221854884", "RJ45487487", (byte)0, "Feminino", "12/07/1998", "23/04/2012");
        Consulta c1 = new Consulta(med1, p1);
        c1.realizarConsulta("Lozoprazol, Ameniaki", "2 comprimidos de cada", "a cada 9h", 250.45, med1, o1, p1);
        
        func_data.cadastrar(med1);
        func_data.cadastrar(o1);
        //func_data.listar();

        pac_data.cadastrar(p1);
        //pac_data.listar();

        cons_data.cadastrar(c1);
        //cons_data.listar();

        EscreveDados(func_data, pac_data, cons_data);
*/
    }
    
    private static void EscreveDados(DadosFuncionario func_data, DadosPaciente pac_data, DadosConsulta cons_data) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
	    ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();
	    vetFunc = func_data.getVetFunc();
	    ArrayList<Paciente> vetPac = new ArrayList<Paciente>();
	    vetPac = pac_data.getVetPac();
	    ArrayList<Consulta> vetCons = new ArrayList<Consulta>();
	    vetCons = cons_data.getVetCons();
		
		try {
			fos = new FileOutputStream("Dados.bin");
			oos = new ObjectOutputStream(fos);
			
			for(int i=0; i<vetFunc.size(); i++) {
				if(vetFunc.get(i) instanceof Medico)
					oos.writeObject((Medico)vetFunc.get(i));
				if(vetFunc.get(i) instanceof Outro_funcionario)
					oos.writeObject((Outro_funcionario)vetFunc.get(i));
				oos.writeObject(vetFunc.get(i));
			}
			for(int i=0; i<vetPac.size(); i++) {
				if(vetPac.get(i) instanceof ComPlano)
					oos.writeObject((ComPlano)vetPac.get(i));
				if(vetPac.get(i) instanceof SemPlano)
					oos.writeObject((SemPlano)vetPac.get(i));
				oos.writeObject(vetPac.get(i));
			}
			for(int i=0; i<vetCons.size(); i++) {
				oos.writeObject(vetCons.get(i));
			}

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo");
			System.out.println(e.getMessage());
		} finally { 
			if (oos != null) { 
				try {
					oos.close(); 
				} catch (IOException  e) {
					System.out.println("Erro ao fechar o arquivo");
				}
			}
		}
    }

}

import java.io.*;

public class Principal implements Serializable{
    public static void main(String args[]){
        Plano p[] = new Plano[2];

        DadosFuncionario func_data = new DadosFuncionario();
        DadosPaciente pac_data = new DadosPaciente();
        DadosConsulta cons_data = new DadosConsulta();

        p[0] = new Plano("prime", "25124145004898");
        p[1] = new Plano("vip", "45487748784198");
        
        Medico f1 = new Medico("49221854884", p);
        Outro_funcionario o1 = new Outro_funcionario("Atendente", 1200.5, "89053300023");
        Paciente p1 = new Paciente("Karen", "49221854884", "RJ45487487", (byte)0, "Feminino", "12/07/1998", "23/04/2012");
        Consulta c1 = new Consulta(f1, p1);
        c1.realizarConsulta("Lozoprazol, Ameniaki", "2 comprimidos de cada", "a cada 9h", 250.45, f1, o1, p1);

        func_data.cadastrar(f1);
        func_data.cadastrar(o1);
        func_data.listar();

        pac_data.cadastrar(p1);
        pac_data.listar();

        cons_data.cadastrar(c1);
        cons_data.listar();


        // ESCREVENDO DADOS
        FileOutputStream escritorArquivo = null;
		ObjectOutputStream escritorObj = null;

        try {
			escritorArquivo = new FileOutputStream("Clinica_Dados");
			escritorObj = new ObjectOutputStream(escritorArquivo);

            //escritorObj.writeObject(cons_data.getVetCons());
            //escritorObj.writeObject(cons_data);
            int n1 = cons_data.getVetCons().size();
            for(int i=0; i<n1; i++){
                escritorObj.writeObject(cons_data.getVetCons().get(i));
                // escritorObj.writeObject(cons_data.getVetCons().get(i).getData());
                // escritorObj.writeObject(cons_data.getVetCons().get(i).getHorario());
                // escritorObj.writeObject(cons_data.getVetCons().get(i).getMedicamento());
                // escritorObj.writeObject(cons_data.getVetCons().get(i).getObs_geral());
                // escritorObj.writeObject(cons_data.getVetCons().get(i).getReceita());
                // escritorObj.writeObject(+ cons_data.getVetCons().get(i).getVal_cons());
            }
            
            //escritorObj.writeObject(func_data.getVetFunc());
            //escritorObj.writeObject(func_data);
            int n2 = func_data.getVetFunc().size();
            for(int i=0; i<n2; i++){
                escritorObj.writeObject(func_data.getVetFunc().get(i));
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getNome_func());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getCpf_func());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getRg_func());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getEst_Civ());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getDat_adm());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getCtps());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getLogin());
            //     escritorObj.writeObject(func_data.getVetFunc().get(i).getSenha());
            //     if(func_data.getVetFunc().get(i) instanceof Medico){
                //         escritorObj.writeObject(((Medico)func_data.getVetFunc().get(i)).getCrm());
                //         escritorObj.writeObject(((Medico)func_data.getVetFunc().get(i)).getEspecialidades());
                //         escritorObj.writeObject(((Medico)func_data.getVetFunc().get(i)).getSal_mensal());
                //         escritorObj.writeObject(((Medico)func_data.getVetFunc().get(i)).getPlanos());
                //     } 
                //     else if(func_data.getVetFunc().get(i) instanceof Outro_funcionario){
                    //         escritorObj.writeObject(((Outro_funcionario)func_data.getVetFunc().get(i)).getCargo());
                    //         escritorObj.writeObject(((Outro_funcionario)func_data.getVetFunc().get(i)).getSal_fixo());
                    //     } 
                    //     else {
                //         continue;
                //     }
            }
                        
            //escritorObj.writeObject(pac_data.getVetPac());
            //escritorObj.writeObject(pac_data);
            int n3 = pac_data.getVetPac().size();
            for(int i=0; i<n3; i++){
                escritorObj.writeObject(pac_data.getVetPac().get(i));
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getNome_pac());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getCpf_pac());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getRg_pac());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getEst_civ());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getSexo());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getDat_nas());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getDat_cad());
            //     escritorObj.writeObject(pac_data.getVetPac().get(i).getUlt_cons());
            //     if(pac_data.getVetPac().get(i) instanceof ComPlano){
            //         escritorObj.writeObject(((ComPlano)pac_data.getVetPac().get(i)).getNro_cart());
            //         escritorObj.writeObject(((ComPlano)pac_data.getVetPac().get(i)).getData_ing());
            //         escritorObj.writeObject(((ComPlano)pac_data.getVetPac().get(i)).getPer_carencia());
            //     } 
            //     else if(pac_data.getVetPac().get(i) instanceof SemPlano) {
            //         escritorObj.writeObject(((SemPlano)pac_data.getVetPac().get(i)).getDes_esp());
            //         escritorObj.writeObject(((SemPlano)pac_data.getVetPac().get(i)).getVal_pago());
            //     } 
            //     else {
            //         continue;
            //     }
            }

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (escritorArquivo != null ) escritorArquivo.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

    }
}

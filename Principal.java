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
        Outro_funcionario o1 = new Outro_funcionario("Atendente", 1200.5);
        Paciente p1 = new Paciente("Karen", "13747105637", "RJ45487487", (byte)0, "Feminino", "12/07/1998", "23/04/2012");
        Consulta c1 = new Consulta(f1, p1);
        c1.realizarConsulta("Lozoprazol, Ameniaki", "2 comprimidos de cada", "a cada 9h", 250.45, f1, o1, p1);

        System.out.println(c1.getData());
        System.out.println(c1.getHorario());

        func_data.cadastrar(f1);
        func_data.cadastrar(o1);
        func_data.listar();

        pac_data.cadastrar(p1);
        pac_data.listar();

        cons_data.cadastrar(c1);
        cons_data.listar();

        FileOutputStream escritorArquivo = null;
		ObjectOutputStream escritorObj = null;

        try {
			escritorArquivo = new FileOutputStream("Clinica_Dados");
			escritorObj = new ObjectOutputStream(escritorArquivo);

			escritorObj.writeObject("==== Consultas ====\n");
            int n1 = cons_data.getVetCons().size();
            for(int i=0; i<n1; i++){
                escritorObj.writeObject("Data: " + cons_data.getVetCons().get(i).getData() + "\n");
                escritorObj.writeObject("Horario: " + cons_data.getVetCons().get(i).getHorario() + "\n");
                escritorObj.writeObject("Medicamento: " + cons_data.getVetCons().get(i).getMedicamento() + "\n");
                escritorObj.writeObject("Observação geral: " + cons_data.getVetCons().get(i).getObs_geral() + "\n");
                escritorObj.writeObject("Receita: " + cons_data.getVetCons().get(i).getReceita() + "\n");
                escritorObj.writeObject("Valor da Consulta: " + cons_data.getVetCons().get(i).getVal_cons() + "\n");
            }

            escritorObj.writeObject("==== Funcionarios ====\n");
            int n2 = func_data.getVetFunc().size();
            for(int i=0; i<n2; i++){
                escritorObj.writeObject("Nome: " + func_data.getVetFunc().get(i).getNome_func() + "\n");
                escritorObj.writeObject("Cpf: " + func_data.getVetFunc().get(i).getCpf_func() + "\n");
                escritorObj.writeObject("Rg: " + func_data.getVetFunc().get(i).getRg_func() + "\n");
                escritorObj.writeObject("Estado civil: " + func_data.getVetFunc().get(i).getEst_Civ() + "\n");
                escritorObj.writeObject("Data de admissão: " + func_data.getVetFunc().get(i).getDat_adm() + "\n");
                escritorObj.writeObject("CTPS: " + func_data.getVetFunc().get(i).getCtps() + "\n");
                escritorObj.writeObject("Login: " + func_data.getVetFunc().get(i).getLogin() + "\n");
                escritorObj.writeObject("Senha: " + func_data.getVetFunc().get(i).getSenha() + "\n");
                if(func_data.getVetFunc().get(i) instanceof Medico){
                    escritorObj.writeObject("Crm: " + ((Medico)func_data.getVetFunc().get(i)).getCrm() + "\n");
                    escritorObj.writeObject("Especialidades: " + ((Medico)func_data.getVetFunc().get(i)).getEspecialidades() + "\n");
                    escritorObj.writeObject("Salario Mensal: " + ((Medico)func_data.getVetFunc().get(i)).getSal_mensal() + "\n");
                    escritorObj.writeObject("Planos: " + ((Medico)func_data.getVetFunc().get(i)).getPlanos() + "\n");
                }
                else {
                    escritorObj.writeObject("Cargo: " + ((Outro_funcionario)func_data.getVetFunc().get(i)).getCargo() + "\n");
                    escritorObj.writeObject("Salario fixo: " + ((Outro_funcionario)func_data.getVetFunc().get(i)).getSal_fixo() + "\n");
                }
            }
            
            escritorObj.writeObject("==== Pacientes ====\n");
            int n3 = pac_data.getVetPac().size();
            for(int i=0; i<n3; i++){
                escritorObj.writeObject("Nome: " + pac_data.getVetPac().get(i).getNome_pac() + "\n");
                escritorObj.writeObject("Cpf: " + pac_data.getVetPac().get(i).getCpf_pac() + "\n");
                escritorObj.writeObject("Rg: " + pac_data.getVetPac().get(i).getRg_pac() + "\n");
                escritorObj.writeObject("Estado civil: " + pac_data.getVetPac().get(i).getEst_civ() + "\n");
                escritorObj.writeObject("Sexo: " + pac_data.getVetPac().get(i).getSexo() + "\n");
                escritorObj.writeObject("Data de nascimento: " + pac_data.getVetPac().get(i).getDat_nas() + "\n");
                escritorObj.writeObject("Data de cadastro: " + pac_data.getVetPac().get(i).getDat_cad() + "\n");
                escritorObj.writeObject("Data da ultima consulta: " + pac_data.getVetPac().get(i).getUlt_cons() + "\n");
                if(pac_data.getVetPac().get(i) instanceof ComPlano){
                    escritorObj.writeObject("Numero do cartão: " + ((ComPlano)pac_data.getVetPac().get(i)).getNro_cart() + "\n");
                    escritorObj.writeObject("Data de ingresso: " + ((ComPlano)pac_data.getVetPac().get(i)).getData_ing() + "\n");
                    escritorObj.writeObject("Periodo de carência: " + ((ComPlano)pac_data.getVetPac().get(i)).getPer_carencia() + "\n");
                } else {
                    escritorObj.writeObject("Possui desconto especial: " + ((SemPlano)pac_data.getVetPac().get(i)).getDes_esp() + "\n");
                    escritorObj.writeObject("Valor pago: " + ((SemPlano)pac_data.getVetPac().get(i)).getVal_pago() + "\n");
                }
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

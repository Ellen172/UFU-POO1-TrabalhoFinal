import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField varCpf;
	private JButton btnBuscar;
	private JLabel lblRetornoBusca = new JLabel();
	private JLabel lblCpf = new JLabel();
	private JLabel lblrg = new JLabel();
	private JLabel lblEstCiv = new JLabel();
	private JLabel lblDataAdm = new JLabel();
	private JLabel lblCtps = new JLabel();
	private JLabel lblSenha = new JLabel();
	private JLabel lblCrm = new JLabel();
	private JLabel lblEspecialidades = new JLabel();
	private JLabel lblSalarioMensal = new JLabel();
	private JLabel lblPlanos = new JLabel();
	private JLabel lblNome = new JLabel();
	private JLabel lblCargo = new JLabel();
	private JLabel lblSalarioFixo = new JLabel();

	public ConsultaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Buscar Funcion\u00E1rio");
		lblCadastroDeFuncionrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeFuncionrio.setBounds(114, 11, 215, 32);
		lblCadastroDeFuncionrio.setBackground(Color.WHITE);
		contentPane.add(lblCadastroDeFuncionrio);
		
		varCpf = new JTextField();
		varCpf.setFont(new Font("Tahoma", Font.PLAIN, 11));
		varCpf.setBounds(109, 60, 196, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
				
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(315, 54, 97, 32);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(tratador);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF: ");
		lblDigiteOCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDigiteOCpf.setLabelFor(varCpf);
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDigiteOCpf.setBounds(10, 57, 97, 20);
		contentPane.add(lblDigiteOCpf);	
		
	}
	private class TrataBotoes implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnBuscar) {
				Funcionario f = DadosFuncionario.buscar(varCpf.getText());
				if(f == null) {
					lblCpf.hide();
					lblrg.hide();
					lblEstCiv.hide();
					lblDataAdm.hide();
					lblCtps.hide();
					lblSenha.hide();
					lblCrm.hide();
					lblEspecialidades.hide();
					lblSalarioMensal.hide();
					lblPlanos.hide();
					lblNome.hide();
					lblCargo.hide();
					lblSalarioFixo.hide();
					lblRetornoBusca.show();
					lblRetornoBusca.setText("Funcionario não encontrado!"); // não aparece
					lblRetornoBusca.setBounds(20, 98, 392, 14);
					contentPane.add(lblRetornoBusca);
				} else {
					lblRetornoBusca.hide();
					lblNome.setText("Nome: " + f.getNome_func());
					lblNome.setBounds(10, 98, 392, 14);
					contentPane.add(lblNome);
					
					lblCpf.setText("Cpf : " + f.getCpf_func());
					lblCpf.setBounds(10, 123, 198, 14);
					contentPane.add(lblCpf);
					
					lblrg.setText("Rg: " + f.getRg_func());
					lblrg.setBounds(218, 123, 196, 14);
					contentPane.add(lblrg);
					
					lblEstCiv.setText("Estado civil: " + f.getEst_Civ());
					lblEstCiv.setBounds(10, 148, 198, 14);
					contentPane.add(lblEstCiv);
					
					lblDataAdm.setText("Data de admissao: " + f.getDat_adm());
					lblDataAdm.setBounds(218, 148, 194, 14);
					contentPane.add(lblDataAdm);
					
					lblCtps.setText("Ctps: " + f.getCtps());
					lblCtps.setBounds(10, 173, 198, 14);
					contentPane.add(lblCtps);
					
					lblSenha.setText("Senha: " + f.getSenha());
					lblSenha.setBounds(218, 173, 194, 14);
					contentPane.add(lblSenha);
					
					if(f instanceof Medico) {
						lblCargo.hide();
						lblSalarioFixo.hide();
						
						lblCrm.show();
						lblCrm.setText("Crm: " + ((Medico) f).getCrm());
						lblCrm.setBounds(10, 198, 46, 14);
						contentPane.add(lblCrm);
						
						lblEspecialidades.show();
						lblEspecialidades.setText("Especialidades: " + ((Medico) f).getEspecialidades());
						lblEspecialidades.setBounds(10, 223, 414, 14);
						contentPane.add(lblEspecialidades);
						
						lblSalarioMensal.show();
						lblSalarioMensal.setText("Salario: " + Double.toString(((Medico) f).getSal_mensal()));
						lblSalarioMensal.setBounds(10, 248, 198, 14);
						contentPane.add(lblSalarioMensal);
						
						lblPlanos.show();
						lblPlanos.setText("Planos: " + ((Medico) f).getPlanosNro());
						lblPlanos.setBounds(10, 273, 414, 14);
						contentPane.add(lblPlanos);
					}
					else if(f instanceof Outro_funcionario) {
						lblCrm.hide();
						lblEspecialidades.hide();
						lblSalarioMensal.hide();
						lblPlanos.hide();
						
						lblCargo.show();
						lblCargo.setText("Cargo: " + ((Outro_funcionario) f).getCargo());
						lblCargo.setBounds(10, 198, 198, 14);
						contentPane.add(lblCargo);
						
						lblSalarioFixo.show();
						lblSalarioFixo.setText("Salario Fixo: " + Double.toString(((Outro_funcionario) f).getSal_fixo()));
						lblSalarioFixo.setBounds(218, 198, 194, 14);
						contentPane.add(lblSalarioFixo);
					}
				}
			}
		}
		
	}
}

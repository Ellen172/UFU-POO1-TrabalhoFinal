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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Buscar Funcionário");
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
		
		// Não encontrado
		lblRetornoBusca.setBounds(20, 98, 392, 14);
		contentPane.add(lblRetornoBusca);
		
		// Funcionario
		lblNome.setBounds(10, 98, 392, 14);
		contentPane.add(lblNome);
		lblCpf.setBounds(10, 123, 198, 14);
		contentPane.add(lblCpf);
		lblrg.setBounds(218, 123, 196, 14);
		contentPane.add(lblrg);
		lblEstCiv.setBounds(10, 148, 198, 14);
		contentPane.add(lblEstCiv);
		lblDataAdm.setBounds(218, 148, 194, 14);
		contentPane.add(lblDataAdm);
		lblCtps.setBounds(10, 173, 198, 14);
		contentPane.add(lblCtps);
		lblSenha.setBounds(218, 173, 194, 14);
		contentPane.add(lblSenha);
		
		// Medico
		lblCrm.setBounds(10, 198, 414, 14);
		contentPane.add(lblCrm);
		lblEspecialidades.setBounds(10, 223, 414, 14);
		contentPane.add(lblEspecialidades);
		lblSalarioMensal.setBounds(10, 248, 198, 14);
		contentPane.add(lblSalarioMensal);
		lblPlanos.setBounds(10, 273, 414, 14);
		contentPane.add(lblPlanos);
		
		// Outros
		lblCargo.setBounds(10, 198, 198, 14);
		contentPane.add(lblCargo);
		lblSalarioFixo.setBounds(218, 198, 194, 14);
		contentPane.add(lblSalarioFixo);
	}
	private class TrataBotoes implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnBuscar) {
				Funcionario f = DadosFuncionario.buscar(varCpf.getText());
				if(f == null) {
					lblRetornoBusca.setText("Funcionario não encontrado!"); 
					lblCpf.setText("");
					lblrg.setText("");
					lblEstCiv.setText("");
					lblDataAdm.setText("");
					lblCtps.setText("");
					lblSenha.setText("");
					lblCrm.setText("");
					lblEspecialidades.setText("");
					lblSalarioMensal.setText("");
					lblPlanos.setText("");
					lblNome.setText("");
					lblCargo.setText("");
					lblSalarioFixo.setText("");
					
				} else {
					lblRetornoBusca.setText("");
					lblNome.setText("Nome: " + f.getNome_func());
					lblCpf.setText("Cpf : " + f.getCpf_func());
					lblrg.setText("Rg: " + f.getRg_func());
					lblDataAdm.setText("Data de admissao: " + f.getDat_adm());
					lblEstCiv.setText("Estado civil: " + f.getEst_Civ());
					lblCtps.setText("Ctps: " + f.getCtps());
					lblSenha.setText("Senha: " + f.getSenha());
					if(f instanceof Medico) {
						lblCargo.setText("");
						lblSalarioFixo.setText("");
						lblCrm.setText("Crm: " + ((Medico) f).getCrm());
						lblEspecialidades.setText("Especialidades: " + ((Medico) f).getEspecialidades());
						lblSalarioMensal.setText("Salario: " + Double.toString(((Medico) f).getSal_mensal()));
						lblPlanos.setText("Planos: " + ((Medico) f).getPlanosNro());
					}
					else if(f instanceof Outro_funcionario) {
						lblCrm.setText("");
						lblEspecialidades.setText("");
						lblSalarioMensal.setText("");
						lblPlanos.setText("");
						lblCargo.setText("Cargo: " + ((Outro_funcionario) f).getCargo());
						lblSalarioFixo.setText("Salario Fixo: " + Double.toString(((Outro_funcionario) f).getSal_fixo()));
					}
				}
			}
		}
		
	}
}

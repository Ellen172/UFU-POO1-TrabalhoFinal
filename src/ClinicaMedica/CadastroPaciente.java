package ClinicaMedica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CadastroPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField varNome;
	private JTextField varDataNasc;
	private JTextField varCpf;
	private JTextField varRg;
	JRadioButton varSolteiro;
	JRadioButton varCasado;
	JRadioButton varDivorciado;
	JComboBox varSexo;
	private JButton botaoSair;
	private JButton botaoEnviar;
	private JButton botaoLimpar;
	private JLabel txtUltCons;
	private JTextField varUltCons;
	
	Paciente pac = null;
		
	public CadastroPaciente() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TrataBotoes tratador = new TrataBotoes();
		
		varSolteiro = new JRadioButton("Solteiro(a)");
		varSolteiro.setBounds(92, 149, 102, 23);
		contentPane.add(varSolteiro);
		
		varCasado = new JRadioButton("Casado(a)");
		varCasado.setBounds(196, 149, 105, 23);
		contentPane.add(varCasado);
		
		varDivorciado = new JRadioButton("Divorciado(a)");
		varDivorciado.setBounds(303, 149, 119, 23);
		contentPane.add(varDivorciado);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(varSolteiro);bg.add(varCasado);bg.add(varDivorciado);
		
		varSexo = new JComboBox();
		varSexo.setBounds(380, 88, 94, 22);
		varSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		contentPane.add(varSexo);
		
		JLabel txtNome = new JLabel("Nome :");
		txtNome.setBounds(10, 64, 42, 14);
		contentPane.add(txtNome);
		
		JLabel txtDataNasc = new JLabel("Data de Nascimento :");
		txtDataNasc.setBounds(10, 92, 125, 15);
		contentPane.add(txtDataNasc);
		
		JLabel txtSexo = new JLabel("Sexo :");
		txtSexo.setBounds(318, 92, 42, 14);
		txtSexo.setLabelFor(varSexo);
		contentPane.add(txtSexo);
		
		JLabel txtCpf = new JLabel("CPF :");
		txtCpf.setBounds(10, 123, 31, 14);
		contentPane.add(txtCpf);
		
		JLabel txtRg = new JLabel("RG :");
		txtRg.setBounds(257, 123, 31, 14);
		contentPane.add(txtRg);
		
		JLabel txtEstCiv = new JLabel("Estado Civil :");
		txtEstCiv.setBounds(10, 153, 79, 14);
		txtEstCiv.setLabelFor(varSolteiro);
		contentPane.add(txtEstCiv);
		
		varNome = new JTextField();
		txtNome.setLabelFor(varNome);
		varNome.setBounds(62, 61, 412, 20);
		contentPane.add(varNome);
		varNome.setColumns(10);
		
		varDataNasc = new JTextField();
		txtDataNasc.setLabelFor(varDataNasc);
		varDataNasc.setBounds(145, 89, 143, 20);
		contentPane.add(varDataNasc);
		varDataNasc.setColumns(10);
		
		varCpf = new JTextField();
		txtCpf.setLabelFor(varCpf);
		varCpf.setBounds(51, 122, 171, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		varRg = new JTextField();
		txtRg.setLabelFor(varRg);
		varRg.setBounds(303, 122, 171, 20);
		contentPane.add(varRg);
		varRg.setColumns(10);
		
		JLabel txtCadastroPaciente = new JLabel("Cadastro de Pacientes");
		txtCadastroPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		txtCadastroPaciente.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCadastroPaciente.setBounds(135, 11, 214, 32);
		contentPane.add(txtCadastroPaciente);
		
		botaoSair = new JButton("Sair");
		botaoSair.setBounds(92, 242, 89, 23);
		contentPane.add(botaoSair);
		botaoSair.addActionListener(tratador);

		
		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(308, 242, 89, 23);
		contentPane.add(botaoEnviar);
		botaoEnviar.addActionListener(tratador);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setBounds(199, 242, 89, 23);
		contentPane.add(botaoLimpar);
		
		txtUltCons = new JLabel("Ultima Consulta :");
		txtUltCons.setBounds(10, 181, 102, 14);
		contentPane.add(txtUltCons);
		
		varUltCons = new JTextField();
		varUltCons.setBounds(122, 179, 160, 20);
		contentPane.add(varUltCons);
		varUltCons.setColumns(10);
		botaoLimpar.addActionListener(tratador);

	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoSair) { 
				System.exit(0); 			
			}
			if(e.getSource() == botaoLimpar) {
				varNome.setText("");
				varDataNasc.setText("");
				varCpf.setText("");
				varRg.setText("");
				varUltCons.setText("");
			}
			if(e.getSource() == botaoEnviar) {
				if ((varNome.getText().isEmpty()) || (varDataNasc.getText().isEmpty()) || (varCpf.getText().isEmpty()) || (varRg.getText().isEmpty())) {
					   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				}
				else {
					byte est_civ;
					if(varSolteiro.isSelected())
						est_civ = (byte)0;
					if(varCasado.isSelected())
						est_civ = (byte)1;
					else est_civ = (byte)2;
					pac = new Paciente(varNome.getText(), varCpf.getText(), varRg.getText(), est_civ, 
										(String)varSexo.getItemAt(varSexo.getSelectedIndex()), varDataNasc.getText(), varUltCons.getText());
					
					DadosPaciente.cadastrar(pac);

					JOptionPane.showMessageDialog(null, "Usuário "+varNome.getText()+" inserido com sucesso");
				    varNome.setText("");
					varDataNasc.setText("");
					varCpf.setText("");
					varRg.setText("");
					varUltCons.setText("");
				}
			}
			
		}
	}
}

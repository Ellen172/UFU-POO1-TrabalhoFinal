import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField varNomeFunc;
	private JTextField varCpfFunc;
	private JTextField varRgFunc;
	private JTextField varDataAdm;
	private JTextField varCtps;
	private JPasswordField varSenha;
	private JButton btnContinuar;
	private JRadioButton varDivorciado;
	private JRadioButton varCasado;
	private JRadioButton varSolteiro;
	private JLabel lblTipoFunc;
	private JLabel lblCrm;
	private JTextField varCrm;
	private JLabel lblEspecialidades;
	private JTextField varEspecialidades;
	private JLabel lblPlanos;
	private JButton btnEnviar;
	private JButton btnSair;
	private JButton btnLimpar;
	private JButton btnMedico;
	private JButton btnOutros;
	private JTextField varSalario;
	private JComboBox varCargo;
	private JLabel lblCargo;
	private JLabel lblSalario;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_3;
	private Plano planos[];
	int h, v;

	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 503, 260); //260
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();

		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Funcionário");
		lblCadastroDeFuncionrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeFuncionrio.setBounds(119, 11, 266, 30);
		lblCadastroDeFuncionrio.setBackground(Color.WHITE);
		contentPane.add(lblCadastroDeFuncionrio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 52, 46, 14);
		contentPane.add(lblNome);
		
		varNomeFunc = new JTextField();
		lblNome.setLabelFor(varNomeFunc);
		varNomeFunc.setBounds(56, 49, 418, 20);
		contentPane.add(varNomeFunc);
		varNomeFunc.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 77, 38, 14);
		contentPane.add(lblCpf);
		
		varCpfFunc = new JTextField();
		lblCpf.setLabelFor(varCpfFunc);
		varCpfFunc.setBounds(56, 74, 178, 20);
		contentPane.add(varCpfFunc);
		varCpfFunc.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(248, 77, 38, 14);
		contentPane.add(lblRg);
		
		varRgFunc = new JTextField();
		lblRg.setLabelFor(varRgFunc);
		varRgFunc.setBounds(296, 74, 178, 20);
		contentPane.add(varRgFunc);
		varRgFunc.setColumns(10);
		
		JLabel lblEstadoCvil = new JLabel("Estado Cívil:");
		lblEstadoCvil.setBounds(10, 102, 75, 14);
		contentPane.add(lblEstadoCvil);
		
		varSolteiro = new JRadioButton("Solteiro(a)");
		lblEstadoCvil.setLabelFor(varSolteiro);
		varSolteiro.setBounds(115, 98, 109, 23);
		contentPane.add(varSolteiro);
		
		varCasado = new JRadioButton("Casado(a)");
		varCasado.setBounds(226, 98, 109, 23);
		contentPane.add(varCasado);
		
		varDivorciado = new JRadioButton("Divorciado(a)");
		varDivorciado.setBounds(337, 98, 109, 23);
		contentPane.add(varDivorciado);
		
		ButtonGroup bg= new ButtonGroup(); 
		bg.add(varSolteiro);
		bg.add(varCasado);
		bg.add(varDivorciado);
		
		JLabel lblDataDeAdmisso = new JLabel("Data de Admissão:");
		lblDataDeAdmisso.setBounds(10, 127, 109, 14);
		contentPane.add(lblDataDeAdmisso);
		
		varDataAdm = new JTextField();
		lblDataDeAdmisso.setLabelFor(varDataAdm);
		varDataAdm.setBounds(119, 124, 140, 20);
		contentPane.add(varDataAdm);
		varDataAdm.setColumns(10);
		
		JLabel lblCtps = new JLabel("Ctps:");
		lblCtps.setBounds(275, 128, 46, 14);
		contentPane.add(lblCtps);
		
		varCtps = new JTextField();
		lblCtps.setLabelFor(varCtps);
		varCtps.setBounds(319, 124, 155, 20);
		contentPane.add(varCtps);
		varCtps.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 152, 46, 14);
		contentPane.add(lblSenha);
		
		varSenha = new JPasswordField();
		lblSenha.setLabelFor(varSenha);
		varSenha.setBounds(56, 152, 148, 20);
		contentPane.add(varSenha);
		varSenha.setColumns(10);
		
		lblTipoFunc = new JLabel("Tipo de Funcionario :");
		lblTipoFunc.setBounds(10, 193, 132, 14);
		contentPane.add(lblTipoFunc);
		
		btnMedico = new JButton("Medico");
		btnMedico.setBounds(145, 189, 89, 23);
		contentPane.add(btnMedico);
		btnMedico.addActionListener(tratador);
		
		btnOutros = new JButton("Outros");
		btnOutros.setBounds(285, 189, 89, 23);
		contentPane.add(btnOutros);
		btnOutros.addActionListener(tratador);
		
		
		// medico
		lblCrm = new JLabel("Crm :");
		varCrm = new JTextField();
		lblEspecialidades = new JLabel("Especialidades :");
		varEspecialidades = new JTextField();
		lblPlanos = new JLabel("Planos :");
		btnEnviar = new JButton("Enviar");
		
		// Outros funcionarios
		lblCargo = new JLabel("Cargo:");
		lblSalario = new JLabel("Sálario:");
		varSalario = new JTextField();
		varCargo = new JComboBox();
		
		// botoes
		btnSair = new JButton("Sair");
		btnEnviar = new JButton("Enviar");
		btnLimpar = new JButton("Limpar");
		

	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnMedico) {
				//new CadastroMedico().setVisible(true);
				setBounds(100, 100, 503, 450);
				BotaoMedico trataMedico = new BotaoMedico();
				
				lblCargo.hide();
				lblSalario.hide();
				varSalario.hide();
				varCargo.hide();
				
				lblCrm.show();
				lblCrm.setHorizontalAlignment(SwingConstants.TRAILING);
				lblCrm.setBounds(63, 231, 46, 14);
				contentPane.add(lblCrm);
				
				varCrm.show();
				varCrm.setBounds(119, 228, 168, 20);
				contentPane.add(varCrm);
				varCrm.setColumns(10);
				
				lblEspecialidades.show();
				lblEspecialidades.setHorizontalAlignment(SwingConstants.TRAILING);
				lblEspecialidades.setBounds(10, 255, 99, 14);
				contentPane.add(lblEspecialidades);
				
				varEspecialidades.show();
				varEspecialidades.setBounds(119, 252, 355, 20);
				contentPane.add(varEspecialidades);
				varEspecialidades.setColumns(10);
				
				lblPlanos.show();
				lblPlanos.setHorizontalAlignment(SwingConstants.TRAILING);
				lblPlanos.setBounds(20, 280, 89, 14);
				contentPane.add(lblPlanos);
				
				lblPlanos.show();
				lblPlanos.setHorizontalAlignment(SwingConstants.TRAILING);
				lblPlanos.setBounds(20, 280, 89, 14);
				contentPane.add(lblPlanos);
				
				planos = new Plano[DadosPlanos.getVet().size()];
				h=10; v=301;
				for(int i=0; i<DadosPlanos.getVet().size(); i++) {
					chckbxNewCheckBox = new JCheckBox(DadosPlanos.getVet().get(i).getNome_plano());
					chckbxNewCheckBox.setBounds(h, v, 148, 23);
					contentPane.add(chckbxNewCheckBox);
					planos[i] = new Plano(DadosPlanos.getVet().get(i).getNome_plano(), DadosPlanos.getVet().get(i).getCnpj());
					if(h<310)
						h+=150;
					else {
						v+=20;
						h=10;
					}
				}
				btnSair.setBounds(92, v+30, 89, 23);
				contentPane.add(btnSair);
				btnSair.addActionListener(trataMedico);
				
				btnEnviar.setBounds(308, v+30, 89, 23);
				contentPane.add(btnEnviar);
				btnEnviar.addActionListener(trataMedico);
				
				btnLimpar.setBounds(199, v+30, 89, 23);
				contentPane.add(btnLimpar);
				btnLimpar.addActionListener(trataMedico);
			}
			
			if(e.getSource() == btnOutros) {
				setBounds(100, 100, 503, 350);
				BotaoOutros trataOutros = new BotaoOutros();
				
				lblCrm.hide();
				varCrm.hide();
				lblEspecialidades.hide();
				varEspecialidades.hide();
				lblPlanos.hide();
				
				lblCargo.show();
				lblCargo.setBounds(10, 240, 46, 14);
				contentPane.add(lblCargo);
				
				lblSalario.show();
				lblSalario.setBounds(289, 240, 46, 14);
				contentPane.add(lblSalario);
				lblSalario.setLabelFor(varSalario);
				
				varSalario.show();
				varSalario.setBounds(349, 237, 125, 20);
				contentPane.add(varSalario);
				varSalario.setColumns(10);
				varSalario.setText("xxx.xx");
				
				varCargo.show();
				varCargo.setModel(new DefaultComboBoxModel(new String[] {"Recepção", "Limpeza", "Auxiliar"}));
				varCargo.setBounds(66, 236, 193, 22);
				contentPane.add(varCargo);
				
				btnSair.setBounds(92, 280, 89, 23);
				contentPane.add(btnSair);
				btnSair.addActionListener(trataOutros);
				
				btnEnviar.setBounds(308, 280, 89, 23);
				contentPane.add(btnEnviar);
				btnEnviar.addActionListener(trataOutros);

				btnLimpar.setBounds(199, 280, 89, 23);
				contentPane.add(btnLimpar);
				btnLimpar.addActionListener(trataOutros);

			}
		}
		
		private class BotaoMedico implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnEnviar) {
					if(varNomeFunc.getText().isEmpty() || varCpfFunc.getText().isEmpty() || varRgFunc.getText().isEmpty() || 
							varDataAdm.getText().isEmpty() || varCtps.getText().isEmpty() || varSenha.getText().isEmpty() || 
							varCrm.getText().isEmpty() || varEspecialidades.getText().isEmpty()) {
						   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
					} else {
						byte est_civ;
						if(varSolteiro.isSelected())
							est_civ = (byte)0;
						if(varCasado.isSelected())
							est_civ = (byte)1;
						else est_civ = (byte)2;
						Medico med = new Medico(varNomeFunc.getText(), varCpfFunc.getText(), varRgFunc.getText(), est_civ, varDataAdm.getText(), 
								varCtps.getText(), varSenha.getText(), varCrm.getText(), varEspecialidades.getText(), planos);
						DadosFuncionario.cadastrar(med);
						JOptionPane.showMessageDialog(null, "Medico "+ varNomeFunc.getText() +" inserido com sucesso");
						varNomeFunc.setText("");
						varCpfFunc.setText("");
						varRgFunc.setText("");
						varDataAdm.setText("");
						varCtps.setText("");
						varSenha.setText("");
						varCrm.setText("");
						varEspecialidades.setText("");
					}
				}
				if(e.getSource() == btnLimpar) {
					varNomeFunc.setText("");
					varCpfFunc.setText("");
					varRgFunc.setText("");
					varDataAdm.setText("");
					varCtps.setText("");
					varSenha.setText("");
					varCrm.setText("");
					varEspecialidades.setText("");
				}
				if(e.getSource() == btnSair) { 
					System.exit(0); 			
				}
			}
		}
		
		private class BotaoOutros implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnEnviar) {
					if(varNomeFunc.getText().isEmpty() || varCpfFunc.getText().isEmpty() || varRgFunc.getText().isEmpty() || 
						varDataAdm.getText().isEmpty() || varCtps.getText().isEmpty() || varSenha.getText().isEmpty() || 
						varSalario.getText().isEmpty()) {
						   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
					} else {
						byte est_civ;
						if(varSolteiro.isSelected())
							est_civ = (byte)0;
						if(varCasado.isSelected())
							est_civ = (byte)1;
						else est_civ = (byte)2;
						Outro_funcionario func = new Outro_funcionario((String)varCargo.getItemAt(varCargo.getSelectedIndex()),  
								Double.parseDouble(varSalario.getText()), varNomeFunc.getText(), varCpfFunc.getText(), varRgFunc.getText(), 
								est_civ, varDataAdm.getText(), varCtps.getText(), varSenha.getText());
						DadosFuncionario.cadastrar(func);
						JOptionPane.showMessageDialog(null, "Funcionário "+ varNomeFunc.getText() +" inserido com sucesso");
						varSalario.setText(""); 
						varNomeFunc.setText(""); 
						varCpfFunc.setText(""); 
						varRgFunc.setText(""); 
						varDataAdm.setText(""); 
						varCtps.setText(""); 
						varSenha.setText("");
					}
				}
				if(e.getSource() == btnLimpar) {
					varSalario.setText(""); 
					varNomeFunc.setText(""); 
					varCpfFunc.setText(""); 
					varRgFunc.setText(""); 
					varDataAdm.setText(""); 
					varCtps.setText(""); 
					varSenha.setText("");
				}
				if(e.getSource() == btnSair) { 
					System.exit(0); 			
				}
			}
		}
		
	}
}
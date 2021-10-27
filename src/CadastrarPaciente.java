import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CadastrarPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField varNome;
	private JTextField varCpf;
	private JTextField varRG;
	private JTextField varDatNasc;
	private JTextField varUltCons;
	private JTextField varNroCart;
	private JTextField varDataIngresso;
	private JButton btnComPlano;
	private JLabel lblNroCart;
	private JLabel lblDataIngresso;
	private JTextField varValPago;
	private JButton btnSemPlano;
	private JLabel lblDescEsp;
	private JRadioButton rdbtnDescEspSim;
	private JRadioButton rdbtnDescEspNo;
	private JLabel lblValPago;
	private JButton btnEnviar;
	private JButton btnLimpar;
	private JButton btnSair;
	private JRadioButton rdbtnSolteiro;
	private JRadioButton rdbtnCasado; 
	private JRadioButton rdbtnDivorciado;
	private JComboBox comboSexo;
	private JLabel lblCarencia;
	private JRadioButton rdbtnPerCarSim;
	private JRadioButton rdbtnPerCarNo;
	
	public CadastrarPaciente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 240); //240
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Cadastro de Paciente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 11, 214, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(10, 52, 58, 14);
		contentPane.add(lblNome);
		
		varNome = new JTextField();
		varNome.setBounds(79, 49, 365, 20);
		contentPane.add(varNome);
		varNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCpf.setBounds(10, 77, 58, 14);
		contentPane.add(lblCpf);
		
		varCpf = new JTextField();
		varCpf.setBounds(79, 74, 147, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRg.setBounds(229, 80, 58, 14);
		contentPane.add(lblRg);
		
		varRG = new JTextField();
		varRG.setColumns(10);
		varRG.setBounds(297, 74, 147, 20);
		contentPane.add(varRG);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEstadoCivil.setBounds(10, 102, 114, 14);
		contentPane.add(lblEstadoCivil);
		
		rdbtnSolteiro = new JRadioButton("Solteiro(a)");
		rdbtnSolteiro.setBounds(130, 98, 102, 23);
		contentPane.add(rdbtnSolteiro);
		
		rdbtnCasado = new JRadioButton("Casado(a)");
		rdbtnCasado.setBounds(239, 98, 95, 23);
		contentPane.add(rdbtnCasado);
		
		rdbtnDivorciado = new JRadioButton("Divorciado(a)");
		rdbtnDivorciado.setBounds(342, 98, 102, 23);
		contentPane.add(rdbtnDivorciado);
		
		ButtonGroup bgEstCiv= new ButtonGroup(); 
		bgEstCiv.add(rdbtnSolteiro);
		bgEstCiv.add(rdbtnCasado);
		bgEstCiv.add(rdbtnDivorciado);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSexo.setBounds(249, 128, 58, 14);
		contentPane.add(lblSexo);
		
		comboSexo = new JComboBox();
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboSexo.setBounds(323, 123, 121, 22);
		contentPane.add(comboSexo);
		
		JLabel lblDatNasc = new JLabel("Data de Nascimento:");
		lblDatNasc.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDatNasc.setBounds(10, 127, 125, 14);
		contentPane.add(lblDatNasc);
		
		varDatNasc = new JTextField();
		varDatNasc.setBounds(145, 125, 102, 20);
		contentPane.add(varDatNasc);
		varDatNasc.setColumns(10);
		
		JLabel lblPlano = new JLabel("Plano:");
		lblPlano.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPlano.setBounds(112, 167, 65, 14);
		contentPane.add(lblPlano);
		
		btnComPlano = new JButton("Sim");
		btnComPlano.setBounds(187, 163, 58, 23);
		contentPane.add(btnComPlano);
		btnComPlano.addActionListener(tratador);
		
		btnSemPlano = new JButton("Não");
		btnSemPlano.setBounds(259, 163, 58, 23);
		contentPane.add(btnSemPlano);
		btnSemPlano.addActionListener(tratador);
		
		// Com Plano
		lblNroCart = new JLabel("Numero do cartão:");
		varNroCart = new JTextField();
		lblDataIngresso = new JLabel("Data de Ingresso:");
		varDataIngresso = new JTextField();
		lblCarencia = new JLabel("Carência :");
		rdbtnPerCarSim = new JRadioButton("Sim");
		rdbtnPerCarNo = new JRadioButton("Não");

		// Sem Plano
		lblDescEsp = new JLabel("Desconto Especial:");
		rdbtnDescEspSim = new JRadioButton("Sim");
		rdbtnDescEspNo = new JRadioButton("Não");
		lblValPago = new JLabel("Valor Pago:");
		varValPago = new JTextField();

		// Botoes
		btnEnviar = new JButton("Enviar");
		btnLimpar = new JButton("Limpar");
		btnSair = new JButton("Sair");
		
		
	}
	
	private class TrataBotoes implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnComPlano) {
				TrataComPlano tratadorComPlano = new TrataComPlano();
				setBounds(100, 100, 500, 360); 
				lblDescEsp.hide();
				rdbtnDescEspSim.hide();
				rdbtnDescEspNo.hide();
				lblValPago.hide();
				varValPago.hide();
				
				lblNroCart.show();
				lblNroCart.setHorizontalAlignment(SwingConstants.TRAILING);
				lblNroCart.setBounds(21, 202, 114, 14);
				contentPane.add(lblNroCart);
				
				varNroCart.show();
				varNroCart.setBounds(145, 199, 287, 20);
				contentPane.add(varNroCart);
				varNroCart.setColumns(10);
				
				lblDataIngresso.show();
				lblDataIngresso.setHorizontalAlignment(SwingConstants.TRAILING);
				lblDataIngresso.setBounds(21, 233, 114, 14);
				contentPane.add(lblDataIngresso);
				
				varDataIngresso.show();
				varDataIngresso.setBounds(145, 230, 287, 20);
				contentPane.add(varDataIngresso);
				varDataIngresso.setColumns(10);
				
				lblCarencia.show();
				lblCarencia.setHorizontalAlignment(SwingConstants.TRAILING);
				lblCarencia.setBounds(103, 261, 65, 14);
				contentPane.add(lblCarencia);
				
				rdbtnPerCarSim.show();
				rdbtnPerCarSim.setBounds(187, 257, 58, 23);
				contentPane.add(rdbtnPerCarSim);
				
				rdbtnPerCarNo.show();
				rdbtnPerCarNo.setBounds(249, 257, 58, 23);
				contentPane.add(rdbtnPerCarNo);
				
				ButtonGroup bgPerCar = new ButtonGroup(); 
				bgPerCar.add(rdbtnPerCarNo); bgPerCar.add(rdbtnPerCarSim);
				
				btnEnviar.setBounds(286, 287, 89, 23);
				contentPane.add(btnEnviar);
				btnEnviar.addActionListener(tratadorComPlano);
				
				btnLimpar.setBounds(187, 287, 89, 23);
				contentPane.add(btnLimpar);
				btnLimpar.addActionListener(tratadorComPlano);

				btnSair.setBounds(88, 287, 89, 23);
				contentPane.add(btnSair);
				btnSair.addActionListener(tratadorComPlano);

			}
			if(e.getSource() == btnSemPlano) {
				TrataSemPlano tratadorSemPlano = new TrataSemPlano();
				setBounds(100, 100, 500, 300);
				lblNroCart.hide();
				varNroCart.hide();
				lblDataIngresso.hide();
				varDataIngresso.hide();
				lblCarencia.hide();
				rdbtnPerCarSim.hide();
				rdbtnPerCarNo.hide();

				lblDescEsp.show();
				lblDescEsp.setHorizontalAlignment(SwingConstants.TRAILING);
				lblDescEsp.setBounds(10, 201, 114, 14);
				contentPane.add(lblDescEsp);
				
				rdbtnDescEspSim.show();
				rdbtnDescEspSim.setBounds(130, 197, 58, 23);
				contentPane.add(rdbtnDescEspSim);
				
				rdbtnDescEspNo.show();
				rdbtnDescEspNo.setBounds(187, 197, 58, 23);
				contentPane.add(rdbtnDescEspNo);
				

				ButtonGroup bgDescEsp = new ButtonGroup(); 
				bgDescEsp.add(rdbtnDescEspNo); bgDescEsp.add(rdbtnDescEspSim);
				
				lblValPago.show();
				lblValPago.setHorizontalAlignment(SwingConstants.TRAILING);
				lblValPago.setBounds(239, 201, 78, 14);
				contentPane.add(lblValPago);
				
				varValPago.show();
				varValPago.setBounds(326, 198, 118, 20);
				contentPane.add(varValPago);
				varValPago.setColumns(10);
				
				btnEnviar.setBounds(297, 233, 89, 23);
				contentPane.add(btnEnviar);
				btnEnviar.addActionListener(tratadorSemPlano);
				
				btnLimpar.setBounds(198, 233, 89, 23);
				contentPane.add(btnLimpar);
				btnLimpar.addActionListener(tratadorSemPlano);

				btnSair.setBounds(99, 233, 89, 23);
				contentPane.add(btnSair);
				btnSair.addActionListener(tratadorSemPlano);

			}
		}
		
	}
	
	private class TrataComPlano implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar) {
				if(varNome.getText().isEmpty() || varCpf.getText().isEmpty() || varRG.getText().isEmpty() || 
						varDatNasc.getText().isEmpty() || varNroCart.getText().isEmpty() || varDataIngresso.getText().isEmpty()) {
					   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} 
				else {
					byte est_civ;
					if(rdbtnSolteiro.isSelected())
						est_civ = (byte)0;
					if(rdbtnCasado.isSelected())
						est_civ = (byte)1;
					else est_civ = (byte)2;
					boolean perCar = false;
					if(rdbtnPerCarSim.isSelected()) 
						perCar = true;
					
					ComPlano pac = new ComPlano(varNome.getText(), varCpf.getText(), varRG.getText(), est_civ, 
							(String)comboSexo.getItemAt(comboSexo.getSelectedIndex()), varDatNasc.getText(), 
							varNroCart.getText(), varDataIngresso.getText(), perCar);
					
					DadosPaciente.cadastrar(pac);
					JOptionPane.showMessageDialog(null, "Paciente "+ varNome.getText() +" inserido com sucesso");
					varNome.setText(""); 
					varCpf.setText(""); 
					varRG.setText("");
					varDatNasc.setText("");
					varNroCart.setText(""); 
					varDataIngresso.setText("");
		
				}
			}
			if(e.getSource() == btnLimpar) {
				varNome.setText(""); 
				varCpf.setText(""); 
				varRG.setText("");
				varDatNasc.setText("");
				varNroCart.setText(""); 
				varDataIngresso.setText("");
			}
			if(e.getSource() == btnSair) {
				System.exit(0);
			}
		}
		
	}
	
	private class TrataSemPlano implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar) {
				if(varNome.getText().isEmpty() || varCpf.getText().isEmpty() || varRG.getText().isEmpty() || 
						varDatNasc.getText().isEmpty() || varValPago.getText().isEmpty()) {
					   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				}else {
					byte est_civ;
					if(rdbtnSolteiro.isSelected())
						est_civ = (byte)0;
					if(rdbtnCasado.isSelected())
						est_civ = (byte)1;
					else est_civ = (byte)2;
					boolean perCar = false;
					if(rdbtnPerCarSim.isSelected()) 
						perCar = true;
					boolean desc_esp = false;
					if(rdbtnDescEspSim.isSelected())
						desc_esp = true;

					SemPlano pac = new SemPlano(varNome.getText(), varCpf.getText(), varRG.getText(), est_civ, 
							(String)comboSexo.getItemAt(comboSexo.getSelectedIndex()), varDatNasc.getText(), 
							desc_esp, Double.parseDouble(varValPago.getText()));
					
					DadosPaciente.cadastrar(pac);
					JOptionPane.showMessageDialog(null, "Paciente "+ varNome.getText() +" inserido com sucesso");
					varNome.setText(""); 
					varCpf.setText(""); 
					varRG.setText("");
					varDatNasc.setText("");
					varValPago.setText("");
		
				}
			}
			if(e.getSource() == btnLimpar) {
				varNome.setText(""); 
				varCpf.setText(""); 
				varRG.setText("");
				varDatNasc.setText("");
				varValPago.setText("");

			}
			if(e.getSource() == btnSair) {
				System.exit(0);
			}
		}
		
	}
}

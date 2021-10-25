package ClinicaMedica;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	
	JButton cadastrarPaciente;
	JButton consultarPaciente;
	JButton removerPaciente;
	JButton cadastrarFuncionario;
	JButton consultarFuncionario;
	JButton removerFuncionario;
	JButton cadastrarConsulta;
	JButton consultarConsulta;
	JButton removerConsulta;
	JButton efetuarConsulta;

	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TrataBotoes tratador = new TrataBotoes();
		
		cadastrarPaciente = new JButton("Cadastrar Paciente");
		cadastrarPaciente.setBounds(10, 10, 153, 33);
		contentPane.add(cadastrarPaciente);
		cadastrarPaciente.addActionListener(tratador);
		
		cadastrarFuncionario = new JButton("Cadastrar Funcionario");
		cadastrarFuncionario.setBounds(173, 10, 173, 33);
		contentPane.add(cadastrarFuncionario);
		cadastrarFuncionario.addActionListener(tratador);
		
		cadastrarConsulta = new JButton("Cadastrar Consulta");
		cadastrarConsulta.setBounds(356, 10, 168, 33);
		contentPane.add(cadastrarConsulta);
		cadastrarConsulta.addActionListener(tratador);

		consultarPaciente = new JButton("Consultar Paciente");
		consultarPaciente.setBounds(10, 54, 153, 33);
		contentPane.add(consultarPaciente);
		consultarPaciente.addActionListener(tratador);

		removerPaciente = new JButton("Remover Paciente");
		removerPaciente.setBounds(10, 98, 153, 33);
		contentPane.add(removerPaciente);
		removerPaciente.addActionListener(tratador);

		consultarFuncionario = new JButton("Consultar Funcionario");
		consultarFuncionario.setBounds(173, 54, 173, 33);
		contentPane.add(consultarFuncionario);
		consultarFuncionario.addActionListener(tratador);

		removerFuncionario = new JButton("Remover Funcionario");
		removerFuncionario.setBounds(173, 98, 173, 32);
		contentPane.add(removerFuncionario);
		removerFuncionario.addActionListener(tratador);

		consultarConsulta = new JButton("Consultar Consulta");
		consultarConsulta.setBounds(356, 54, 168, 32);
		contentPane.add(consultarConsulta);
		consultarConsulta.addActionListener(tratador);

		removerConsulta = new JButton("Remover Consulta");
		removerConsulta.setBounds(356, 98, 168, 32);
		contentPane.add(removerConsulta);
		removerConsulta.addActionListener(tratador);

		efetuarConsulta = new JButton("Efetuar Consulta");
		efetuarConsulta.setBounds(173, 157, 173, 33);
		contentPane.add(efetuarConsulta);
		efetuarConsulta.addActionListener(tratador);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastrarPaciente) {
				new CadastroPaciente().setVisible(true);
			}
			else if(e.getSource() == consultarPaciente) {
				
			}
			else if(e.getSource() == removerPaciente) {
				
			}
			else if(e.getSource() == cadastrarConsulta) {
				new CadastrarConsulta().setVisible(true);
			} 
			else if(e.getSource() == consultarConsulta) {
				
			}
			else if(e.getSource() == removerConsulta) {
				
			}
			else if(e.getSource() == cadastrarFuncionario) {
				new CadastroFuncionario().setVisible(true);
			}
			else if(e.getSource() == consultarFuncionario) {
				new ConsultaFuncionario().setVisible(true);
			}
			else if(e.getSource() == removerFuncionario) {
				
			}
			else {
				new EfetuarConsulta().setVisible(true);
			}
		}
	}
}

package ClinicaMedica;
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

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField varNomeFunc;
	private JTextField varCpfFunc;
	private JTextField varRgFunc;
	private JTextField varDataAdm;
	private JTextField varCtps;
	private JTextField varLogin;
	private JTextField varSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
					frame.setSize(500,300); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Funcion\u00E1rio");
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
		lblCpf.setBounds(10, 77, 46, 14);
		contentPane.add(lblCpf);
		
		varCpfFunc = new JTextField();
		lblCpf.setLabelFor(varCpfFunc);
		varCpfFunc.setBounds(66, 74, 168, 20);
		contentPane.add(varCpfFunc);
		varCpfFunc.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(261, 77, 46, 14);
		contentPane.add(lblRg);
		
		varRgFunc = new JTextField();
		lblRg.setLabelFor(varRgFunc);
		varRgFunc.setBounds(294, 74, 180, 20);
		contentPane.add(varRgFunc);
		varRgFunc.setColumns(10);
		
		JLabel lblEstadoCvil = new JLabel("Estado C\u00EDvil:");
		lblEstadoCvil.setBounds(10, 102, 75, 14);
		contentPane.add(lblEstadoCvil);
		
		JRadioButton varSolteiro = new JRadioButton("Solteiro(a)");
		lblEstadoCvil.setLabelFor(varSolteiro);
		varSolteiro.setBounds(115, 98, 109, 23);
		contentPane.add(varSolteiro);
		
		JRadioButton varCasado = new JRadioButton("Casado(a)");
		varCasado.setBounds(226, 98, 109, 23);
		contentPane.add(varCasado);
		
		JRadioButton varDivorciado = new JRadioButton("Divorciado(a)");
		varDivorciado.setBounds(337, 98, 109, 23);
		contentPane.add(varDivorciado);
		
		ButtonGroup bg= new ButtonGroup(); 
		bg.add(varSolteiro);
		bg.add(varCasado);
		bg.add(varDivorciado);
		
		JLabel lblDataDeAdmisso = new JLabel("Data de Admiss\u00E3o:");
		lblDataDeAdmisso.setBounds(10, 127, 109, 14);
		contentPane.add(lblDataDeAdmisso);
		
		varDataAdm = new JTextField();
		lblDataDeAdmisso.setLabelFor(varDataAdm);
		varDataAdm.setBounds(125, 124, 140, 20);
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
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 152, 46, 14);
		contentPane.add(lblLogin);
		
		varLogin = new JTextField();
		varLogin.setBounds(56, 152, 168, 20);
		contentPane.add(varLogin);
		varLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(234, 155, 46, 14);
		contentPane.add(lblSenha);
		
		varSenha = new JTextField();
		lblSenha.setLabelFor(varSenha);
		lblLogin.setLabelFor(varSenha);
		varSenha.setBounds(294, 153, 180, 20);
		contentPane.add(varSenha);
		varSenha.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.setBounds(188, 203, 132, 30);
		contentPane.add(btnEnviar);
	}
}

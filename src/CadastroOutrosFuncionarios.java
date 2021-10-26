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

public class CadastroOutrosFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField varCpfOutrosFunc;
	private JTextField varCargo;
	private JTextField varSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroOutrosFuncionarios frame = new CadastroOutrosFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroOutrosFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Outros Funcion\u00E1rios");
		lblCadastroDeFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeFuncionrio.setBounds(10, 11, 424, 14);
		lblCadastroDeFuncionrio.setBackground(Color.WHITE);
		contentPane.add(lblCadastroDeFuncionrio);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 77, 46, 14);
		contentPane.add(lblCpf);
		
		varCpfOutrosFunc = new JTextField();
		lblCpf.setLabelFor(varCpfOutrosFunc);
		varCpfOutrosFunc.setBounds(55, 74, 125, 20);
		contentPane.add(varCpfOutrosFunc);
		varCpfOutrosFunc.setColumns(10);
		
		ButtonGroup bg= new ButtonGroup();
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBounds(129, 178, 160, 43);
		contentPane.add(btnEnviar);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 102, 46, 14);
		contentPane.add(lblCargo);
		
		varCargo = new JTextField();
		lblCargo.setLabelFor(varCargo);
		varCargo.setBounds(55, 99, 125, 20);
		contentPane.add(varCargo);
		varCargo.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:\r\n");
		lblSalrio.setBounds(10, 127, 46, 14);
		contentPane.add(lblSalrio);
		
		varSalario = new JTextField();
		lblSalrio.setLabelFor(varSalario);
		varSalario.setBounds(55, 124, 125, 20);
		contentPane.add(varSalario);
		varSalario.setColumns(10);
	}
}

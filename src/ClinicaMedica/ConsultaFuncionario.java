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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField varCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaFuncionario frame = new ConsultaFuncionario();
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
	public ConsultaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Buscar Funcion\u00E1rio");
		lblCadastroDeFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeFuncionrio.setBounds(122, 11, 424, 14);
		lblCadastroDeFuncionrio.setBackground(Color.WHITE);
		contentPane.add(lblCadastroDeFuncionrio);
		
		varCpf = new JTextField();
		varCpf.setFont(new Font("Tahoma", Font.PLAIN, 39));
		varCpf.setBounds(143, 90, 196, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		ButtonGroup bg= new ButtonGroup();
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBounds(134, 172, 160, 43);
		contentPane.add(btnEnviar);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF: ");
		lblDigiteOCpf.setLabelFor(varCpf);
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDigiteOCpf.setBounds(41, 77, 146, 43);
		contentPane.add(lblDigiteOCpf);
	}
}

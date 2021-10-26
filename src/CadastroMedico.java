import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;

public class CadastroMedico extends JFrame {

	private JPanel contentPane;
	private JTextField varCrm;
	private JTextField varEspecilidades;

	public CadastroMedico() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroMedico = new JLabel("Cadastro de Medico");
		lblCadastroMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroMedico.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroMedico.setBounds(128, 11, 196, 22);
		contentPane.add(lblCadastroMedico);
		
		JLabel lblCrm = new JLabel("CRM :");
		lblCrm.setBounds(10, 48, 46, 14);
		contentPane.add(lblCrm);
		
		varCrm = new JTextField();
		varCrm.setBounds(66, 45, 175, 20);
		contentPane.add(varCrm);
		varCrm.setColumns(10);
		
		JLabel lblEspecialidades = new JLabel("Especialidades :");
		lblEspecialidades.setBounds(10, 73, 97, 14);
		contentPane.add(lblEspecialidades);
		
		varEspecilidades = new JTextField();
		varEspecilidades.setBounds(117, 70, 242, 20);
		contentPane.add(varEspecilidades);
		varEspecilidades.setColumns(10);
		
		JLabel lblPlanos = new JLabel("Planos :");
		lblPlanos.setBounds(10, 98, 46, 14);
		contentPane.add(lblPlanos);
		
		JCheckBox checkPlano = new JCheckBox("Plano 1");
		checkPlano.setBounds(33, 119, 97, 23);
		contentPane.add(checkPlano);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(178, 227, 89, 23);
		contentPane.add(btnEnviar);
	}
}

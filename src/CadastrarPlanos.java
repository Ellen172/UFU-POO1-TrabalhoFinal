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
import javax.swing.JButton;

public class CadastrarPlanos extends JFrame {

	private JPanel contentPane;
	private JTextField varNome;
	private JTextField varCnpj;
	private JButton btnEnviar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPlanos frame = new CadastrarPlanos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastrarPlanos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Cadastrar Plano");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(112, 11, 201, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(10, 54, 57, 14);
		contentPane.add(lblNome);
		
		varNome = new JTextField();
		varNome.setBounds(77, 51, 320, 20);
		contentPane.add(varNome);
		varNome.setColumns(10);
		
		JLabel lblCnpj = new JLabel("Cnpj :");
		lblCnpj.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCnpj.setBounds(21, 85, 46, 14);
		contentPane.add(lblCnpj);
		
		varCnpj = new JTextField();
		varCnpj.setBounds(77, 82, 320, 20);
		contentPane.add(varCnpj);
		varCnpj.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(165, 141, 106, 34);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(tratador);
	}
	
	private class TrataBotoes implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar) {
				if(varNome.getText().isEmpty() || varCnpj.getText().isEmpty()) {
					  JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} else {
					Plano p = new Plano(varNome.getText(), varCnpj.getText());
					DadosPlanos.cadastrar(p);					  
					JOptionPane.showMessageDialog(null, "Cadastro do plano " + varNome.getText() + " realizado!");
					varNome.setText("");
					varCnpj.setText("");
				}
			}
		}	
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RemoveFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField varCpf;
	private JButton btnRemover;
	private JLabel lblResposta;
	
	public RemoveFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblRemoveFunc = new JLabel("Remover Funcionario");
		lblRemoveFunc.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemoveFunc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRemoveFunc.setBounds(10, 11, 414, 30);
		contentPane.add(lblRemoveFunc);
		
		JLabel lblInsiraCpf = new JLabel("Insira o Cpf:");
		lblInsiraCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInsiraCpf.setBounds(10, 52, 92, 14);
		contentPane.add(lblInsiraCpf);
		
		varCpf = new JTextField();
		varCpf.setBounds(112, 49, 212, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 48, 89, 23);
		contentPane.add(btnRemover);
		btnRemover.addActionListener(tratador);
		
		lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setBounds(112, 80, 212, 14);
		contentPane.add(lblResposta);
	}
	
	private class TrataBotoes implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnRemover) {
				boolean x = DadosFuncionario.excluir(varCpf.getText());
				if(x == true)
					lblResposta.setText("Funcionario removido!");
				else 
					lblResposta.setText("Funcionario não encontrado!");
			}
		}
		
	}
}

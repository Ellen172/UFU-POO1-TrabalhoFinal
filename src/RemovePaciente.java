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

public class RemovePaciente extends JFrame {

	private JPanel contentPane;
	private JTextField varCpf;
	private JButton botaoRemover;
	private JLabel txtPacienteRemovido;

	public RemovePaciente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel txtRemovePaciente = new JLabel("Remove Paciente");
		txtRemovePaciente.setHorizontalAlignment(SwingConstants.CENTER);
		txtRemovePaciente.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtRemovePaciente.setBounds(128, 11, 174, 36);
		contentPane.add(txtRemovePaciente);
		
		JLabel txtInsiraCpf = new JLabel("Insira o CPF :");
		txtInsiraCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		txtInsiraCpf.setBounds(33, 56, 85, 14);
		contentPane.add(txtInsiraCpf);
		
		varCpf = new JTextField();
		varCpf.setBounds(128, 53, 187, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		txtPacienteRemovido = new JLabel("");
		txtPacienteRemovido.setHorizontalAlignment(SwingConstants.CENTER);
		txtPacienteRemovido.setBounds(128, 103, 187, 14);
		contentPane.add(txtPacienteRemovido);
		
		botaoRemover = new JButton("Remover");
		botaoRemover.setBounds(325, 52, 89, 23);
		contentPane.add(botaoRemover);
		botaoRemover.addActionListener(tratador);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoRemover) {
				boolean x = DadosPaciente.excluir(varCpf.getText());
				if(x == true)
					txtPacienteRemovido.setText("Paciente Removido!");
				else txtPacienteRemovido.setText("Paciente não encontrado!");
			}
			
		}
		
	}
}

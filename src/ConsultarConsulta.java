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

public class ConsultarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField varData;
	private JTextField varHorario;
	private JButton btnBuscar;
	private JLabel lblResposta;
	private JLabel txtData;
	private JLabel txtHorario;
	private JLabel txtMedicamento;
	private JLabel txtObsGeral;
	private JLabel txtReceita;
	private JLabel txtValor;
	private JLabel txtMedico;
	private JLabel txtOutroFunc;
	private JLabel txtPaciente;

	public ConsultarConsulta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblTitle = new JLabel("Buscar Consulta");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitle.setBounds(10, 11, 414, 28);
		contentPane.add(lblTitle);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setHorizontalAlignment(SwingConstants.TRAILING);
		lblData.setBounds(10, 50, 63, 14);
		contentPane.add(lblData);
		
		varData = new JTextField();
		varData.setBounds(83, 47, 119, 20);
		contentPane.add(varData);
		varData.setColumns(10);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHorario.setBounds(212, 50, 78, 14);
		contentPane.add(lblHorario);
		
		varHorario = new JTextField();
		varHorario.setBounds(300, 47, 124, 20);
		contentPane.add(varHorario);
		varHorario.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(166, 78, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(tratador);
		
		lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setBounds(10, 112, 414, 14);
		contentPane.add(lblResposta);
		
		txtData = new JLabel("");
		txtData.setBounds(10, 112, 198, 14);
		contentPane.add(txtData);
		
		txtHorario = new JLabel("");
		txtHorario.setBounds(226, 112, 198, 14);
		contentPane.add(txtHorario);
		
		txtMedicamento = new JLabel("");
		txtMedicamento.setBounds(10, 137, 414, 14);
		contentPane.add(txtMedicamento);
		
		txtObsGeral = new JLabel("");
		txtObsGeral.setBounds(10, 161, 414, 14);
		contentPane.add(txtObsGeral);
		
		txtReceita = new JLabel("");
		txtReceita.setBounds(10, 186, 414, 14);
		contentPane.add(txtReceita);
		
		txtValor = new JLabel("");
		txtValor.setBounds(10, 211, 198, 14);
		contentPane.add(txtValor);
		
		txtMedico = new JLabel("");
		txtMedico.setBounds(226, 211, 198, 14);
		contentPane.add(txtMedico);
		
		txtOutroFunc = new JLabel("");
		txtOutroFunc.setBounds(10, 236, 198, 14);
		contentPane.add(txtOutroFunc);
		
		txtPaciente = new JLabel("");
		txtPaciente.setBounds(226, 236, 198, 14);
		contentPane.add(txtPaciente);
	}
	
	private class TrataBotoes implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnBuscar) {
				Consulta cons = DadosConsulta.buscar(varData.getText(), varHorario.getText());
				if(cons == null) {
					lblResposta.setText("Consulta não localizada");
				} else {
					lblResposta.setText("");
					txtData.setText("Data: " + cons.getData());
					txtHorario.setText("Horario: " + cons.getHorario());
					txtMedicamento.setText("Medicamento: " + cons.getMedicamento());
					txtObsGeral.setText("Observação geral: " + cons.getObs_geral());
					txtReceita.setText("Receita: " + cons.getReceita());
					txtValor.setText("Valor: " + Double.toString(cons.getVal_cons()));
					txtMedico.setText("Medico: " + cons.getMed().getNome_func() + " - " + cons.getMed().getCpf_func());
					txtOutroFunc.setText("Funcionario: " + cons.getOutro_func().getNome_func() + " - " + cons.getOutro_func().getCpf_func());
					txtPaciente.setText("Paciente: " + cons.getPac().getNome_pac() + " - " + cons.getPac().getCpf_pac());
				}
			}
		}
		
	}
}

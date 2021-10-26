import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField varCpf;
	private JLabel txtInsiraCpf;
	private JLabel txtPacienteNaoEncontrado;
	private JButton botaoBuscar;
	private JLabel txtNome;
	private JLabel txtCpf;
	private JLabel txtRg;
	private JLabel txtEstCiv;
	private JLabel txtSexo;
	private JLabel txtDataNascimento;
	private JLabel txtDataCadastro;
	private JLabel txtUltimaCons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaPaciente frame = new ConsultaPaciente();
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
	public ConsultaPaciente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Buscar Paciente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(142, 11, 153, 32);
		contentPane.add(lblNewLabel);
		
		txtInsiraCpf = new JLabel("Insira o Cpf :");
		txtInsiraCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		txtInsiraCpf.setBounds(24, 66, 87, 14);
		contentPane.add(txtInsiraCpf);
		
		varCpf = new JTextField();
		varCpf.setBounds(121, 63, 179, 20);
		contentPane.add(varCpf);
		varCpf.setColumns(10);
		
		txtPacienteNaoEncontrado = new JLabel("");
		txtPacienteNaoEncontrado.setHorizontalAlignment(SwingConstants.CENTER);
		txtPacienteNaoEncontrado.setBounds(78, 103, 287, 20);
		contentPane.add(txtPacienteNaoEncontrado);
		
		botaoBuscar = new JButton("Buscar");
		botaoBuscar.setBounds(315, 62, 89, 23);
		contentPane.add(botaoBuscar);
		
		txtNome = new JLabel("");
		txtNome.setBounds(24, 113, 380, 14);
		contentPane.add(txtNome);
		
		txtCpf = new JLabel("");
		txtCpf.setBounds(24, 138, 190, 14);
		contentPane.add(txtCpf);
		
		txtRg = new JLabel("");
		txtRg.setBounds(224, 138, 180, 14);
		contentPane.add(txtRg);
		
		txtEstCiv = new JLabel("");
		txtEstCiv.setBounds(24, 163, 190, 14);
		contentPane.add(txtEstCiv);
		
		txtSexo = new JLabel("");
		txtSexo.setBounds(224, 163, 180, 14);
		contentPane.add(txtSexo);
		
		txtDataNascimento = new JLabel("");
		txtDataNascimento.setBounds(24, 188, 380, 14);
		contentPane.add(txtDataNascimento);
		
		txtDataCadastro = new JLabel("");
		txtDataCadastro.setBounds(24, 213, 190, 14);
		contentPane.add(txtDataCadastro);
		
		txtUltimaCons = new JLabel("");
		txtUltimaCons.setBounds(214, 213, 190, 14);
		contentPane.add(txtUltimaCons);
		botaoBuscar.addActionListener(tratador);

	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoBuscar) { 
				Paciente p = DadosPaciente.buscar(varCpf.getText());
				if(p != null) {					
					SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
					txtPacienteNaoEncontrado.setText("");
					txtNome.setText("Nome: " + p.getNome_pac());
					txtCpf.setText("Cpf: " + ValidaCpf.imprimeCPF(p.getCpf_pac()));
					txtRg.setText("Rg: " + p.getRg_pac());
					txtEstCiv.setText("Estado Civil: " + p.getEst_civ());
					txtSexo.setText("Sexo: " + p.getSexo());
					txtDataNascimento.setText("Data de Nascimento: " + p.getDat_nas());
					txtDataCadastro.setText("Data de cadastro: " + formatarData.format(p.getDat_cad()));
					txtUltimaCons.setText("Ultima consulta: " + p.getUlt_cons());
					
				}else {
					txtPacienteNaoEncontrado.setText("Paciente não encontrado!");
					txtNome.setText("");
					txtCpf.setText("");
					txtRg.setText("");
					txtEstCiv.setText("");
					txtSexo.setText("");
					txtDataNascimento.setText("");
					txtDataCadastro.setText("");
					txtUltimaCons.setText("");
				}
			}
			else {
			}
		}
	}
}

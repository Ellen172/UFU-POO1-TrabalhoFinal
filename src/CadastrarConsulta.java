import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CadastrarConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField varCpfPac;
    private JTextField varCpfMed;
    private JTextField varCpfFunc;
    private JTextField varData;
    private JTextField varHorario;
    private JButton btnEnviar;
    private JButton btnLimpar;
    private JButton btnSair;

    public CadastrarConsulta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        TrataBotoes tratador = new TrataBotoes();
        
        JLabel lblNewLabel = new JLabel("Cadastro Consulta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(121, 11, 218, 27);
        contentPane.add(lblNewLabel);
        
        JLabel lblCpfPaciente = new JLabel("CPF do paciente:");
        lblCpfPaciente.setHorizontalAlignment(SwingConstants.TRAILING);
        lblCpfPaciente.setBounds(29, 49, 104, 14);
        contentPane.add(lblCpfPaciente);
        
        JLabel lblCpfMedico = new JLabel("CPF do m\u00E9dico:");
        lblCpfMedico.setHorizontalAlignment(SwingConstants.TRAILING);
        lblCpfMedico.setBounds(29, 75, 104, 14);
        contentPane.add(lblCpfMedico);
        
        JLabel lblCpfFunc = new JLabel("CPF do funcion\u00E1rio:");
        lblCpfFunc.setHorizontalAlignment(SwingConstants.TRAILING);
        lblCpfFunc.setBounds(29, 103, 104, 14);
        contentPane.add(lblCpfFunc);
        
        JLabel lblData = new JLabel("Data:");
        lblData.setHorizontalAlignment(SwingConstants.TRAILING);
        lblData.setBounds(29, 128, 104, 14);
        contentPane.add(lblData);
        
        JLabel lblHorario = new JLabel("Hor\u00E1rio: ");
        lblHorario.setHorizontalAlignment(SwingConstants.TRAILING);
        lblHorario.setBounds(29, 153, 104, 14);
        contentPane.add(lblHorario);
        
        varCpfPac = new JTextField();
        varCpfPac.setBounds(143, 46, 241, 20);
        contentPane.add(varCpfPac);
        varCpfPac.setColumns(10);
        
        varCpfMed = new JTextField();
        varCpfMed.setBounds(143, 72, 241, 20);
        contentPane.add(varCpfMed);
        varCpfMed.setColumns(10);
        
        varCpfFunc = new JTextField();
        varCpfFunc.setBounds(143, 100, 241, 20);
        contentPane.add(varCpfFunc);
        varCpfFunc.setColumns(10);
        
        varData = new JTextField();
        varData.setBounds(143, 125, 128, 20);
        contentPane.add(varData);
        varData.setColumns(10);
        
        varHorario = new JTextField();
        varHorario.setBounds(143, 150, 128, 20);
        contentPane.add(varHorario);
        varHorario.setColumns(10);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(182, 181, 89, 23);
        contentPane.add(btnLimpar);
        btnLimpar.addActionListener(tratador);
        
        btnSair = new JButton("Sair");
        btnSair.setBounds(83, 181, 89, 23);
        contentPane.add(btnSair);
        btnSair.addActionListener(tratador);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(281, 181, 89, 23);
        contentPane.add(btnEnviar);
        btnEnviar.addActionListener(tratador);
    }
    
    private class TrataBotoes implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar) {
				if(varCpfMed.getText().isEmpty() || varCpfPac.getText().isEmpty() || varCpfFunc.getText().isEmpty() 
						|| varData.getText().isEmpty() || varHorario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} else {
					Medico med = (Medico)DadosFuncionario.buscar(varCpfMed.getText());
					Paciente pac = DadosPaciente.buscar(varCpfPac.getText());
					Outro_funcionario outro_func = (Outro_funcionario)DadosFuncionario.buscar(varCpfFunc.getText());
					if(med == null) {
						JOptionPane.showMessageDialog(null, "Medico não cadastrado");
					} else if(pac == null) {
						JOptionPane.showMessageDialog(null, "Paciente não cadastrado");
					} else if(outro_func == null) {
						JOptionPane.showMessageDialog(null, "Funcionario não cadastrado");
					} else {
						Consulta cons = new Consulta(med, pac, outro_func, varData.getText(), varHorario.getText());
						DadosConsulta.cadastrar(cons);
						JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso");
						varCpfMed.setText("");
						varCpfPac.setText("");
						varCpfFunc.setText("");
						varData.setText("");
						varHorario.setText("");
					}
					
				}
			}
			
			if(e.getSource() == btnLimpar) {
				varCpfMed.setText("");
				varCpfPac.setText("");
				varCpfFunc.setText("");
				varData.setText("");
				varHorario.setText("");
			}
			
			if(e.getSource() == btnSair) {
				System.exit(0);
			}
		}
    	
    }
}

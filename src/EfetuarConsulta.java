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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EfetuarConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField varHorario;
    private JTextField varData;
    private JTextField varMedicamentos;
    private JTextField varReceita;
    private JTextField varObsGeral;
    private JTextField varValor;
    private JButton botaoEnviar;

    public EfetuarConsulta() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 260);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitle = new JLabel("Efetua\u00E7\u00E3o Consulta");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTitle.setBounds(119, 11, 230, 29);
        contentPane.add(lblTitle);
        
        JLabel lblMedicamentos = new JLabel("Medicamentos:");
        lblMedicamentos.setHorizontalAlignment(SwingConstants.TRAILING);
        lblMedicamentos.setBounds(20, 76, 103, 14);
        contentPane.add(lblMedicamentos);
        
        JLabel lblData = new JLabel("Data:");
        lblData.setHorizontalAlignment(SwingConstants.TRAILING);
        lblData.setBounds(245, 51, 37, 14);
        contentPane.add(lblData);
        
        JLabel lblReceita = new JLabel("Receita:");
        lblReceita.setHorizontalAlignment(SwingConstants.TRAILING);
        lblReceita.setBounds(55, 102, 68, 14);
        contentPane.add(lblReceita);
        
        JLabel lblHorario = new JLabel("Hor\u00E1rio:");
        lblHorario.setHorizontalAlignment(SwingConstants.TRAILING);
        lblHorario.setBounds(55, 51, 64, 14);
        contentPane.add(lblHorario);
        
        JLabel lblObsGeral = new JLabel("Observa\u00E7\u00E3o Geral:");
        lblObsGeral.setHorizontalAlignment(SwingConstants.TRAILING);
        lblObsGeral.setBounds(10, 127, 113, 14);
        contentPane.add(lblObsGeral);
        
        JLabel lblValor = new JLabel("Valor:");
        lblValor.setHorizontalAlignment(SwingConstants.TRAILING);
        lblValor.setBounds(69, 152, 54, 14);
        contentPane.add(lblValor);
        
        varHorario = new JTextField();
        varHorario.setBounds(129, 48, 106, 20);
        contentPane.add(varHorario);
        varHorario.setColumns(10);
        
        varData = new JTextField();
        varData.setBounds(292, 48, 119, 20);
        contentPane.add(varData);
        varData.setColumns(10);
        
        varMedicamentos = new JTextField();
        varMedicamentos.setBounds(129, 73, 282, 20);
        contentPane.add(varMedicamentos);
        varMedicamentos.setColumns(10);
        
        varReceita = new JTextField();
        varReceita.setBounds(129, 99, 282, 20);
        contentPane.add(varReceita);
        varReceita.setColumns(10);
        
        varObsGeral = new JTextField();
        varObsGeral.setBounds(129, 124, 282, 20);
        contentPane.add(varObsGeral);
        varObsGeral.setColumns(10);
        
        varValor = new JTextField();
        varValor.setBounds(129, 149, 282, 20);
        contentPane.add(varValor);
        varValor.setColumns(10);
        
        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(168, 187, 89, 23);
        contentPane.add(botaoEnviar);
    }
    
    private class TrataBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() ==  botaoEnviar) {
				Consulta cons = DadosConsulta.buscar(varData.getText(), varHorario.getText());
				if(cons == null) {
					JOptionPane.showMessageDialog(null, "Consulta não localizada");
				} else {
					cons.realizarConsulta(varMedicamentos.getText(), varObsGeral.getText(), varReceita.getText(), 
							Double.parseDouble(varValor.getText()));
					JOptionPane.showMessageDialog(null, "Consulta efetuada");
				}
			}
		}
    	
    }
}
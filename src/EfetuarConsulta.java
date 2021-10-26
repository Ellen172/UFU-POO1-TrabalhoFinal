import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class EfetuarConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField varHorario;
    private JTextField varData;
    private JTextField varMedicamentos;
    private JTextField varReceita;
    private JTextField varObsGeral;
    private JTextField varValor;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	EfetuarConsulta frame = new EfetuarConsulta();
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
    public EfetuarConsulta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Efetua\u00E7\u00E3o Consulta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(119, 11, 230, 29);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_3 = new JLabel("Medicamentos:");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3.setBounds(20, 76, 103, 14);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Data:");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1.setBounds(245, 51, 37, 14);
        contentPane.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("Receita:");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_2.setBounds(55, 102, 68, 14);
        contentPane.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_3_2_1 = new JLabel("Hor\u00E1rio:");
        lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_2_1.setBounds(55, 51, 64, 14);
        contentPane.add(lblNewLabel_3_2_1);
        
        JLabel lblNewLabel_3_2_2 = new JLabel("Observa\u00E7\u00E3o Geral:");
        lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_2_2.setBounds(10, 127, 113, 14);
        contentPane.add(lblNewLabel_3_2_2);
        
        JLabel lblNewLabel_3_2_2_1 = new JLabel("Valor:");
        lblNewLabel_3_2_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_2_2_1.setBounds(69, 152, 54, 14);
        contentPane.add(lblNewLabel_3_2_2_1);
        
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
        
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(180, 199, 89, 23);
        contentPane.add(botaoEnviar);
    }
}
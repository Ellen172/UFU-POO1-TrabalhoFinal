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
import java.awt.Font;
import javax.swing.SwingConstants;

public class CadastrarConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField varCpfPac;
    private JTextField varCpfMed;
    private JTextField varCpfFunc;
    private JTextField varData;
    private JTextField varHorario;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CadastrarConsulta frame = new CadastrarConsulta();
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
    public CadastrarConsulta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Cadastro Consulta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(121, 11, 218, 27);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_3_1 = new JLabel("CPF do paciente:");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1.setBounds(29, 49, 104, 14);
        contentPane.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("CPF do m\u00E9dico:");
        lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1_1.setBounds(29, 75, 104, 14);
        contentPane.add(lblNewLabel_3_1_1);
        
        JLabel lblNewLabel_3_1_1_1_1 = new JLabel("CPF Funcion\u00E1rio:");
        lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1_1_1_1.setBounds(29, 103, 104, 14);
        contentPane.add(lblNewLabel_3_1_1_1_1);
        
        JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Data:");
        lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1_1_1_1_1.setBounds(29, 128, 104, 14);
        contentPane.add(lblNewLabel_3_1_1_1_1_1);
        
        JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Hor\u00E1rio: ");
        lblNewLabel_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_3_1_1_1_1_1_1.setBounds(29, 153, 104, 14);
        contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
        
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
    }
}
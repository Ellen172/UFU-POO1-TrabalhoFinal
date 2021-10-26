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
import javax.swing.JButton;

public class RemoverConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField textField_3;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	RemoverConsulta frame = new RemoverConsulta();
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
    public RemoverConsulta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Remover Consulta");
        lblNewLabel.setBounds(159, 11, 139, 14);
        contentPane.add(lblNewLabel);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(140, 66, 168, 20);
        contentPane.add(textField_3);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(140, 107, 168, 20);
        contentPane.add(textField);
        
        JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Data da consulta:");
        lblNewLabel_3_1_1_1_1_1.setBounds(23, 69, 104, 14);
        contentPane.add(lblNewLabel_3_1_1_1_1_1);
        
        JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Hor\u00E1rio da consulta: ");
        lblNewLabel_3_1_1_1_1_1_1.setBounds(10, 110, 128, 14);
        contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
    }
}
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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class RemoveConsulta extends JFrame {

    private JPanel contentPane;
    private JTextField varData;
    private JTextField varHorario;
    private JButton btnRemover;
    private JLabel lblResposta;
    
    public RemoveConsulta() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Remover Consulta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(10, 11, 414, 26);
        contentPane.add(lblNewLabel);
        
        varData = new JTextField();
        varData.setColumns(10);
        varData.setBounds(90, 66, 116, 20);
        contentPane.add(varData);
        
        varHorario = new JTextField();
        varHorario.setColumns(10);
        varHorario.setBounds(308, 66, 116, 20);
        contentPane.add(varHorario);
        
        JLabel lblData = new JLabel("Data:");
        lblData.setHorizontalAlignment(SwingConstants.TRAILING);
        lblData.setBounds(10, 69, 70, 14);
        contentPane.add(lblData);
        
        JLabel lblHorario = new JLabel("Horário:");
        lblHorario.setHorizontalAlignment(SwingConstants.TRAILING);
        lblHorario.setBounds(215, 69, 83, 14);
        contentPane.add(lblHorario);
        
        btnRemover = new JButton("Remover");
        btnRemover.setBounds(168, 112, 89, 23);
        contentPane.add(btnRemover);
        
        lblResposta = new JLabel("");
        lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
        lblResposta.setBounds(10, 148, 414, 14);
        contentPane.add(lblResposta);
    }
    
    private class TrataBotoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btnRemover) {
				boolean x = DadosConsulta.excluir(varData.getText(), varHorario.getText());
				if(x == true) {
					lblResposta.setText("Consulta removida!");
				} else {
					lblResposta.setText("Consulta não encontrada!");
				}
			}
		}
    	
    }
}
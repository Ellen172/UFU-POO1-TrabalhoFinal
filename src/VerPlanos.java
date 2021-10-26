import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VerPlanos extends JFrame {

	private JPanel contentPane;

	public VerPlanos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlanosCadastrados = new JLabel("Planos Cadastrados");
		lblPlanosCadastrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanosCadastrados.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlanosCadastrados.setBounds(101, 11, 247, 31);
		contentPane.add(lblPlanosCadastrados);
		
		int a1 = 66, a2 = 89;
		for(int i=0; i<DadosPlanos.getVet().size(); i++) {
			JLabel lblNome = new JLabel("Nome: ");
			lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNome.setBounds(10, a1, 101, 14);
			contentPane.add(lblNome);
			
			JLabel varNome = new JLabel(DadosPlanos.getVet().get(i).getNome_plano());
			varNome.setBounds(121, a1, 262, 14);
			contentPane.add(varNome);
			
			JLabel lblCnpj = new JLabel("Cnpj:");
			lblCnpj.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCnpj.setBounds(10, a2, 101, 14);
			contentPane.add(lblCnpj);
			
			JLabel varCnpj = new JLabel(DadosPlanos.getVet().get(i).getCnpj());
			varCnpj.setBounds(121, a2, 262, 14);
			contentPane.add(varCnpj);
			
			a1+=50; a2+=50;
			
		}
		
		

		
	}

}

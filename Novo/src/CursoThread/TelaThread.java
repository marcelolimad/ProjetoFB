package CursoThread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThread extends JDialog{

	
	private JPanel  jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel( "Tempo 1 Thread" );
	private JTextField mostrarTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel( "Tempo 2 Thread" );
	private JTextField mostrarTempo2 = new JTextField();
    private JButton jButton = new JButton("Iniciar"); 
    private JButton jButton2 = new JButton("Parar"); 
	
	
	
		public TelaThread() {
			
			setTitle("Minha Tela");
			setSize(new Dimension(240, 240));
			setLocationRelativeTo(null);
			setResizable(false);
			//=================================
			
			
			GridBagConstraints gridBagConstrainsts = new GridBagConstraints();
			gridBagConstrainsts.gridx = 0;
			gridBagConstrainsts.gridy = 0;
			gridBagConstrainsts.gridwidth =2;
			gridBagConstrainsts.insets = new Insets(5, 10, 5, 5);
			gridBagConstrainsts.anchor = GridBagConstraints.WEST;
			
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			jPanel.add(descricaoHora, gridBagConstrainsts);
			
			
			mostrarTempo.setPreferredSize(new Dimension(200,25));
			gridBagConstrainsts.gridy ++;
			mostrarTempo.setEditable(false);
			jPanel.add(mostrarTempo, gridBagConstrainsts);
			
			
			//====================
			
			
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoHora2, gridBagConstrainsts);
			
			
			mostrarTempo2.setPreferredSize(new Dimension(200,25));
			gridBagConstrainsts.gridy ++;
			mostrarTempo2.setEditable(false);
			jPanel.add(mostrarTempo2, gridBagConstrainsts);
			
			gridBagConstrainsts.gridwidth =1;
			
			jButton.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(jButton, gridBagConstrainsts);
			
			jButton2.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton2, gridBagConstrainsts);
			
			add(jPanel, BorderLayout.WEST);
			
			
			
			
			
			
			setVisible(true);
			
		}
		
		
	

}

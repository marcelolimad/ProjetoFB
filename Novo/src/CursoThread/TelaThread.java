package CursoThread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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

	
		public TelaThread() {
			
			setTitle("Minha Tela");
			setSize(new Dimension(240, 240));
			setLocationRelativeTo(null);
			setResizable(false);
			//=================================
			
			
			GridBagConstraints gridBagConstrainsts = new GridBagConstraints();
			gridBagConstrainsts.gridx = 0;
			gridBagConstrainsts.gridy = 0;
			
			
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			jPanel.add(descricaoHora, gridBagConstrainsts);
			
			
			mostrarTempo.setPreferredSize(new Dimension(200,25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(mostrarTempo, gridBagConstrainsts);
			
			
			//====================
			
			
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoHora2, gridBagConstrainsts);
			
			
			mostrarTempo2.setPreferredSize(new Dimension(200,25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(mostrarTempo2, gridBagConstrainsts);
			
			add(jPanel, BorderLayout.WEST);
			
			
			
			
			
			
			setVisible(true);
			
		}
		
		
	

}

package Arquivos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ObjJSON extends JDialog {

	
		
		
		 
		
		private JPanel  jPanel = new JPanel(new GridBagLayout());
		
		private  JLabel descricaoNome = new JLabel( "Nome" );
		private  JTextField compoTextoNome = new JTextField();
		
		private  JLabel descricaoCPF = new JLabel( "CPF" );
		private  JTextField campoTextoCPF = new JTextField();
		private  JButton jButton = new JButton("Add Lista"); 
		private  JButton jButton2 = new JButton("Parar"); 
		private  JButton jButton3 = new JButton("Iniciar"); 
		private  JButton jButton4 = new JButton("Uplado"); 
		
		
		
public ObjJSON () {
			
			setTitle("Minha Tela");
			setSize(new Dimension(440, 340));
			setLocationRelativeTo(null);
			setResizable(false);
			//=================================
			
			
			GridBagConstraints gridBagConstrainsts = new GridBagConstraints();
			gridBagConstrainsts.gridx = 0;
			gridBagConstrainsts.gridy = 0;
			gridBagConstrainsts.gridwidth =4;
			gridBagConstrainsts.insets = new Insets(5, 10, 5, 5);
			gridBagConstrainsts.anchor = GridBagConstraints.WEST;
			
			descricaoNome.setPreferredSize(new Dimension(300, 25));
			jPanel.add(descricaoNome, gridBagConstrainsts);
			
			
			compoTextoNome.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo.setEditable(false);
			jPanel.add(compoTextoNome, gridBagConstrainsts);
			
			
			//====================
			
			
			descricaoCPF.setPreferredSize(new Dimension(300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoCPF, gridBagConstrainsts);
			
			
			campoTextoCPF.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo2.setEditable(false);
			jPanel.add(campoTextoCPF, gridBagConstrainsts);
			
			gridBagConstrainsts.gridwidth =1;
			
			jButton.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(jButton, gridBagConstrainsts);
			
			
			jButton2.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton2, gridBagConstrainsts);
			
			jButton3.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton3, gridBagConstrainsts);
			
			jButton4.setPreferredSize(new Dimension (300, 25));
			gridBagConstrainsts.gridy = -1;
			//jButton4.setEnabled(false);
			jPanel.add(jButton4, gridBagConstrainsts);
			
			//jButton4.setPreferredSize(new Dimension (300, 25));
			//gridBagConstrainsts.gridy ++;
			//jButton4.setEnabled(false);
			//jPanel.add(jButton4, gridBagConstrainsts);
		
           
			
			add(jPanel, BorderLayout.WEST);
			
			
			
			
			
			
			setVisible(true);
}
	}



package CursoThread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CursoThread.AulaRunnable;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThread extends JDialog{

	
	public JPanel  jPanel = new JPanel(new GridBagLayout());
	
	public JLabel descricaoHora = new JLabel( "Nome" );
	public JTextField mostrarTempo = new JTextField();
	
	public JLabel descricaoHora2 = new JLabel( "Email" );
	public JTextField mostrarTempo2 = new JTextField();
	public JButton jButton = new JButton("Add Lista"); 
	public JButton jButton2 = new JButton("Parar"); 
	public JButton jButton3 = new JButton("Iniciar"); 
	public JButton jButton4 = new JButton("botão4"); 
	
	private Thread thtime1;
	private Thread thtime2;
	
	private ImplemetacaoFilaThread fila = new ImplemetacaoFilaThread();
	
		public TelaThread() {
			
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
			
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			jPanel.add(descricaoHora, gridBagConstrainsts);
			
			
			mostrarTempo.setPreferredSize(new Dimension(400,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo.setEditable(false);
			jPanel.add(mostrarTempo, gridBagConstrainsts);
			
			
			//====================
			
			
			descricaoHora2.setPreferredSize(new Dimension(300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoHora2, gridBagConstrainsts);
			
			
			mostrarTempo2.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo2.setEditable(false);
			jPanel.add(mostrarTempo2, gridBagConstrainsts);
			
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
			
			jButton4.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton4, gridBagConstrainsts);
			
			
			jButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					if(fila == null) {
						fila = new ImplemetacaoFilaThread();
						fila.start();
					}
					
					for (int q = 0; q < 30; q++) {
					
					ObjFilaThread filaThread = new ObjFilaThread();
					filaThread.setNome(mostrarTempo.getText());
					filaThread.setEmail(mostrarTempo2.getText()+" "+ q);
					
					fila.add(filaThread);
					}
					//jButton.setEnabled(false);
					//jButton2.setEnabled(true);
				}
			});
			
			jButton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//Thread thtime1 = new Thread();
					//thtime1.stop();
					
					//jButton2.setEnabled(false);
					//jButton.setEnabled(true);
				
					
					fila.stop();
					fila = null;
				}
			} );
	jButton3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//Thread thtime1 = new Thread();
					//thtime1.stop();
					
					//jButton2.setEnabled(false);
					//jButton.setEnabled(true);
				
					
					fila = new ImplemetacaoFilaThread();
					fila.start();
				}
			} );
			
			fila.start();
			
			add(jPanel, BorderLayout.WEST);
			
			
			
			
			
			
			setVisible(true);
			
		}
		
		
	

}

package Arquivos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import Arquivos.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import Arquivo.ManipularImagem;
import CursoThread.ImplemetacaoFilaThread;
import CursoThread.ObjFilaThread;

public class ObjJSON extends JDialog {

	
		
		
		 
		
		private JPanel  jPanel = new JPanel(new GridBagLayout());
		
		private  JLabel descricaoNome = new JLabel( "Nome" );
		private  JTextField campoTextoNome = new JTextField();
		
		private  JLabel descricaoLogin = new JLabel( "Login" );
		private  JTextField campoTextoLogin = new JTextField();
		
		private  JLabel descricaoCPF = new JLabel( "CPF" );
		private  JTextField campoTextoCPF = new JTextField();
		
		private  JLabel descricaoSenha = new JLabel( "Senha" );
		private  JTextField campoTextoSenha = new JTextField();
		
		
		
		private  JButton jButton = new JButton("Cadastrar API (Dados para Json)"); 
		private  JButton jButton2 = new JButton("Parar"); 
		private  JButton jButton3 = new JButton("Enviar"); 
		private  JButton jButton4 = new JButton("Upload Documentos"); 
		
		
		private Thread JsonThread1;
		
		
		//private JsonThread jsonT = new JsonThread();
		
		
/*public static void upload (String pasta, String nomeDoArquivo, InputStream arquivoCarregado) throws FileNotFoundException { 
	String caminhoArquivo = pasta + "/" + nomeDoArquivo; 
	File novoArquivo = new File(caminhoArquivo); 
	FileOutputStream saida = new FileOutputStream(novoArquivo); 
	copiar(arquivoCarregado, saida);
	}
		

public static void copiar(InputStream origem, OutputStream destino) {
	
	int bite = 0; byte[] 
			tamanhoMaximo = new byte[1024 * 16]; // 8KB
			try { 
			// enquanto bytes forem sendo lidos 
			   while((bite = origem.read(tamanhoMaximo)) >= 0) { 
			    // pegue o byte lido e escreva no destino 
			     destino.write(tamanhoMaximo, 0, bite);
			     } 
			   } catch (IOException e) { 
			     // TODO Auto-generated catch block e.printStackTrace();
			      } 
			  }*/
	
		
		
		
public ObjJSON ()   {
			
			setTitle("Minha Tela");
			setSize(new Dimension(640, 640));
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
			
			
			campoTextoNome.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo.setEditable(false);
			jPanel.add(campoTextoNome, gridBagConstrainsts);
			
			
			descricaoLogin.setPreferredSize(new Dimension(300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoLogin, gridBagConstrainsts);
			
			
			campoTextoLogin.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo.setEditable(false);
			jPanel.add(campoTextoLogin, gridBagConstrainsts);
			
			//====================
			
			
			descricaoCPF.setPreferredSize(new Dimension(300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoCPF, gridBagConstrainsts);
			
			
			campoTextoCPF.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo2.setEditable(false);
			jPanel.add(campoTextoCPF, gridBagConstrainsts);
			
			descricaoSenha.setPreferredSize(new Dimension(300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(descricaoSenha, gridBagConstrainsts);
			
			
			campoTextoSenha.setPreferredSize(new Dimension(300,25));
			gridBagConstrainsts.gridy ++;
			//mostrarTempo2.setEditable(false);
			jPanel.add(campoTextoSenha, gridBagConstrainsts);
			
			gridBagConstrainsts.gridwidth =1;
			
			jButton.setPreferredSize(new Dimension (300, 25));
			gridBagConstrainsts.gridy ++;
			jPanel.add(jButton, gridBagConstrainsts);
			
			jButton4.setPreferredSize(new Dimension (300, 25));
			gridBagConstrainsts.gridy ++;
			//jButton4.setEnabled(false);
			jPanel.add(jButton4, gridBagConstrainsts);
			
			jButton2.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton2, gridBagConstrainsts);
			
			jButton3.setPreferredSize(new Dimension (92, 25));
			gridBagConstrainsts.gridx ++;
			jPanel.add(jButton3, gridBagConstrainsts);
			
			
			
			//jButton4.setPreferredSize(new Dimension (300, 25));
			//gridBagConstrainsts.gridy ++;
			//jButton4.setEnabled(false);
			//jPanel.add(jButton4, gridBagConstrainsts);
		
			
			List<User> usuarios = new ArrayList<User>();
			
	jButton.addActionListener(new ActionListener()  {
				
				@Override
				public void actionPerformed(ActionEvent e) {
								
					
				
					
						//Thread JsonThread1 = new Thread();
						
						System.out.println("Botão 1");
						
						//JsonThread1.start();
						
					
					
					
					User usuario = new User();
					usuario.setNome(campoTextoNome.getText());
					usuario.setCpf(campoTextoCPF.getText());
					usuario.setLogin(campoTextoLogin.getText());
					usuario.setSenha(campoTextoSenha.getText());
					
					
					usuarios.add(usuario);
				
				
				

					System.out.println(usuarios);
					
				
					Gson gson = new GsonBuilder().setPrettyPrinting().create();
					
					
					
					String listasUser = gson.toJson(usuarios);
					
					//String listasUser = new Gson().toJson(usuario);
					
					System.out.println("Lista "+listasUser);
					
					
					
					
					
					FileWriter arquivo = null;
					try {
						arquivo = new FileWriter("D:\\Users\\marcelomls\\git\\repository\\Novo\\src\\Arquivos\\Arq.json");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						arquivo.write(listasUser);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						arquivo.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						arquivo.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				  
			
					
				
					//if(fila == null) {
					//	fila = new ImplemetacaoFilaThread();
					//	fila.start();
					//}
					
					//for (int q = 0; q < 30; q++) {
					
					//ObjFilaThread filaThread = new ObjFilaThread();
					//filaThread.setNome(mostrarTempo.getText());
					//filaThread.setEmail(mostrarTempo2.getText()+" "+ q);
					
					//fila.add(filaThread);
					//}
					//jButton.setEnabled(false);
					//jButton2.setEnabled(true);
				
				}
	
	});
	jButton4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Thread thtime1 = new Thread();
			//thtime1.stop();
			
			//jButton2.setEnabled(false);
			//jButton.setEnabled(true);
			 JFileChooser fc = new JFileChooser();
		        int res = fc.showOpenDialog(null);

		        if (res == JFileChooser.APPROVE_OPTION) {
		            File arquivo = fc.getSelectedFile();

		            try {
		            	
		            
		            
		            	
		               BufferedImage imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 160, 160);

		               // lblImagem.setIcon(new ImageIcon(imagem));

		            } catch (Exception ex) {
		               // System.out.println(ex.printStackTrace().toString());
		            }

		        } else {
		            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
		        }
			
			
			
			
		}
	});
	
	
jButton3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Thread thtime1 = new Thread();
			//thtime1.stop();
			
			//jButton2.setEnabled(false);
			//jButton.setEnabled(true);
			
		
			
			/*String caminho = getClass().getResource("D:/Users/marcelomls/git/repository/Novo/src/Arquivos").toString().substring(5);
			
			     File outputfile = new File(caminho+".pdf");
			    
	             //ImageIO.write(PDF, "pdf", outputfile);
	             //JOptionPane.showMessageDialog(rootPane, "Imagem enviada com sucesso");
			     System.out.println("Arquivo enviado com sucesso");*/
	
	
			
			
		}
			
		
	} );
			
           
			
			add(jPanel, BorderLayout.WEST);
			
			
		
			
			setVisible(true);

	
}

}



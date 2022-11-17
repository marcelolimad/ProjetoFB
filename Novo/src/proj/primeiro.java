package proj;

import java.swing.JOptionPane*;

public class primeiro {
	
	public static void main (String[]args) {
		
		String documentos = javax.swing.JOptionPane.showInputDialog("Quantidade de documentos?");
		String pessoas = javax.swing.JOptionPane.showInputDialog("Quantidade pessoas no seu setor?");
		
		
		double qtdpessoas = Double.parseDouble(pessoas);
		double qtddocumentos = Double.parseDouble(documentos);
		
		int div = (int) ( qtddocumentos / qtdpessoas);
		
		double resto = qtddocumentos % qtdpessoas;
		
		int resp = javax.swing.JOptionPane.showConfirmDialog(null, "Deseja ver resutado da divisão");
		
		String rp = Integer.toString(resp);
		
		if(rp.contains("0")) {
			javax.swing.JOptionPane.showMessageDialog(null, "Divisão de documento por pessoas deu " + div);
			
		}
		
       int resp2 = javax.swing.JOptionPane.showConfirmDialog(null, "Deseja ver resutado do resto");
		
		String rp2 = Integer.toString(resp2);
		
		if(rp2.contains("0")) {
			javax.swing.JOptionPane.showMessageDialog(null, "O resto " + resto);
	    
		}else {
			javax.swing.JOptionPane.showMessageDialog(null, "Saiu, Valeu!!!");
			
		}
			/*System.out.println(resp);
		
		javax.swing.JOptionPane.showMessageDialog(null, "Divisão de documento por pessoas deu " + div + " documentos que sobrou " + resto + " docs");

        System.out.println(pessoas);
		System.out.println(documentos);*/
		
		
		
	}

}

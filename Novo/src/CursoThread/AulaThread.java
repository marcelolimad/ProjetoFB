package CursoThread;

import javax.swing.JOptionPane;
import CursoThread.AulaRunnable;

public class AulaThread   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    Thread TEmail = new Thread(AulaRunnable.thread1);
	    TEmail.start();
	    
	    Thread TNota = new Thread(AulaRunnable.thread2);
	    TNota.start();
	
	    System.out.println("Fim da execução");
		
		JOptionPane.showMessageDialog(null, "Valeuuuuuuuuuuuuuu");
	}
	
	

}


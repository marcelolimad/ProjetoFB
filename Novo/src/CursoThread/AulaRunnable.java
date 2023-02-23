package CursoThread;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;

import CursoThread.TelaThread;

public interface AulaRunnable {
	
	TelaThread tempo = new TelaThread();
	
	
	public Runnable thread1 = new Runnable() {
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i <10; i++) {
				
				System.out.println("prerando envio do email");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("enviado o email");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	public Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i <10; i++) {
				
				System.out.println("prerando envio da nota");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("enviadoa nota");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	public Runnable thread3 = new Runnable() {
		
		@Override
		public void run() {
			     
			 while (true) {
				  
				tempo.mostrarTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
					format(Calendar.getInstance().getTime()));
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 }
		}
	};
	public Runnable thread4 = new Runnable() {
		
		@Override
		public void run() {
			     
			 while (true) {
				  
				tempo.mostrarTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm").
					format(Calendar.getInstance().getTime())+" valeu");
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 }
		}
	};
	
}

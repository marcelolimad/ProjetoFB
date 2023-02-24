package CursoThread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplemetacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjFilaThread>();
	
	public static void add(ObjFilaThread objFilaThread) {
		pilha_fila.add(objFilaThread);
	}
 @Override
public void run() {
 System.out.println("Fila rodando");
	 
	 
	 
	   while(true) {
		   
	Iterator iteracao = pilha_fila.iterator();
	
	 synchronized (iteracao) {
		 
		 while(iteracao.hasNext()) {
			 
			 ObjFilaThread processar = (ObjFilaThread) iteracao.next();
			 
			 /*Processar lote*/
			 /*Gerar arquivos pdf*/
			 
			 System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			System.out.println("=========================");
			 
			 iteracao.remove();
			 
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
	
	}
	 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 }
	 


 
 }
}

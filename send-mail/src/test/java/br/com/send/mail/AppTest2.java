package br.com.send.mail;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2 {
 
	
	private String userName = "projetotestejava995@gmail.com";
	
	private String senha = "sfsdacnycybkjvqy";
	
	//private String userName = "marcelomls@fab.mil.br";
	
	//private String senha = "smeL@3323";
	
	
	@org.junit.Test
	public void testeEmail() {
		
		//Olha as configurações do seu email
		
		try {
		
			/*Properties properties = new Properties();
		
		properties.put("mail.smtp.ssl.trust", "*");
		
		properties.put("mail.smtp.auth", "true"); //Autorização
		properties.put("mail.smtp.starttls","true"); // Autenticação
		properties.put("mail.smtp.host","smtp.gmail.com"); // Servidor gmail Google
		properties.put("mail.smtp.port","465"); // Porta do servidor
		properties.put("mail.smtp.socketFactory.port","465"); // Expecifica a porta a ser conectada pelo socket
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl;SSLSocketFactory");*/ // Classe socket de conexão ao SMTP
		
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");/* Autorização */
			properties.put("mail.smtp.socketFactory.fallback", "false");
			properties.put("mail.smtp.quitwait", "false");
			properties.put("mail.smtp.socketFactory.port", "587");
			properties.put("mail.host", "smtp.gmail.com");
			//properties.put("mail.host", "smtp.fab.mil.br");
			properties.setProperty("mail.transport.protocol", "smtp");

			properties.setProperty("mail.smtp.port", "587");
			properties.setProperty("mail.smtp.ssl.trust", "*");
			properties.setProperty("mail.smtp.starttls.enable", String.valueOf("True"));// True or False
			properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
			properties.setProperty("mail.smtp.timeout", "300000");
			properties.setProperty("mail.smtp.connectiontimeout", "300000");
			properties.setProperty("mail.smtp.writetimeout", "300000");
		
		
		Session session = Session.getInstance(properties, new Authenticator() {
		 
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
				
			}
		
		});
		
		
		System.out.println(senha);
		
		Address[] toUser = InternetAddress.parse("marcelolimad@gmail.com,marcelomls@fab.mil.br,projetotestejava995@gmail.com");
		
		Message  msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName, "Marcelo - Desenvolvimento Java"));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject("Chegou email automatiza java (autor, desenvolvedor Ten Marcelo)");
		//msg.setText("olá meu amigo, tá no hora de automatizar tudo");

		//msg.setSubject("Teste FAB email (autor, desenvolvedor Ten Marcelo)");
		msg.setText("olá meu amigo, tá na hora de automatizar tudo");
		
		Transport.send(msg);
		
		
		Thread.sleep(2000);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

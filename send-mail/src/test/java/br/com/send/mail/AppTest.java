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
public class AppTest {
 
	
	private String userName = "projetotestejava995@gmail.com";
	
	private String senha = "jkayfallebczscgm";
	
	
	@org.junit.Test
	public void testeEmail() {
		
		//Olha as configurações do seu email
		
		try {
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true"); //Autorização
		properties.put("mail.smtp.starttls","true"); // Autenticação
		properties.put("mail.smtp.host","smtp.gmail.com"); // Servidor gmail Google
		properties.put("mail.smtp.port","465"); // Porta do servidor
		properties.put("mail.smtp.socketFactory.port","465"); // Expecifica a porta a ser conectada pelo socket
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl;SSLSocketFactory"); // Classe socket de conexão ao SMTP
		
		Session session = Session.getInstance(properties, new Authenticator() {
		
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
				
			}
		
		});
		
		
		System.out.println(senha);
		
		Address[] toUser = InternetAddress.parse("marcelolimad@gmail.com, marcelomls@fab.mil.br, projetotestejava995@gmail.com");
		
		Message  msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject("Chegou email automatiza java (autor, desenvolvedor Ten Marcelo)");
		msg.setText("olá meu amigo, tá no hora de automatizar tudo");

		Transport.send(msg);
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

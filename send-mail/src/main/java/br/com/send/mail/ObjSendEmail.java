package br.com.send.mail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.swing.text.html.HTMLWriter;
import javax.xml.parsers.DocumentBuilder;

import com.itextpdf.text.Annotation;
import com.itextpdf.text.DocWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ObjSendEmail {

	private String userName = "projetotestejava995@gmail.com";

	private String senha = "sfsdacnycybkjvqy";
	
	String listaDestinatario = "";
	String nomeRemetente = "";
	String assuntoEmail = "";
	String textoEmail = "";
	
	
	

	public ObjSendEmail(String listaDestinatario, String nomeRemetente, String assuntoEmail, String textoEmail) {
		this.listaDestinatario = listaDestinatario;
		this.nomeRemetente = nomeRemetente;
		this.assuntoEmail = assuntoEmail;
		this.textoEmail = textoEmail;
		
	}




	public void sendEmail(boolean sendHtml) throws Exception {

		/*
		 * Properties properties = new Properties();
		 * 
		 * properties.put("mail.smtp.ssl.trust", "*");
		 * 
		 * properties.put("mail.smtp.auth", "true"); //Autorização
		 * properties.put("mail.smtp.starttls","true"); // Autenticação
		 * properties.put("mail.smtp.host","smtp.gmail.com"); // Servidor gmail Google
		 * properties.put("mail.smtp.port","465"); // Porta do servidor
		 * properties.put("mail.smtp.socketFactory.port","465"); // Expecifica a porta a
		 * ser conectada pelo socket properties.put("mail.smtp.socketFactory.class",
		 * "javax.net.ssl;SSLSocketFactory");
		 */ // Classe socket de conexão ao SMTP

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/* Autorização */
		properties.put("mail.smtp.socketFactory.fallback", "false");
		properties.put("mail.smtp.quitwait", "false");
		properties.put("mail.smtp.socketFactory.port", "587");
		properties.put("mail.host", "smtp.gmail.com");
		// properties.put("mail.host", "smtp.fab.mil.br");
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

		Address[] toUser = InternetAddress.parse(listaDestinatario);

		/*Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName, "Marcelo - Desenvolvimento Java"));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject("Chegou email automatiza java (autor, desenvolvedor Ten Marcelo)");
		// msg.setText("olá meu amigo, tá no hora de automatizar tudo");

		// msg.setSubject("Teste FAB email (autor, desenvolvedor Ten Marcelo)");
		msg.setText("olá meu amigo, tá na hora de automatizar tudo");*/

		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName, nomeRemetente));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject(assuntoEmail);
		// msg.setText("olá meu amigo, tá no hora de automatizar tudo");

		// msg.setSubject("Teste FAB email (autor, desenvolvedor Ten Marcelo)");
		
		if(sendHtml) {
			msg.setContent(textoEmail, "text/html; charset=utf-8");
		}else {
		
		msg.setText(textoEmail);
		
		}
		Transport.send(msg);

	} // fim
	
	
	public void sendEmailAnexo(boolean sendHtml) throws Exception {

		

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/* Autorização */
		properties.put("mail.smtp.socketFactory.fallback", "false");
		properties.put("mail.smtp.quitwait", "false");
		properties.put("mail.smtp.socketFactory.port", "587");
		properties.put("mail.host", "smtp.gmail.com");
		// properties.put("mail.host", "smtp.fab.mil.br");
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

		Address[] toUser = InternetAddress.parse(listaDestinatario);

	
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName, nomeRemetente));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject(assuntoEmail);
		
		
		/*Parte 1 do email com texto do email */
		MimeBodyPart corpoEmail = new MimeBodyPart();
		
	
		
		if(sendHtml) {
			corpoEmail.setContent(textoEmail, "text/html; charset=utf-8");
		}else {
		
			corpoEmail.setText(textoEmail);
		
		}
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(corpoEmail);
		
		List<FileInputStream> arquivosPDF = new ArrayList<FileInputStream>();
		arquivosPDF.add(simuladorPDF());
		arquivosPDF.add(simuladorPDF());
		
		List<FileInputStream> arquivosDOC = new ArrayList<FileInputStream>();
		arquivosDOC.add(simuladorPDF());
		arquivosDOC.add(simuladorPDF());
		
		
		
		int i = 0;
		for(FileInputStream fileInputStreamPDF: arquivosPDF) {
			//System.out.println(fileInputStream);
		
		/* Parte 2 são os anexos */
		MimeBodyPart anexoEmail = new MimeBodyPart();
		
		/* Onde é passado o simuladorPDF voce passa o seu arquivo no banco de dados*/
		anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(fileInputStreamPDF, "aplication/pdf")));
		anexoEmail.setFileName("marcPDF"+i+".pdf");
		
		//Multipart multipart = new MimeMultipart();
		//multipart.addBodyPart(corpoEmail);
		multipart.addBodyPart(anexoEmail);
		
		i++;
		
		}
		
		for(FileInputStream fileInputStreamDOC: arquivosDOC) {
			//System.out.println(fileInputStream);
		
		/* Parte 2 são os anexos */
		MimeBodyPart anexoEmail = new MimeBodyPart();
		
		/* Onde é passado o simuladorPDF voce passa o seu arquivo no banco de dados*/
		anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(fileInputStreamDOC, "aplication/doc")));
		anexoEmail.setFileName("marcDOC"+i+".doc");
		
		//Multipart multipart = new MimeMultipart();
		//multipart.addBodyPart(corpoEmail);
		multipart.addBodyPart(anexoEmail);
		
		i++;
		
		}
		msg.setContent(multipart);
		
		Transport.send(msg);
		
	}
	/**
	 *Esse metado simular PDF ou qualquer arquivo que posso ser enviado por email 
	 * voce pode pegar arquivo de banco de dados, pode ser byte[], Stream de Arquivos. 
	 * Pode estar e um banco de dados, ou em uma pasta.
	 * Retorna um pdf em brando com texto do paragrafo.
	 * 
	 * @return
	 * @throws Exception
	 */
	private FileInputStream simuladorPDF() throws Exception{
		Document documento = new Document();
		File file = new File("arquivoAnexo.pdf");
		file.getName();
		file.createNewFile();
		PdfWriter.getInstance(documento, new FileOutputStream(file));
		documento.open();
		documento.add(new Paragraph(" Autor: Marcelo Lima - Desenvolvedor"));
		documento.add(new Annotation("Marcelo", "no perioda 10 está com elemento 34"));
		
		documento.close();
		
		return new FileInputStream(file);
		
		
	
	}
	
	private FileInputStream simuladorDOC() throws Exception{
		Document documento = new Document();
		File file = new File("arquivoAnexo.pdf");
		file.getName();
		file.createNewFile();
		PdfWriter.getInstance(documento, new FileOutputStream(file));
		documento.open();
		documento.add(new Paragraph(" Autor: Marcelo Lima - Desenvolvedor"));
		documento.add(new Annotation("Marcelo", "no perioda 10 está com elemento 34"));
		
		documento.close();
		
		return new FileInputStream(file);
		
		
		
	
	}
}

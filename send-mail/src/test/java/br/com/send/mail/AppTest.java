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
 

	
	
	
	@org.junit.Test
	public void testeEmail() throws Exception {
		
		//Olha as configurações do seu email
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("<h2>Você está recebendo um email com html</h2> <br/><br/>");
		stringBuilderTextoEmail.append("Click no botão abaixo.<br/><br/>");
		stringBuilderTextoEmail.append("<br>Login:</br> blablabla.com<br/>");
		stringBuilderTextoEmail.append("<br>Senha:</br> blablab<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"http://localhost:8080/ProjetoTeste/projSquare.html\" style=\"color: #2525a7; padding: 14px 25px; text-align: center; text-decoration: none; display: inline-block; border-radius: 30px; font-size: 20px; font-family: courier; border: 3px solid blue; background-color: #99DA39; font-weight: 900;\">Acessar o site</a><br/><br/>");
		stringBuilderTextoEmail.append("<span style=\"font-size:12px\">Ass: Marcelo Lima </span>");
	  //stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"http://localhost:8080/ProjetoTeste/projSquare.html\" style=\"color: #2525A7; padding: 14px 25px; text-align: center; text-decoration: none; display: inline-block; border-radius: 30px; font-size: 20px; font-family: courier; border: 3px solid green; background-color: #99DA39; font-weight: 900;\">Acessar o site 2</a><br/><br/>");
		
		
		ObjSendEmail enviaEmail = new ObjSendEmail("marcelolimad@gmail.com,projetotestejava995@gmail.com", 
				" Marcelo Lima - Java", "Email com Anexo",
				stringBuilderTextoEmail.toString());
		
		//enviaEmail.sendEmail(true);
		enviaEmail.sendEmailAnexo(true);
		
	}
	
}

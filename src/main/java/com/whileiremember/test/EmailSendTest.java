package com.whileiremember.test;

import java.io.IOException;

import com.sendgrid.*;

public class EmailSendTest {
	
//	public static void main(String[] args) throws IOException {
//		Email from = new Email("test@lukaszbudyn.pl");
//		String subject = "no-reply Sending with SendGrid is Fun (test whitelabel 6)";
//		Email to = new Email("lukasz-budyn@wp.pl");
//		Content content = new Content("text/plain", "and easy to do anywhere, even with Java "
//				+ "whileiremember.lukaszbudyn.pl");
//		Mail mail = new Mail(from, subject, to, content);
//		
//		SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
//		Request request = new Request();
//
//		try {
//			request.setMethod(Method.POST);
//			request.setEndpoint("mail/send");
//			request.setBody(mail.build());
//			Response response = sg.api(request);
//			System.out.println(response.getStatusCode());
//			System.out.println(response.getBody());
//			System.out.println(response.getHeaders());
//		} catch (IOException ex) {
//			throw ex;
//		}
//	}
}
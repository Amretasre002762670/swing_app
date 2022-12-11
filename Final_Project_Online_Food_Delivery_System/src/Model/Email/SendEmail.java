/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Email;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author amretasrerengarajan
 */
public class SendEmail {

    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; //or simply "localhost"
    private static final String SMTP_AUTH_USER = "amretasrerengarajan@gmail.com";
    private static final String SMTP_AUTH_PWD = "pwqyggdzntxnsuta";
//    private static final String emailMsgTxt = "Your order is successfully placed";
//    private static final String emailSubjectTxt = "Order placed";
    private static final String emailFromAddress = "amretasrerengarajan@gmail.com";

    // Add List of Email address to who email needs to be sent to
//    private static final String[] emailList = {"amretasrert@gmail.com", "amretasre6@gmail.com"};

//    public static void main(String args[]) throws Exception {
//        SendEmail smtpMailSender = new SendEmail();
//        smtpMailSender.postMail(emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress);
//        System.out.println("Sucessfully Sent mail to All Users");
//    }

    public void postMail(String recipients[], String subject,
            String message, String from) throws MessagingException, AuthenticationFailedException {
        boolean debug = false;

        //Set the host smtp address
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.debug", "true");
        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);

        session.setDebug(debug);

        // create a message
        Message msg = new MimeMessage(session);

        // set the from and to address
        InternetAddress addressFrom = new InternetAddress(from);
        msg.setFrom(addressFrom);

        InternetAddress[] addressTo = new InternetAddress[recipients.length];
        for (int i = 0; i < recipients.length; i++) {
            addressTo[i] = new InternetAddress(recipients[i]);
        }
        msg.setRecipients(Message.RecipientType.TO, addressTo);

        // Setting the Subject and Content Type
        msg.setSubject(subject);
        msg.setContent(message, "text/plain");
        Transport.send(msg);
    }

    private class SMTPAuthenticator extends javax.mail.Authenticator {

        public PasswordAuthentication getPasswordAuthentication() {
            String username = SMTP_AUTH_USER;
            String password = SMTP_AUTH_PWD;
            return new PasswordAuthentication(username, password);
        }
    }
}

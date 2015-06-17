package totalservice.utilities;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.mail.*;


/**
 * Class of sending emails to the specified mailbox from your account
 *  
 * @param smtpserver - it is an address for smtp server of email provaider whitch your using
 * @param port - it is number of port of email provaider whitch your using
 * @param youremailaddress - your email address of email provaider whitch your using
 * @param password - your account password on the email
 * @param addto - email address at which the report will be sent 
 * @param subject - it is the subject of mail whith will be send
 * @param message - it is the message of mail whith will be send
 * @param DataList - The list obtained from DataInputAtFile class that contains user previous data
 * @param SetData - variable of main menu for setting data in class MainMenu
 * 
 */

public class EmailSender 
{
    
    private String smtpserver = "";       
    private int port = 0;                
    private String youremailaddress = ""; 
    private String password = "";        
    private String addto = "";  
    private List<String> DataList = new ArrayList<String>();
    
    public EmailSender()
    {}    
   
    
    /**
     * Gaining access to the server with the specified username and password, and a Send mail
     *       
     * @param smtpserver - it is an address for smtp server of email provaider whitch your using
     * @param port - it is number of port of email provaider whitch your using
     * @param youremailaddress - your email address of email provaider whitch your using
     * @param password - your account password on the email
     * @param addto - email address at which the report will be sent 
     * @param subject - it is the subject of mail whith will be send
     * @param message - it is the message of mail whith will be send
     * @param SetData - parametr of main menu for setting data in class MainMenu
     * 
     */
    
    public void SendEmail(String smtpserver, int port,String youremailaddress, String password,String sudject, String message, String addto)
    {
        try 
        {
            Email email = new SimpleEmail();
            email.setHostName(smtpserver);
            email.setSmtpPort(port);
            email.setAuthenticator(new DefaultAuthenticator(youremailaddress, password));
            if(port == 465)
            {
                email.setSSLOnConnect(true);
            }
            else
            {
                email.setTLS(true);
            }
            email.setFrom(youremailaddress);
            email.setSubject(sudject);
            email.setMsg(message);
            email.addTo(addto);
            email.send();
        } 
        catch (EmailException ex) 
        {                          
                       
        }    
    }
}

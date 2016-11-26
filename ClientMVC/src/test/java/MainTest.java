//import Iteso.mx.Client.Reciever;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by lamos on 11/26/2016.
 */
public class MainTest {
    Socket Client;

@Before
public void SetUp(){
    Client = new Socket();
    SocketAddress Address = mock(SocketAddress.class);

}

@Test
public void newConnection(){


    try {
      //  Client = new Socket();
        SocketAddress Address = new InetSocketAddress("192.168.0.5", 6212);

        //PrintWriter pw;
        Client.connect(Address);
        //Reciever r = new Reciever(Client);
        //Thread t = new Thread(r);
        //t.start();

    assertEquals("/192.168.0.5", Client.getInetAddress());
        Client.close();
    } catch (Exception e) {


    }
        }
  @Test
    public void NewMessage(){
        try {
            Client = new Socket();
            SocketAddress Address = new InetSocketAddress("192.168.0.5", 6212);

            PrintWriter pw;
            Client.connect(Address);
            Client.close();
            pw = new PrintWriter(Client.getOutputStream());
            while (true) {

                    String strMsg = "hola"; //= JOptionPane.showInputDialog("Escriba un mensaje:"); // esta parte Actua como controller Al pedir un Input al cliente

                    pw.println(strMsg);
                    pw.flush();
                    if (strMsg.equals("close"))
                        break;
                    assertEquals("hola", strMsg);
                   
            }
        } catch (Exception e) {


        }
    }
}

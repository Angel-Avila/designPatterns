package Iteso.mx.Client;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) { // MAIN CLIENTE Actua principalmente como Model puesto que da las reglas de los clientes asi como maneja la informacion para mandarla  al servidor
		// TODO Auto-generated method stub
		Socket Client;

		try {
			Client = new Socket();
			SocketAddress Address = new InetSocketAddress("192.168.0.5", 6212); // inet
																				// es
																				// para
																				// establecer
																				// conexiones
																				// de
																				// internet

			PrintWriter pw;
			Client.connect(Address);
			Reciever r = new Reciever(Client);
			Thread t = new Thread(r);
			t.start();

			pw = new PrintWriter(Client.getOutputStream());
			while (true) {

				String strMsg = JOptionPane.showInputDialog("Escriba un mensaje:"); // esta parte Actua como controller Al pedir un Input al cliente

				pw.println(strMsg);
				pw.flush();
				if (strMsg.equals("close"))
					break;

			}

			Client.close();
		} catch (Exception e) {

			// System.out.println(e.toString());
		}

	}

}

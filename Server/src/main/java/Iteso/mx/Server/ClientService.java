package Iteso.mx.Server;import java.net.*;
import java.util.Scanner;
import java.util.*;

public class ClientService implements Runnable {  // este servicio es el que controloa a los clientes por lo tanto es un Model, maneja datos y define las reglas de los clientes

	static int KeyGenID;
	Socket Client;
	public int WorkID;
	public ArrayList<String> OutBox;

	ClientService(Socket C) {
		Client = C;
		WorkID = KeyGenID++;
		System.out.println("Ready to work: " + WorkID++); // crea el client
															// service
		OutBox = new ArrayList<String>();
	}

	public void run() {

		try {
			System.out.println("Client Service Started" + WorkID);
			Scanner in = new Scanner(Client.getInputStream());

			while (true) {
				String strMsg;
				strMsg = in.nextLine();
				System.out.println("Incomming message from: " + WorkID + ": " + strMsg);
				if (strMsg.equals("close")) {
					break;
				}

				synchronized (Main.CriticalSection) {
					for (int i = 0; i < Main.Clients.size(); i++) {
						if (Main.Clients.get(i) != this)
							Main.Clients.get(i).OutBox.add(strMsg);
					}
				}
				// Client.close();
				synchronized (Main.CriticalSection) {

					Main.Clients.remove(this);
				}
			}

		} catch (Exception e) {

		}
		System.out.println("Service finished: " + WorkID);

	}

}

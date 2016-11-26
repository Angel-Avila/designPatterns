package Iteso.mx.Client;

import java.net.*;
import java.util.*;

public class Reciever implements Runnable {
	Socket Server;
	public ArrayList<String> OutBox;

	public Reciever(Socket X) {
		Server = X;
		OutBox = new ArrayList<String>();
	}

	public void run() {
		try {
			Scanner op = new Scanner(Server.getInputStream());
			while (true) {
				String strMsg = op.nextLine();
				System.out.println(strMsg);
				op.close();
			}

		} catch (Exception e) {

		}
	}
}

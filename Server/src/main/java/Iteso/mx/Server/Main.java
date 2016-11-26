package Iteso.mx.Server;import java.net.*;
import java.util.*;

public class Main {

	public static ArrayList<ClientService> Clients; // MAIN SERVER   Model que hace las reglas de la creacoin del servidor y la logica
	public static Object CriticalSection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clients = new ArrayList<ClientService>();
		CriticalSection = new Object();

		try {
			System.out.println("My server is Listening at 6212");
			ServerSocket Server = new ServerSocket(6212); // el numero
															// representa el
															// puerto de salida
															// Socket que se
															// abre para
															// escuchar
			Thread t = new Thread(new Deliver());
			t.start();
			while (true) {
				Socket Client = Server.accept(); // Socket que abre comunicacion
													// con un cliente
				System.out.println("A client has been connected");
				ClientService Service = new ClientService(Client);

				synchronized (CriticalSection) {
					Clients.add(Service);
				}

				t = new Thread(Service);
				t.start();
			}

		} catch (Exception e) {
			// System.out.println(e.toString());
		}

	}

}

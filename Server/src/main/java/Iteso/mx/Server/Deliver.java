package Iteso.mx.Server;import java.io.*;

public class Deliver implements Runnable { // esta clase manda los mensajes que se reciven  y los reparte, es un VIew mas que nada hacer que todos puedan ver sus mensajes

	public void run() {

		while (true) {
			try {
				try {

					wait(1000);
				} catch (Exception e) {

				}
				synchronized (Main.CriticalSection) {
					for (int i = 0; i < Main.Clients.size(); i++) {

						for (int j = 0; j < Main.Clients.size(); i++) {
							String strMsg = Main.Clients.get(i).OutBox.get(j);
							PrintWriter pw = new PrintWriter(Main.Clients.get(i).Client.getOutputStream());
							pw.println(strMsg);
							pw.flush();

						}
						Main.Clients.get(i).OutBox.clear();
					}
				}

			} catch (Exception e) {

			}

		}
	}

}

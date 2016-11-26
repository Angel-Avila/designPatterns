import com.sun.corba.se.spi.activation.Server;
import com.sun.xml.internal.fastinfoset.tools.TransformInputOutput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lamos on 11/26/2016.
 */
public class ReceiverTest {
    Socket Server;
    public ArrayList<String> OutBox;

   // @Test
   /* public void TestRun(){


        try {
            String Input = "hola";
             InputStream op = new ByteArrayInputStream(Input.getBytes());
            System.setIn(op);
            assertEquals("hola",Server.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
}
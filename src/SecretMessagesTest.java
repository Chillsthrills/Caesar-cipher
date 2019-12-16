import org.junit.*;

import javax.naming.NameClassPair;

import static org.junit.Assert.*;
import java.util.Scanner;

public class SecretMessagesTest {

    @Test
    public void Scanner_userinput_nextLine() {


    }

    public void testSecret_instanciates(){
        SecretMessages secret = new SecretMessages();
        assertEquals(true, secret instanceof SecretMessages);
    }

    public void testSecret_testTextGetter_hello(){
        SecretMessages secret = new SecretMessages("hello", 2);
        assertEquals("hello", secret.getText());
    }

    public void testSecret_testkeyGetter_2(){
        SecretMessages secret = new SecretMessages("hello", 2);
        assertEquals(2, secret.getKey());
    }
    public void testSecret_testEncrypt(){
        SecretMessages secret = new SecretMessages();
    }

}
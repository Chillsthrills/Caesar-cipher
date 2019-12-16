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

    }
}
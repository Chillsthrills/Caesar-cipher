import java.util.Scanner;
public class SecretMessages {
    private String text;
    private int key;

    public SecretMessages(){

    }

    public SecretMessages(String text, int key){
        this.text=text;
        this.key=key;

    }
        public void encrypt(String message, int keyVal){
            char key = (char)keyVal;
            String output = "";
            for (int x = 0; x < message.length(); x++) {
                char input = message.charAt(x);
                if (input >= 'A' && input <= 'Z') {
                    input += key;
                    if (input > 'Z')
                        input -= 26;
                    if (input < 'A')
                        input += 26;
                } else if (input >= 'a' && input <= 'z') {
                    input += key;
                    if (input > 'z')
                        input -= 26;
                    if (input < 'a')
                        input += 26;
                } else if (input >= '0' && input <= '9') {
                    input += (keyVal % 10);
                    if (input > '9')
                        input -= 10;
                    if (input < '0')
                        input += 10;
                }

                output += input;
            }

            System.out.println(output);
        }


        public String getText(){
            return this.text;
        }

        public int getKey(){
            return this.key;
        }

        public void SetText(String text){
            this.text=text;
        }

        public void SetKey(int key){
            this.key=key;
         }
}

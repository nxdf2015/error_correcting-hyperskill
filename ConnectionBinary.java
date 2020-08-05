package correcter;

import java.util.Random;

public class ConnectionBinary {

    public byte[]  send(byte[] message) {
        Random random = new Random();


       byte[] messageError = new byte[message .length];
       for(int i = 0 ; i <message .length ; i++){
           int offset = random.nextInt(8);

           messageError[i] =  (byte) (message [i] ^ ((byte)1 << offset)) ;
       }
       return messageError ;
    }
}

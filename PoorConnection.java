package correcter;

import java.util.Random;

public class PoorConnection implements Connection{
    @Override
    public String send(String message) {
        StringBuilder line = new StringBuilder(message);
        Random random = new Random();

        for(int i = 0 ; i <= line.length()-3 ; i = i + 3){
            int pos = random.nextInt(3);
            int  letter = random.nextInt(25);

            line.setCharAt(i + pos, (char)('a' + letter));
        }
        return line.toString();
    }
}

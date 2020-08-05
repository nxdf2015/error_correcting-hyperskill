package correcter;

public class CoderTriple implements Coder{
    @Override
    public String encode(String message) {
        StringBuilder line = new StringBuilder();
        for (String letter : message.split("")){
            line.append(letter.repeat(3));
        }
        return line.toString();
    }

    @Override
    public String decode(String message) {
        StringBuilder line = new StringBuilder();
        for(int i = 0 ; i <= message.length()-3 ; i=i+3){
            if(message.charAt(i) == message.charAt(i+1) || message.charAt(i) == message.charAt(i+2)){
                line.append(message.charAt(i));
            }
            else {
                line.append(message.charAt(i+1));
            }
        }
        return line.toString();
    }
}

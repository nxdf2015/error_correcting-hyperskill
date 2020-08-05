package correcter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  Data {

    private String nameFile;
    private  String  message;

    Data(String nameFile) {
        this.nameFile = nameFile;
    }

    public Data() {
        nameFile = "send.txt";
    }

    public void read(){
        try(BufferedReader   reader = new BufferedReader(new FileReader(new File(nameFile)))){
message = reader.lines().collect(Collectors.joining());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMessage() {
        return message;
    }

    public void save(byte[] messageSend) {
        try(FileOutputStream writer = new FileOutputStream(new File("received.txt"))){
            writer.write(messageSend);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

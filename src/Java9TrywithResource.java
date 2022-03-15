import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.Scanner;

public class Java9TrywithResource {


    public void display() throws FileNotFoundException {
        InputStream inputStream=new FileInputStream("/Users/grootan/Downloads/java9/sample2.txt");
        Scanner s=new Scanner(inputStream);
        //try with resource
        //we don't need to close resources (file, connection, network etc) explicitly,
        // try-with-resource close that automatically by using AutoClosable interface.
        try(inputStream;s)
        {
            while(s.hasNextLine())
            {
                System.out.println(s.nextLine());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}

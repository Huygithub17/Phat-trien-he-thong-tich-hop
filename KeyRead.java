import java.io.*;
public class KeyRead {
    public static void main(String[] args){
        try{
            int ch = System.in.read();
            System.out.print("ky tu" + (char)ch + "co ma ascii"+ch);

        } catch (IOException ie){
            System.out.println(ie);

        }
        

    }
}

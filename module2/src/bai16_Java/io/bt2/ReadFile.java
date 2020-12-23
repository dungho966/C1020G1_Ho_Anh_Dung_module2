package bai16_Java.io.bt2;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/bai16_Java/io/bt2/country.txt")));
            String line = null ;
            String []  arr = null;
            while ((line = bufferedReader.readLine())!= null){

                arr = line.split(",");
                System.out.println(arr[5]);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

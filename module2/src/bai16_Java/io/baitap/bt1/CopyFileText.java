package bai16_Java.io.baitap.bt1;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/bai16_Java/io/baitap/bt1/a.txt"
                            )
                    )
            );
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(new File("src/bai16_Java/io/baitap/bt1/b.txt")));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("Nguyen van D , 18 , male" );
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
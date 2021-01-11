package bai16_Java.io.baitap.bt3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class checkWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(
                        new File("src/bai16_Java/io/baitap/bt3/check.csv")
                )
        );
        bufferedWriter.write(555);
        bufferedWriter.newLine();
        bufferedWriter.close();

    }
}

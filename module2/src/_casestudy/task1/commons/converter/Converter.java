package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Converter<E> {
    private FormatCSV<E> formatCSV;

    public Converter(FormatCSV<E> formatCSV) {
        this.formatCSV = formatCSV;
    }

    public void writeToCSVFile(E element,String filePath){
        File file = new File(filePath);
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(formatCSV.objectToCSV(element));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<E> csvToList(String filepath){
        File file = new File(filepath);
        List<E> list = new ArrayList<>();
        try {
            if (!file.exists()) {
                return list;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null){
                list.add(formatCSV.csvToObject(line));
            }
            bufferedReader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}

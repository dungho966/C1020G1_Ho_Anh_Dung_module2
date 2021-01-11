package _casestudy.task1.commons.converter;

import _casestudy.task1.model.House;

public class FormatCSVHouse implements FormatCSV<House> {
    @Override
    public String objectToCSV(House house) {
        return  new FormatCSVService().objectToCSV(house) + COMMA_DELIMITER
                + house.getStandardRoom() + COMMA_DELIMITER
                + house.getOtherConvenient() + COMMA_DELIMITER
                + house.getFloors();
    }

    @Override
    public House csvToObject(String string) {
        String[] arrString = string.split(",");
        return new House(arrString[0] ,
                arrString[1] ,
                Integer.parseInt(arrString[2]) ,
                Integer.parseInt(arrString[3]),
                Integer.parseInt(arrString[4]),
                arrString[5],
                arrString[6],
                arrString[7],
                Integer.parseInt(arrString[8]));
    }
}

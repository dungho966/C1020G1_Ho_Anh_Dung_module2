package _casestudy.task1.commons.converter;

import _casestudy.task1.model.House;
import _casestudy.task1.model.Villa;

public class FormatCSVVilla implements FormatCSV<Villa> {
    @Override
    public String objectToCSV(Villa villa) {
        return new FormatCSVService().objectToCSV(villa) + COMMA_DELIMITER
                + villa.getStandartRoom() + COMMA_DELIMITER
                + villa.getOtherConvenient() + COMMA_DELIMITER
                + villa.getPoolArea() + COMMA_DELIMITER
                + villa.getFloors();
    }

    @Override
    public Villa csvToObject(String string) {
        String[] arrString = string.split(",");
        return new Villa(arrString[0] ,
                arrString[1] ,
                Integer.parseInt(arrString[2]) ,
                Integer.parseInt(arrString[3]),
                Integer.parseInt(arrString[4]),
                arrString[5],
                arrString[6],
                arrString[7],
                Integer.parseInt(arrString[8]),
                Integer.parseInt(arrString[9]));
    }
    }


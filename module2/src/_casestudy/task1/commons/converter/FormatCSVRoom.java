package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Room;
import _casestudy.task1.model.Villa;

public class FormatCSVRoom implements FormatCSV<Room> {
    @Override
    public String objectToCSV(Room room) {
        return new FormatCSVService().objectToCSV(room) + COMMA_DELIMITER
                + room.getFreeServices();
    }

    @Override
    public Room csvToObject(String string) {
        String[] arrString = string.split(",");
        return new Room(arrString[0] ,
                arrString[1] ,
                Integer.parseInt(arrString[2]) ,
                Integer.parseInt(arrString[3]),
                Integer.parseInt(arrString[4]),
                arrString[5],
                arrString[6]
                );
    }

}

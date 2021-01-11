package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Services;

public class FormatCSVService implements FormatCSV <Services>{
    @Override
    public String objectToCSV(Services services) {
        return services.getId() + COMMA_DELIMITER +
                services.getNameServices() + COMMA_DELIMITER +
                services.getUseArea() + COMMA_DELIMITER +
                services.getPrice() + COMMA_DELIMITER +
                services.getMaximumHuman() + COMMA_DELIMITER +
                services.getRentalType();
    }
    @Override
    public Services csvToObject(String string) {
        return null;
    }
}

package com.example.el3atar.converter;

import org.joda.time.DateTime;
import javax.persistence.AttributeConverter;

public class DateTimeConverter implements AttributeConverter<DateTime, String> {

    @Override
    public String convertToDatabaseColumn(DateTime attribute) {
        return attribute.toString("yyyy.MMM.dd GGG hh:mm aaa");
    }

    @Override
    public DateTime convertToEntityAttribute(String dbData) {
        return DateTime.parse(dbData);
    }
}

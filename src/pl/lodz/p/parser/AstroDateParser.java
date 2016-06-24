package pl.lodz.p.parser;

import com.astrocalculator.AstroDateTime;

import java.util.Date;

/**
 * Created by kfleszar on 18.06.16.
 */
public class AstroDateParser {

    public static Date parseAstroDateToDate (AstroDateTime astroTime) {
        int year = astroTime.getYear();
        int month = astroTime.getMonth();
        int day = astroTime.getDay();

        int hour = astroTime.getHour();
        int minute = astroTime.getMinute();
        int second = astroTime.getSecond();

        return new Date(year, month, day, hour, minute, second);
    }

    public static AstroDateTime parseDateToAstroDate (Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();

        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();

        int timezoneOffset = date.getTimezoneOffset();

        return new AstroDateTime(year, month, day, hour, minute, second, timezoneOffset, false);
    }
}

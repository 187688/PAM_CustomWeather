package pl.lodz.p.parser;

import com.astrocalculator.AstroDateTime;

import java.util.Date;

/**
 * Created by kfleszar on 18.06.16.
 */
public class AstroDateParser {

    public static Date parseAstroDateToDate (AstroDateTime astroTime) {
        int day = astroTime.getDay();
        int month = astroTime.getMonth();
        int year = astroTime.getYear();

        int hour = astroTime.getHour();
        int minute = astroTime.getMinute();
        int second = astroTime.getSecond();

        return new Date(year, month, day, hour, minute, second);
    }
}

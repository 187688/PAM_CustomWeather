package pl.lodz.p.info;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;

/**
 * Created by kfleszar on 18.06.16.
 */
public class GeneralInfo {

    private MoonInfo moonInfo;

    private SunInfo sunInfo;

    private double longtitude;

    private double latitude;

    private AstroCalculator astroCalculator;

    private int refreshInterval;

    public GeneralInfo () {
        mockCoordinates();
        initAstroCalculator();
    }

    private void mockCoordinates() {
        latitude = 51.7592;
        longtitude = 19.456;
    }

    private void initAstroCalculator() {
        AstroCalculator.Location location = new AstroCalculator.Location(latitude, longtitude);
        AstroDateTime date = new AstroDateTime();
        astroCalculator = new AstroCalculator(date, location);
    }

    public SunInfo getSunInfo() {
        sunInfo = new SunInfo(astroCalculator.getSunInfo());
        return sunInfo;
    }

    public MoonInfo getMoonInfo() {
        moonInfo = new MoonInfo(astroCalculator.getMoonInfo());
        return moonInfo;
    }


}

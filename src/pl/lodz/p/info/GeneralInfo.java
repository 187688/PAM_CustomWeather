package pl.lodz.p.info;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;

/**
 * Created by kfleszar on 18.06.16.
 */
public class GeneralInfo {

    private static MoonInfo moonInfo;

    private static SunInfo sunInfo;

    private static double longitude;

    private static double latitude;

    private static AstroCalculator astroCalculator;

    /**
     * Refreshing interval given in sec
     */
    private static int refreshInterval;


    public static void mockCoordinates() {
        latitude = 51.7592;
        longitude = 19.456;
    }

    public static void updateAstroCalculator() {
        AstroCalculator.Location location = new AstroCalculator.Location(latitude, longitude);
        AstroDateTime date = new AstroDateTime();
        astroCalculator = new AstroCalculator(date, location);
    }

    public static SunInfo getSunInfo() {
        sunInfo = new SunInfo(astroCalculator.getSunInfo());
        return sunInfo;
    }

    public static MoonInfo getMoonInfo() {
        moonInfo = new MoonInfo(astroCalculator.getMoonInfo());
        return moonInfo;
    }

    public static double getLongitude() {
        return longitude;
    }

    public static void setLongitude(double longitude) {
        GeneralInfo.longitude = longitude;
    }

    public static double getLatitude() {
        return latitude;
    }

    public static void setLatitude(double latitude) {
        GeneralInfo.latitude = latitude;
    }

    public static int getRefreshInterval() {
        return refreshInterval;
    }

    public static void setRefreshInterval(int refreshInterval) {
        GeneralInfo.refreshInterval = refreshInterval;
    }
}

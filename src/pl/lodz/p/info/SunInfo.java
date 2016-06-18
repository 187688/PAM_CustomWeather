package pl.lodz.p.info;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;

/**
 * Created by kfleszar on 18.06.16.
 */
public class SunInfo {

    /**
     * Czas wschodu
     */
    private AstroDateTime sunrise;

    /**
     * Czas zachodu
     */
    private AstroDateTime sunset;

    /**
     * Świt cywilny
     */
    private AstroDateTime twilightMorning;

    /**
     * Zmierzch cywilny
     */
    private AstroDateTime twilightEvening;

    /**
     * Azymut wschodu
     */
    private double sunsetAzimuth;

    /**
     * Azymut zachodu
     */
    private double sunriseAzimuth;

    public SunInfo (AstroCalculator.SunInfo sunInfo) {
        this.sunset = sunInfo.getSunset();
        this.sunrise = sunInfo.getSunrise();
        this.twilightEvening = sunInfo.getTwilightEvening();
        this.twilightMorning = sunInfo.getTwilightMorning();
        this.sunriseAzimuth = sunInfo.getAzimuthRise();
        this.sunsetAzimuth = sunInfo.getAzimuthSet();
    }

    public String getSunriseAzimuthAsString() {
        return Double.toString(Math.round(sunriseAzimuth * 100) / 100);
    }

    public String getSunsetAzimuthAsString() {
        return Double.toString(Math.round(sunsetAzimuth * 100) / 100);
    }

    /**
     * --- GETTERS & SETTERS ---
     */

    public AstroDateTime getSunrise() {return sunrise;}

    public void setSunrise(AstroDateTime sunrise) {this.sunrise = sunrise;}

    public AstroDateTime getSunset() {return sunset;}

    public void setSunset(AstroDateTime sunset) {this.sunset = sunset;}

    public AstroDateTime getTwilightMorning() {return twilightMorning;}

    public void setTwilightMorning(AstroDateTime twilightMorning) {this.twilightMorning = twilightMorning;}

    public AstroDateTime getTwilightEvening() {return twilightEvening;}

    public void setTwilightEvening(AstroDateTime twilightEvening) {this.twilightEvening = twilightEvening;}

    public double getSunsetAzimuth() {return sunsetAzimuth;}

    public void setSunsetAzimuth(double sunsetAzimuth) {this.sunsetAzimuth = sunsetAzimuth;}

    public double getSunriseAzimuth() {return sunriseAzimuth;}

    public void setSunriseAzimuth(double sunriseAzimuth) {this.sunriseAzimuth = sunriseAzimuth;}
}

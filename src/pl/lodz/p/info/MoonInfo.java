package pl.lodz.p.info;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;

/**
 * Created by kfleszar on 18.06.16.
 */
public class MoonInfo {

    /**
     * Dzień miesiąca synodycznego
     */
    private double moonAge;

    /**
     * Faza księżyca w procentach
     */
    private double illumination;

    /**
     * Czas wschodu księżyca
     */
    private AstroDateTime moonrise;

    /**
     * Czas zachodu księżyca
     */
    private AstroDateTime moonset;

    /**
     * Najbliższa pełnia
     */
    private AstroDateTime nextFullMoon;

    /**
     * Najbliższy nów
     */
    private AstroDateTime nextNewMoon;

    public MoonInfo (AstroCalculator.MoonInfo moonInfo) {
        this.moonAge = moonInfo.getAge();
        this.illumination = moonInfo.getIllumination();
        this.moonrise = moonInfo.getMoonrise();
        this.moonset = moonInfo.getMoonset();
        this.nextFullMoon = moonInfo.getNextFullMoon();
        this.nextNewMoon = moonInfo.getNextNewMoon();
    }

    public String getIlluminationAsPercent () {
        String illuminationAsPercent = Double.toString((Math.floor(illumination*100) / 100));
        illuminationAsPercent += "%";
        return illuminationAsPercent;
    }

    public int getRoundMoonDay() {
        int moonDay = (int) Math.round(moonAge);
        return moonDay + 1;
    }

    public String toString() {
        return "MoonInfo{" +
                "moonAge=" + moonAge +
                ", illumination=" + illumination +
                ", moonrise=" + moonrise +
                ", moonset=" + moonset +
                ", nextFullMoon=" + nextFullMoon +
                ", nextNewMoon=" + nextNewMoon +
                '}';
    }

    /**
     * --- GETTERS & SETTERS ---
     */

    public double getMoonAge() {return moonAge;}

    public void setMoonAge(double moonAge) {this.moonAge = moonAge;}

    public double getIllumination() {return illumination;}

    public void setIllumination(double illumination) {this.illumination = illumination;}

    public AstroDateTime getMoonrise() {return moonrise;}

    public void setMoonrise(AstroDateTime moonrise) {this.moonrise = moonrise;}

    public AstroDateTime getMoonset() {return moonset;}

    public void setMoonset(AstroDateTime moonset) {this.moonset = moonset;}

    public AstroDateTime getNextFullMoon() {return nextFullMoon;}

    public void setNextFullMoon(AstroDateTime nextFullMoon) {this.nextFullMoon = nextFullMoon;}

    public AstroDateTime getNextNewMoon() {return nextNewMoon;}

    public void setNextNewMoon(AstroDateTime nextNewMoon) {this.nextNewMoon = nextNewMoon;}
}

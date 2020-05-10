package thermo;

// import javax.annotation.PostConstruct;

// import org.springframework.stereotype.Service;

// @Service
public class Thermostat {
    private int currentTemp;
    private int setTemp;
    private boolean fan;

    // @PostConstruct
    // // Maybe we check the database here?
    // public void init() {
    //     this.currentTemp = 70;
    //     this.setTemp = 69;
    //     this.fan = true;
    // }

    public Thermostat(int ct, int st, boolean fan) {
        this.currentTemp = ct;
        this.setTemp = st;
        this.fan = fan;
    }

    public int getCurrentTemp() {
        return this.currentTemp;
    }

    public void setCurrentTemp(int ct) {
        this.currentTemp = ct;
    }

    public int getSetTemp() {
        return this.setTemp;
    }

    public void setSetTemp(int st) {
        this.setTemp = st;
    }

    public boolean getFan() {
        return this.fan;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }
}
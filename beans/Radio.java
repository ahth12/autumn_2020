import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class Radio {
    private String name;
    @Autowired
    private RadioStation[] radioStations = new RadioStation[0];
    private int i = 0;
    private int maxi = radioStations.length;

    public RadioStation[] getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(RadioStation[] radioStations) {
        this.radioStations = radioStations;
    }


    public void playSong(){
        this.radioStations[i].playSong();
    }
    public void switchStation(){
        if (i<= maxi){i++;}
        else{
            i = 0;
        }
    }


    public void setSongs(RadioStation[] radioStations) {
        this.radioStations =radioStations;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "name='" + name + '\'' +
                ", radioStations=" + Arrays.toString(radioStations) +
                ", i=" + i +
                ", maxi=" + maxi +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

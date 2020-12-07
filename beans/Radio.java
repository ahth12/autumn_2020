import java.util.Arrays;

public class Radio {
    private String name;
    private String[] songs = new String[]{"1st"};
    private int i = 0;
    private int maxi = songs.length;

    public Radio(String[] songs ) {
        this.songs = songs;
    }

    public Radio() {

    }

    public void playSong(){
        System.out.println("played" + songs[i]);
    }
    public void switchStation(){
        if (i<= maxi){i++;}
        else{
            i = 0;
        }
    }


    public void setSongs(String[] songs) {
        this.songs =songs;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
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

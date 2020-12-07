import java.util.Arrays;

public class RadioStation {
    private String name;
    private String[] songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "RadioStation{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}

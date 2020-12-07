public class Radio {
    public static String[] songs = new String[]{"1st song", "2 song", "3 song"};
    static int i = 0;
    static int maxi = songs.length;

    public Radio(String[] songs ) {
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


}

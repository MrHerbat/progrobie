public class Albums {
    String artist;
    String album;
    int songsNumber;
    int year;
    long downloadNumber;

    public Albums() {
    }

    @Override
    public String toString() {
        return "Albums{" +
                "artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", songsNumber=" + songsNumber +
                ", year=" + year +
                ", downloadNumber=" + downloadNumber +
                '}';
    }
}

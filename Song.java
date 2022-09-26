import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	private static final String INFO_DELIMITER = "; ";
	private static final String TIME_DELIMITER = ":";
	private static int IDX_TITLE = 0;
	private static int IDX_ARTIST = 1;
	private static int IDX_TIME = 2;
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	public Song(String info) {
		String[] data = info.split(INFO_DELIMITER);
		this.title = data[IDX_TITLE].trim();
		this.artist = data[IDX_ARTIST].trim();
		
		String[] time = data[IDX_TIME].split(TIME_DELIMITER);
		int[] timeData = new int[time.length];
		for (int i = 0; i < time.length; i++) {
			timeData[i] = Integer.parseInt(time[time.length - i - 1].trim());
		}
		this.time = timeData;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}
	
	public String toString() {
		String str = "";
		if (time.length == 1) {
			str = "" + time[0];
		}
		if (time.length == 2) {
			str = time[1] + TIME_DELIMITER + String.format("%02d", time[0]);
		}
		if (time.length == 3) {
			str = time[2] + TIME_DELIMITER + String.format("%02d",  time[1]) + TIME_DELIMITER + String.format("%02d", time[0]);
		}
		
		return title + INFO_DELIMITER + artist + INFO_DELIMITER + str;
	
	}
	
}

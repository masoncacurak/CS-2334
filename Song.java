
public class Song {

	private String title;
	private String artist;
	private int[] time = new int[2];
	private int[] copyOfTime;
	
	Song() {
		this.title = "noTitle";
		this.artist = "noName";
		this.time = time;
	}
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		copyOfTime = time.clone();
		this.time = time;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		time = copyOfTime.clone();
		return time;
	}
	
}

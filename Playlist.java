
public class Playlist {

	private Song[] songs;
	private int numSongs;
	private static final int MIN_CAPACITY = 3;
	
	public Playlist() {
		numSongs = 0;
		songs = new Song[MIN_CAPACITY];	
	}
	
	public Playlist(int capacity) {
		numSongs = 0;
		if (capacity < MIN_CAPACITY) {
			capacity = MIN_CAPACITY;
		}
		songs = new Song[capacity];
	}
	
	public int getCapacity() {
		return songs.length;
	}
	
	public int getNumSongs() {
		return this.numSongs;
	}
	
	public Song getSong(int index) {
		if (index < 0 || index >= numSongs) {
			return null;
		}
		else
		{
			return songs[index];
		}
	}
	
	public Song[] getSongs() {
		Song[] newSongsArray = new Song[numSongs];
		for (int i = 0; i < numSongs; ++i) {
			newSongsArray[i] = songs[i];
		}
		return newSongsArray;
	}
	
	public boolean addSong(Song song) {
		return addSong(numSongs, song);
	}
	
	public boolean addSong(int index, Song song) {
		if (numSongs >= songs.length || index < 0 || index > numSongs ||song == null) {
			return false;
		}
		else
		{
		for (int i = numSongs - 1; i >= index; i--) {
			songs[i + 1] = songs[i];
		}
			songs[index] = song;
			numSongs++;
			return true;
		}
	}
	
	public int addSongs(Playlist playlist) {
		int i = 0;
		
		if (playlist == null) {
			return 0;
		}
		else
		{
			while (numSongs < songs.length && i < playlist.numSongs) {
				songs[numSongs++] = playlist.songs[i++];
			}
		}
		return i;
	}
	
	public Song removeSong() {
		if (numSongs == 0) {
			return null;
		}
		else 
		{
			numSongs--;
			return songs[numSongs];
		}
	
	}
	
	public Song removeSong(int index) {
		if (numSongs == 0 || index >= numSongs) {
			return null;
		}
		else
		{
			Song removed = songs[index];
			for (int i = index; i < numSongs - 1; i++) {
				songs[i] = songs[i+1];
			}
			numSongs--;
			return removed;
		}
	}
}

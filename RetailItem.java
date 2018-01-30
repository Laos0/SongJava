
public class RetailItem {
	private String artist;
	private int length;
	
	public RetailItem(String artistName, int seconds){
		this.artist = artistName;
		this.length = seconds;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public int getLength(){
		return length;
	}
	
	public String toString(){
		return "Artist: " + artist + ", " + "Length: " + length;
	}
	

}

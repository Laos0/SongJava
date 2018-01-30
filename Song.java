
public class Song extends RetailItem {
	private String name;
	private int rating;
	
	public Song(String newName, int seconds, String artistName){
		super(artistName, seconds);
		name = newName;
		rating = 0;
		
	}
	
	public Song(String newName, int seconds, String artistName, int stars){
		super(artistName, seconds);
		name = newName;
		rating = stars;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRating(int stars){
		rating = stars;
	}
	
	public int getRating(){
		return rating;
	}

	public String toString() {
		return "Song: " + name + ", " + "Rating: " + rating;
	}
	
	

}

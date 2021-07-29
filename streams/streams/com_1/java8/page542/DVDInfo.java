package streams.com_1.java8.page542;

public class DVDInfo {
	private String title;
	private String genre;
	private String leadActor;
	public DVDInfo(String title, String genre, String leadActor) {
		super();
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	@Override
	public String toString() {
		return title + " / " + genre + " / " + leadActor;
	}
	
	
}

package Thirteen;

public class System1
{
	String movieName;
	String showTime;
	int pot;
	String businessInCrore;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getPot() {
		return pot;
	}
	public void setPot(int pot) {
		this.pot = pot;
	}
	public String getBusinessInCrore() {
		return businessInCrore;
	}
	public void setBusinessInCrore(String businessInCrore) {
		this.businessInCrore = businessInCrore;
	}
	
	public void show() {
		System.out.println("movie name = "+movieName);
		System.out.println("show time = "+showTime);
		System.out.println("Price of tikit = "+pot);
		System.out.println("Business score is = "+businessInCrore);
		
	}
	
	
	

}

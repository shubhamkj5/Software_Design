package assignment;
class Time{
 	private String hour,minute;
 	public Time(String h,String m){
 		hour=h; minute=m;}
 	public String toString(){
 		return " "+hour+":"+minute;
 	}
 	public void reset(String h,String m){
 		hour=h; minute=m;}
 	}
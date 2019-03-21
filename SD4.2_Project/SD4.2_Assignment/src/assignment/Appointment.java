package assignment;


class Appointment extends Person{
	
	private Time time;
	private Person aperson;
	private Date date;
	private String room;
	int refno;
	Appointment left;
	Appointment right;
	
	public Appointment(int Ref,String aname,String acontact,String name,String contact,String h, String m,String d,String mo, String y,String room,Appointment l,Appointment r){
		super(aname,acontact);
		this.refno=Ref;
		aperson=new Person(name,contact);
		time=new Time(h,m);
		date=new Date(d,mo,y);
		this.room=room;
		this.left=l;
		this.right=r;
	}

	public int getRefno() {
		return refno;
		
	}
	public String getTime(){return time.toString();}
	
	public String getDate() {
		return date.toString();
	}
	
	public String getaname() {
		return aperson.getName();
	}
	public String getacontact() {
		return aperson.getContact();
	}
	
	public void resetAppointment(String h,String m,String d,String mo,String y){
		time.reset(h,m);
		date.reset(d, mo, y);
	}
	public void print(){
		System.out.print("Appointment Details\n\nRef #no:"+refno+"\nName: "+super.getName()+" Contact: " +super.getContact()+ "\n is meeting \nName: "+getaname()+" Contact: " +getacontact()+ "\nAt\n"+getDate()+" "+getTime()+"\nRoom No: "+this.getRoom()+"\n\n");
	}

	public String getRoom() {
		// TODO Auto-generated method stub
		return this.room;
	}
}
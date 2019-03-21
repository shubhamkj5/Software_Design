package assignment;
interface HtabIterator
{
	boolean hasNext();
	Object next();
}

interface Container
{
	HtabIterator iterator();
}




class HashTable implements Container,HtabIterator{

	private static HashTable  single;
	private static boolean created = false;
	private int index;


	public int hash(int id){ return id%20;}

	private Appointmenthash[] head=new Appointmenthash[20];

	public  HashTable(){
		for(int i=0;i<20;i++)head[i]=null;
		created=true;
	}

	public  void insert(int k, String nm, String acontact,String name,String contact,String h,String m,String d,String mo,String y,String room)
	{      Appointmenthash temp =new Appointmenthash(k,nm,acontact,name,contact,h,m,d,mo,y,room);
	int index=hash(k);
	temp.next=head[index];
	head[index]=temp;}


	public  Appointmenthash search(int k)
	{     
		int index=hash(k);
		Appointmenthash temp=head[index];	 
		boolean found=false;
		while(temp!=null&&found==false) {
			if (temp.refno==k){found=true; break;}
			temp=temp.next;
		}
		return temp;}

	public static HashTable getInstance(){
		if (!created){
			single=new HashTable();}
		return single;
	}

	public HtabIterator iterator(){
		return new HashTable();
	}

	public boolean hasNext(){
		return index<head.length;
	}
	public Object next(){ 
		Appointmenthash res=head[index++];
		return res;
	}   


	public static void main(String[] args) {
		HashTable htable=new HashTable();

		htable.insert(12345678,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345679,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345680,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345681,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		
        HtabIterator value = htable.iterator();
        while(value.hasNext()){
            System.out.println(" :"+value.next());
            }     
    }

	}




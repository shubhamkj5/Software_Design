package polymorphism.shapePrint;
 class Shape{
        protected int length;
        public Shape(int l){length=l;}
        public void draw(){}
   }	

 class VertLine extends Shape{

	public VertLine(int l) {
		// TODO Auto-generated constructor stub
		super(l);
	}
	 public void draw(){
		 for(int i=0;i<this.length;i++) {
		    System.out.println("*");
		 }
	 }
	 
 }
 class HorzLine extends Shape{

	public HorzLine(int l) {
		// TODO Auto-generated constructor stub
		super(l);
	}
	 public void draw(){
		 for(int i=0;i<this.length;i++) {
			    System.out.print("*");
		 	}
	 }
	 
 }
 class DiagonalLine extends Shape{

		public DiagonalLine(int l) {
			// TODO Auto-generated constructor stub
			super(l);
		}
		 public void draw(){
			for(int i=0;i<length;i++) {
			 for(int j=0;j<i;j++) {
				    System.out.print(" ");			 
				 }
			 System.out.print("*\n");		
			}
		 }
		 
	 }   
 class Square extends Shape{

		public Square(int l) {
			// TODO Auto-generated constructor stub
			super(l);
		}
		 public void draw(){
			for(int i=0;i<length;i++) {
			 for(int j=1;j<length;j++) {
				    System.out.print("* ");			 
				 }
			 System.out.print("*\n");		
			}
		 }
		 
	 }     
 class Rectangle extends Shape{
	 	private int height;
		public Rectangle(int l,int h) {
			// TODO Auto-generated constructor stub
			super(l);
			this.height=h;
		}
		 public void draw(){
			for(int i=0;i<height;i++) {
			 for(int j=1;j<length;j++) {
				    System.out.print("* ");			 
				 }
			 System.out.print("*\n");		
			}
		 }
		 
	 }    

public class DrawTest {
	public static void main(String[] args)
	{
	     Shape []s=new Shape [5];
         s[0]=new VertLine(5);
         s[1]=new HorzLine(6);  
         s[2]=new DiagonalLine(6);   
         s[3]=new Square(5);  
         s[4]=new Rectangle(5,3);  
         for(int j=0;j<5;j++)
         {
                System.out.println("\n\n");
                s[j].draw();
           }
}    }

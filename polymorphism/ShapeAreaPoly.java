package polymorphism;
class Shape
    {
        protected int width;
        public Shape(int w) { width = w; }
		public int calculateArea() {
			// TODO Auto-generated method stub
			return 0;
		}
        
    }
class Square extends Shape{

	public Square(int w) {
		// TODO Auto-generated constructor stub
		super(w);
	}
	public int calculateArea() {
		// TODO Auto-generated method stub
		return width*width;
	}
	
}
class Rectangle extends Shape{

	private int length;

	public Rectangle(int w, int l) {
		super(w);
		this.length=l;
	}
	public int calculateArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
}
public class ShapeAreaPoly
{
  public static void main(String[] args)
  {
     Shape []s = new Shape[3];
     s[0] = new Square(5);
     s[1] = new Rectangle(2, 4);
     s[2] = new Shape(6);
     for (int i = 0; i < 3; i++)
     {
         System.out.println("Area of shape "+(i+1)+" :" +  s[i].calculateArea());
     }
  }
}

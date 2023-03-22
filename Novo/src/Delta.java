
public class Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 12;
		int c = -13;
		int e = 2 * a;
		
		int d  = (int) Math.pow(b, 2);
		int d1 =	 4 * a * c;
		int d2 = (d - d1);
		int d3 = d2;
		System.out.println(d3);
		
		double x =  -b + Math.sqrt(d3);
		
		double x1 = x / e;
		System.out.println(x1);
		//double x2 = x1 
		
		double y = -b - Math.sqrt(d3);
		
		double y1 = y / e;
		System.out.println(y1);
		//double y2 = y1 
		
		//System.out.println(x2+"-------"+y2);
		
		//double r = Math.sqrt(d2);
		
		//int x = (int) Math.pow(3, 3);
		
		//System.out.println(x);
		
		/*(ax2 + bx + c = 0)


a = 1, b = 12 e c = -13


X= -12 +- (^ 196)
-------------
     2 x 1

X = -12 + 14
--------------- =  2/2 = 1
      2 

X = -12 - 14
--------------- =  -26/2 = -13
      2 

x = 1-13

x = 12


^ = b2 - 4ac

^ = 144 - 4 x 1 x -13
^ = 144 - (-52)*/
				
		
	}

}

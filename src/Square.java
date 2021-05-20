public class Square {
	public static boolean isSquare(int n) {
		if(Math.sqrt(n) % 1 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		System.out.print(Square.isSquare(4));
		
	}
}
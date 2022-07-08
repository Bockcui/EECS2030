public class Math {
	
	public static double PI = 3.141592653589793;
	
	public static double sin(double angle)
	{
		if(angle >= 0)
			angle = angle % (2 * PI);
		else
			angle = 2 * PI - (angle % (2 * PI));
		
		double sum = 0.0;
		double n = 1.0;
		double term = angle;
		
		while(term != 0)
		{
			sum += term;
			
			n += 2.0;
			term = -1.0 * term * angle * angle / n / (n - 1.0);
		}
		
		return sum;
	}
}
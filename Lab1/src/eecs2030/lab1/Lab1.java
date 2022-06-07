/*
 * First Name: Cheng Tian
 * Last Name : Cui
 * ID #		 : 218082305
 * Course    : EECS2030
 * Section   : A
 * Lab       : 2
 */

package eecs2030.lab1;

/**
 * Short methods reviewing fundamental Java concepts covered in EECS1021,
 * EECS1022, or EECS1720
 * 
 * @author EECS2030 SU 2021-2022
 *
 */
public class Lab1 {

	/**
	 * The course name for EECS2030.
	 */
	public static final String COURSE_NAME = "EECS 2030: Advanced Object Oriented Programming";

	private Lab1() {
		// empty by design
	}

	/**
	 * Returns the maximum (most positive) value that an <code>int</code> can
	 * represent.
	 * 
	 * @return the maximum (most positive) value that an int can represent
	 */
	public static int maxInt() {
		//Integer.MAX_VALUE is the maximum value of the Integer class
		return Integer.MAX_VALUE;
	}

	/**
	 * Returns the minimum positive value greater than zero that a
	 * <code>double</code> can represent.
	 * 
	 * @return the minimum positive value greater than zero that a double can
	 *         represent
	 */
	public static double minPositiveDouble() {
		//Integer.MIN_NORMAL is the smallest positive value of the Double class
		return Double.MIN_NORMAL;
	}

	/**
	 * Removes the last three digits of a positive integer base-10 number. If
	 * <code>n</code> is less than <code>1000</code> then the value of
	 * <code>0</code> is returned.
	 * 
	 * 
	 * @param n
	 *            a positive integer
	 * @return the integer produced by removing the last three digits of n, or 0
	 *         if n is less than 1000
	 */
	public static int removeLastThreeDigits(int n) {
		//Integer division by 1000 would truncate the last 3 digits
		return n/1000;
	}

	/**
	 * Returns the last three digits of a positive integer base-10 number. If the
	 * third last digit is a <code>0</code> then only the last two digits are
	 * returned, etc. If <code>n</code> is less than <code>1000</code> then the value
	 * of <code>n</code> is returned.
	 * 
	 * @param n
	 *            a positive integer
	 * @return the last three digits of n, or the last one or two digits of n if the second
	 *         last or third last digits are 0
	 */
	public static int lastThreeDigits(int n) {
		//Modulo 1000 would yield the remainder of division by 1000, which is the last 3 digits
		return n%1000;
	}

	/**
	 * Compute the average of three values as a <code>double</code> value.
	 * 
	 * @param a
	 *            a value
	 * @param b
	 *            a second value
	 * @param b
	 *            a third value
	 * @return the average of the three values
	 */
	public static double avg(int a, int b, int c) {
		//Returning 0.0 + ... would result in a double being returned. This makes the code relatively compact.
		return (0.0 + a + b + c) / 3.0;
	}

	/**
	 * Returns the pressure altitude in ft based on pressure in mbar 
	 * 
	 * <p>
	 * 
	 * @param pressure
	 *            the pressure in millibars
	 * @return pressure altitude in feet
	 * @see <a href="https://en.wikipedia.org/wiki/Pressure_altitude">
	 *      Wikipedia article on Pressure altitude</a>
	 */
	public static double pressureAltitude(double pressure) {
		final double c1 = 145366.45, //Constant 1
					 c2 = 1.0, //Constant 2
					 d1 = 1013.25, //Denominator 1
					 e1 = 0.190284; //Exponent 1
		//Plug constants into return statement.
		return c1 * (c2 - Math.pow(pressure / d1, e1));
	}

	/**
	 * Determine if an integer <code>x</code> is even.
	 * 
	 * @param x
	 *            a value
	 * @return true if x is even and false otherwise
	 */
	public static boolean isEven(int x) {
		//Modulo 2 = 0 for all even number, simply check for this fact
		return x % 2 == 0;
	}

	/**
	 * Determine if the coordinates <code>(x, y)</code> describe a unit vector 
	 * 
	 * @param x
	 *            the x-coordinate of a vector
	 * @param y
	 *            the y-coordinate of a vector
	 * @return true if (x, y) is a unit vector
	 *         and false otherwise
	 */
	public static boolean isUnitVector(double x, double y) {
		//Magnitude of unit vector v = (x, y) is sqrt(x^2 + y^2) = 1
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) == 1;
	}

	/**
     * Enrolls a student with a specified SID
     * 
     * @param studentNumber a student number
     * @return true 
     * @throws BadSIDException 
     *           if x is not a 9-digit number.
     */
	public static boolean enrolStudent(int studentNumber) {
		//Student ID must be 9 digits. Otherwise, throw BADSIDException.
		if (String.valueOf(studentNumber).length() == 9) //Converts input int to String and checks length if it is 9
		{
			return true;
		}
		else
		{
			throw new BadSIDException();
		}
	}

	
	/**
	 * Returns the course name as the string.
	 * 
	 * @return the string equal to Lab1.COURSE_NAME
	 */
	public static String getCourseName() {
		//Return static field of Lab1 class
		return Lab1.COURSE_NAME;
	}

	/**
	 * Returns the character located in the middle of the string. If
	 * <code>s</code> has an even number of characters then the middle character
	 * is taken to be the last character in the first half of the string
	 * (i.e., the middle character of the string <code>"abcd"</code> is
	 * <code>'b'</code>.
	 * 
	 * @param s
	 *            a string of length 1 or greater
	 * @return the middle character of s
	 * @throws IllegalArgumentException
	 *             if s is empty
	 */
	public static char middleChar(String s) {
		if(s.length() < 1) //String must be 1 or more characters. Throw exception if less than 1.
		{
			throw new IllegalArgumentException();
		}
		else
		{
			int l = s.length();
			return l % 2 == 0 ? s.charAt(l / 2 - 1) : s.charAt(l / 2); //Checks if length is even or odd. Then return appropriate character.
		}
	}

	/**
	 * Returns the string formed by alternating the case of the characters in
	 * the specified string. The first character in the returned string is in
	 * uppercase, the second character is in lowercase, the third character is
	 * in uppercase, the fourth character is in lowercase, and so on.
	 * Examples:
	 * 
	 * <ul>
	 * <li><code>alternatingCaps("a")</code> returns <code>"A"</code>
	 * <li><code>alternatingCaps("ab")</code> returns <code>"Ab"</code>
	 * <li><code>alternatingCaps("abc")</code> returns <code>"AbC"</code>
	 * <li><code>alternatingCaps("XYZ")</code> returns <code>"XyZ"</code>
	 * <li><code>alternatingCaps("Toronto")</code> returns <code>"ToRoNto"</code>
	 * <li><code>alternatingCaps("eecs2030")</code> returns <code>"EeCs2030"</code>
	 * </ul>
	 * 
	 * <p>
	 * The conversion of characters to lower or uppercase is identical to 
	 * that performed by the methods <code>Character.toLowerCase(int)</code>
	 * and <code>Character.toLowerCase(int)</code>
	 * 
	 * @param s
	 *            a string
	 * @return the string formed by alternating the case of the characters in s
	 */
	public static String alternatingCaps(String s) {
		StringBuilder t = new StringBuilder(); //Since strings are immutable, use StringBuilder, which is immutable, instead
		for(int i = 0; i < s.length(); i++) //Loop from s[0] -> end of s
		{
			if(i % 2 == 0) //Check if index of current char is even or odd
			{
				t.append(Character.toUpperCase(s.charAt(i))); //Characters at 0, 2, 4, ... are all upper case
			}
			else
			{
				t.append(Character.toLowerCase(s.charAt(i))); //Characters at 1, 3, 5, ... are all lower case
			}
		}
		
		return t.toString(); //Build string and return
	}

}

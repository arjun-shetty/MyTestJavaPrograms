import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author arjun
 *
 */
public class TestSpecialCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("ar@10.2.3.4.5.2.4");
		boolean b = m.matches();
		
		if(b)
		{
			System.out.println("yes it is an email address");
		}

	}

}

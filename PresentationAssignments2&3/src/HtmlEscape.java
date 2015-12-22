
/**
 * @class  HtmlEscapeTest
 * @author Pulkit
 * This class uses the StringEscapeUtils of commons api.
 */

import org.apache.commons.lang.StringEscapeUtils;

public class HtmlEscape {

	/**
	 * This is the main function.
	 * @param{String[]} args
	 * @throws{Exception} Exception
	 */
	
	public static void main(String[] args) throws Exception {

		// Using the StringEscapeUtils function.
		
		String results = StringEscapeUtils.escapeHtml("<script>alert('Hiii');</script>");
		System.out.println(results);

	}

}
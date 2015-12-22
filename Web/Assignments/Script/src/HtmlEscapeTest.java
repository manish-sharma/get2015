
import org.apache.commons.lang.StringEscapeUtils;

/**
 * @author Arushi
 * Class to encode html codes
 *
 */
public class HtmlEscapeTest {

	public static void main(String[] args) throws Exception {

		String results = StringEscapeUtils.escapeHtml("<script>alert('Hello! are you there');</script>");
		System.out.println(results);

	}

}
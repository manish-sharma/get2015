
import org.apache.commons.lang.StringEscapeUtils;

public class HtmlEscapeTest {

	public static void main(String[] args) throws Exception {

		String results = StringEscapeUtils.escapeHtml("<script>alert('Hiii all, how are you??');</script>");
		System.out.println(results);

	}

}
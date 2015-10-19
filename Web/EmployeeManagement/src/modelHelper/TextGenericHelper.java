package modelHelper;

import java.util.ArrayList;
import java.util.List;

import model.TextGeneric;

/**
 * @author Anjita
 * class TextGenericHelper to add or get text heading for any page.
 */
public class TextGenericHelper {
	private static List<TextGeneric> contentList = new ArrayList<TextGeneric>();

	/**
	 * add content to list
	 * @param textGeneric : store content of particular page
	 */
	public static void addContent(TextGeneric textGeneric) {
		contentList.add(textGeneric);
	}

	/**
	 * get Content List
	 * @return : list of TextGeneric
	 */
	public static List<TextGeneric> getContentList() {
		return contentList;
	}

	/**
	 * set Content List
	 * @param contentList : list of TextGeneric
	 */
	public static void setContentList(List<TextGeneric> contentList) {
		TextGenericHelper.contentList = contentList;
	}
}

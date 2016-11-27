package modelHelper;

import java.util.ArrayList;
import java.util.List;

import model.TextGeneric;

public class TextGenericHelper {

	private static List<TextGeneric> contentList = new ArrayList<TextGeneric>();

	public static void addContent(TextGeneric textGeneric) {
		contentList.add(textGeneric);
	}

	public static List<TextGeneric> getContentList() {
		return contentList;
	}

	public static void setContentList(List<TextGeneric> contentList) {
		TextGenericHelper.contentList = contentList;
	}
}

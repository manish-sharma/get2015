package modelHelper;

import java.util.List;

import model.TextGeneric;

public class PageHeading {

	public static String heading(String heading)
	{   PageSelector pageSelector = new PageSelector();		
		List<TextGeneric> list = pageSelector.selector(heading);
		heading ="";
		for(TextGeneric t : list) {
			heading += t.getContent();
			
		}
	list.clear();
	return heading;
	}
}

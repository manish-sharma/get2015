package modelHelper;

import java.util.List;

import model.TextGeneric;

public class PageSelector {

	public List<TextGeneric> selector(String pageName) {
		String value = "Metacube is a Software Engineering Services company with experience in"
				+ " developing enterprise applications for a wide spectrum of domains including"
				+ " global trade management, supply chain analytics, manufacturing analytics, business"
				+ " continuity planning, CRM, content management and eCommerce. These applications have"
				+ " been developed on a variety of technology platforms.";
		TextGeneric textGeneric;
		switch (pageName) {
		case "Landing":
			textGeneric = new TextGeneric();
			textGeneric.setContent(value);
			TextGenericHelper.addContent(textGeneric);
			break;

		case "EmployeeList":
			textGeneric = new TextGeneric();
			textGeneric.setContent("Employee List Page");
			TextGenericHelper.addContent(textGeneric);
			break;

		case "EmployeeDetails":
			textGeneric = new TextGeneric();
			textGeneric.setContent("Employee Details Page");
			TextGenericHelper.addContent(textGeneric);
			break;

		case "EmployeeRegistration":
			textGeneric = new TextGeneric();
			textGeneric.setContent("Employee Registration Page");
			TextGenericHelper.addContent(textGeneric);
			break;

		case "Error":
			textGeneric = new TextGeneric();
			textGeneric.setContent("Someting Wrong happen");
			TextGenericHelper.addContent(textGeneric);
			break;

		}

		return TextGenericHelper.getContentList();

	}
}

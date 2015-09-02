package com.string.uniqueCharacters;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindNoOfUniqueCharactersInString {
	private Map<String, Set<Character>> StringAnduniqueCharacters=new HashMap<String, Set<Character>>();;
	
	FindNoOfUniqueCharactersInString(){
		// uniqueCharactersOfString
	}

	public Set<Character> findNoOfUniqueCharacters(String string) {
		if(StringAnduniqueCharacters.get(string)==null){
		Set<Character> uniqueCharactersOfString=new LinkedHashSet<Character>();
		for(int i=0;i<string.length();i++){
		    if(string.charAt(i)!=' '){
			uniqueCharactersOfString.add(string.charAt(i));
		    }
		}
		StringAnduniqueCharacters.put(string, uniqueCharactersOfString);
		System.out.println("Result for "+string+" is added into Cache\n");
		return StringAnduniqueCharacters.get(string);
	}
		else{
			System.out.println("Result form cache\n");
			return StringAnduniqueCharacters.get(string);
		}
	}
}

package com.Script;

import org.apache.commons.lang.StringEscapeUtils;

public class ScriptEncrypt 
{
    public static void main( String[] args )
    {
    	String output= StringEscapeUtils.escapeHtml("<script>   alert('Hi Script');   </script>");
    	System.out.println(output);
    }
}

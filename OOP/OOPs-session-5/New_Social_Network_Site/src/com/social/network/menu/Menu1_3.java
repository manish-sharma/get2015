/*Menu1_3 Class
 * this class will add nested menu Items in list and then 
 * display them by calling displayOperationMenu1_3() method in ActionableMenu1_3 Class
 */
package com.social.network.menu;

import java.util.ArrayList;

public class Menu1_3 {
	private ArrayList<MenuItem1_3> items=new ArrayList<MenuItem1_3>();
	/*
	 * this method will add nested menu items in the list
	 */
    public void addMenuItem1_3(MenuItem1_3 item){
 	   items.add(item);
    }
    /*
	 * this method will display the nested Menu by calling the
	 * displayOperationMenu1_3() method in ActionableMenu1_3 Class
	 */
 public void displayOperationMenu1_3(){
 	   for(MenuItem1_3 i:items){
 		   i.displayOperationMenu1_3();
 	   }}
}

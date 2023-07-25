package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rr {
		public static void main(String args[]){  
			ArrayList<String> list1=new ArrayList<String>();  
			list1.add("aRavi");
			list1.add("hijay");  
			list1.add("cpavi");  
			list1.add("zAjay");  
			
			
			
			ArrayList<String> list2=new ArrayList<String>();  
			list2.add("mbavi");
			list2.add("fijay");  
			list2.add("bbavi");  
			list2.add("gjay"); 
			
			list1.addAll(list2);
			
			System.out.println("before");
			System.out.println(list1);
			System.out.println("afterre");
			Collections.sort(list1);
			System.out.println(list1);
			System.out.println("reverse");
			Collections.reverse(list1);
			System.out.println(list1);
			System.out.println("-----------------------");
			for (Object a : list1) {
				System.out.println(a);
			}
			System.out.println("reverse");
			for(int i=list1.size()-1;i>=0;i--)
			{
				System.out.println(list1.get(i));
			}
			
	}

}

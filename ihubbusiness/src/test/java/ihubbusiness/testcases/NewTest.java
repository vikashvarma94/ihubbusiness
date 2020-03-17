package ihubbusiness.testcases;

import org.testng.annotations.Test;

public class NewTest {
	//  static WebDriver   driver;
	public static String s = "vIk as test";
@Test
public void a() {

	  char[] a = s.toCharArray();
	  for(int i=a.length-1;i>=0;i--) {
		  System.out.println(a[i]);
	  }
  }



@Test
public void b() {

String[] split = s.split(" ");
String result = "" ;
for (int i = split.length - 1; i >= 0; i--) {
  result += (split[i] + " ");
}
System.out.println(result);
}


@Test
public void c() {
	
	StringBuilder st = new StringBuilder();
	st.append(s);
	
	System.out.println(st.reverse());	
}}
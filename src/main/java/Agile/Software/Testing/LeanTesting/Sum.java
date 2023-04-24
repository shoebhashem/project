package Agile.Software.Testing.LeanTesting;

public class Sum {
	
	int start;
	int end;
	  public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		  }
		

}

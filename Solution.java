import java.util.* ;
import java.io.*; 
public class Solution {
	public static int stringMania(int n, int m, String str1, String str2) {
		// Write your code here.
		int k=str1.compareTo(str2);
		if(k==0){
			return 0;
		}
		if(k>0){
			return 1;
		}
		return -1;
	}
}

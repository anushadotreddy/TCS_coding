package com.dot.testing;

/**
 * 
 * class to get smallest and largest words.
 * 
 * @author sri anusha
 *
 */
public class TCS {
	
	public static void main(String[] s) {
		
		TCS t = new TCS();
		String sValue = t.getSmallestAndLargest("How are you doing");
		System.out.println(sValue.split(",")[0]);
		System.out.println(sValue.split(",")[1]);
		
		
		sValue = t.getSmallestAndLargestOpt("How are you doing");
		System.out.println(sValue.split(",")[0]);
		System.out.println(sValue.split(",")[1]);
		System.out.println(sValue.split(",")[2]);
		System.out.println(sValue.split(",")[3]);
		
	}
	
	
	/**
	 * unoptimized version of retrieving smallest and largest words.
	 * @param sentence
	 * @return
	 */
	public String getSmallestAndLargest(String sentence) {
		
		int smallest = 0;
		String small = "";
		int largest = 0;
		String large = "";
		for(String s : sentence.split(" ")) {
			if(smallest == 0 || s.length() < smallest) {
				smallest = s.length();
				small = s;
			}
			if(largest == 0 || s.length() > largest) {
				largest = s.length();
				large = s;
			}
		}
		return small+","+large;
	}


	/**
	 * optimized version of retrieving smallest and largest words.
	 * @param sentence
	 * @return
	 */
	public String getSmallestAndLargestOpt(String sentence) {
		
		int smallest = 0;
		String small = "";
		int largest = 0;
		String large = "";
		int begInd = 0;
		int smallIndex = 0;
		int largeIndex = 0;
		for(int i = 0 ; i< sentence.length() ; i++) {
			String word = "";
			if(sentence.charAt(i) == ' ' || i == sentence.length()-1) {
				word = sentence.substring(begInd,i);
				if(i == sentence.length()-1) {
					word = sentence.substring(begInd,i+1);
				}
				begInd = i+1;
				if(smallest == 0 || word.length() < smallest) {
					smallest = word.length();
					small = word;
					smallIndex = i;
				}
				if(largest == 0 || word.length() > largest) {
					largest = word.length();
					large = word;
					largeIndex = i;
				}
				
			}
		}
		return small+","+large+","+smallIndex+","+largeIndex;
	}

}

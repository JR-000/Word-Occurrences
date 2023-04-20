package CEN3024;

import java.io.*;
import java.util.*;

/**
 * @author John Ruzzano
 *	This class uses the text file "Raven", scans it in and begins to
 *	count each word in the file adding plus one every time that word 
 *	appears.
 *	@version 1.0
 */
public class Text_Analyzer {
	
	/**
	 * 
	 * @param args Main method
	 * @throws FileNotFoundException Gives error if file is not found.
	 */

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File poem = new File("src/Raven.txt");
		Scanner readMe = new Scanner(poem);
		
		Map<String,Integer> wordBank = new HashMap<String,Integer>();
		while(readMe.hasNext()) {
			String word = readMe.next();
			if(wordBank.containsKey(word)==false)
				wordBank.put(word,1);
			else{
				int count = (int)(wordBank.get(word));
				wordBank.remove(word);
				wordBank.put(word, count + 1);
			}
		}
			
		Set<Map.Entry<String, Integer>> set = wordBank.entrySet();
		List<Map.Entry<String,Integer>>sortedList = new ArrayList<Map.Entry<
				String,Integer>>(set);
		Collections.sort(sortedList,new Comparator<Map.Entry<String,Integer>>()
		{
			public int compare(Map.Entry<String,Integer>a,Map.Entry<String,Integer>b) {
		
		return (b.getValue()).compareTo(a.getValue());
			}
		});
	for(Map.Entry<String,Integer>i:sortedList) {
		System.out.println(i.getKey()+"->"+i.getValue());
	}
}
/**
 * This method allows the test to run.
 * @param testFile used in Text_Analyzer test
 * @return Amount of times a word appears in the test
 */
	public static String getText_Analyzer(String testFile) {
		// TODO Auto-generated method stub
		return null;
	}
}

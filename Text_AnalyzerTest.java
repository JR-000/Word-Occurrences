package CEN3024;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Text_AnalyzerTest {
/**
 * Tests the Text_analyzer class using Junit and by
 * using a words entered a different amount of times
 * to see if the code works.
 */
	@Test
	public void testText_Analyzer() {
		String testFile = "test.txt";
		String expectedOutput = "\nJeter\t2\nRodriguez\t1\nPiazza\t1\nHernandez\t1\nSchmidt\t1\n";
		
		String actualOutput = Text_Analyzer.getText_Analyzer(testFile);
		assertEquals(expectedOutput, actualOutput);
	}

}

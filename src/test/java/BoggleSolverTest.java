import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.princeton.cs.algs4.In;

/**
 * 
 */

/**
 * @author <your name here>
 *
 */
public class BoggleSolverTest {
  

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    
  }

  /**
   * Test method for {@link BoggleSolver#BoggleSolver(java.lang.String[])}.
   */
  @Test
  public void testBoggleSolver() {
    //test IllegalArgumentException if passed in null dictionary
    fail("Not yet implemented"); // TODO
  }

  /**
   * Test method for {@link BoggleSolver#getAllValidWords(BoggleBoard)}.
   */
  @Test
  public void testGetAllValidWords() {
    In input = new In("boggle-test-files/dictionary-yawl.txt");
    String[] dictionary = input.readAllStrings();
    BoggleSolver solver = new BoggleSolver(dictionary);
    ArrayList<String> expectedValidWords = new ArrayList<String>();
    expectedValidWords.add("NTH");
    expectedValidWords.add("PHT");
    for (String actualWord: solver.getAllValidWords(new BoggleBoard("boggle-test-files/board-points2"))) {
      assertTrue(actualWord + " is not in the expected list", expectedValidWords.contains(actualWord));
    }
  }
  
  //TODO: create testGetAllValidWords for your dictionaries
  // one for horizontal, one for vertical, one for diagonal
  // one for combination (i.e. a word that is formed by going horizontal, then vertical, then diagonal)

  /**
   * Test method for {@link BoggleSolver#scoreOf(java.lang.String)}.
   */
  @Test
  public void testScoreOf() {
    In input = new In("boggle-test-files/dictionary-yawl.txt");
    String[] dictionary = input.readAllStrings();
    BoggleSolver solver = new BoggleSolver(dictionary);
    assertEquals(1, solver.scoreOf("NTH"));
    assertEquals(1, solver.scoreOf("PHT"));
  }
  
  // TODO: create test cases that goes through all board-points boards 
  // and checks that your boggle solver gets that score using
  // dictionary-yawl (Look at PercolatiionTest for how to get started)

}

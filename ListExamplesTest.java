import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListExamplesTest {
    @Test
    public void testFilter() {
        List<String> list = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();

        ArrayList<String> correctWords = new ArrayList<String>();
        correctWords.add("good");
        correctWords.add("still good");
        ListExamples sc = new ListExamples(correctWords);
        list.clear();
        expected.clear();

        list.add("");
        list.add("bad");
        list.add("good");
        list.add("good");
        list.add("still good");
        expected.add("good");
        expected.add("good");
        expected.add("still good");

        assertEquals(expected, ListExamples.filter(list, sc));
    }
    
    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();

        list1.add("airplane");
        list1.add("bus");
        list1.add("car");
        list2.add("apple");
        list2.add("banana");
        list2.add("carrot");

        List<String> output = ListExamples.merge(list1, list2);

        assertEquals(expected, output);

    }
    

    
}

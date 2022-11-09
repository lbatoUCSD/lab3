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
    
    

    
}

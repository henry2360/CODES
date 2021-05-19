package Tdd;


    import chapterFourteen.ComparingIfStringsAreEqual;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ComparingIfStringsAreEqualTest {
        ComparingIfStringsAreEqual comparingIfStringsAreEqual;
        @BeforeEach
        void setUp() {
            comparingIfStringsAreEqual=new ComparingIfStringsAreEqual();
        }

        @AfterEach
        void tearDown() {
            comparingIfStringsAreEqual=null;
        }
        @Test
        void methodCanBeAbleToCollectUserInput(){
            assertEquals("kingsley",comparingIfStringsAreEqual.getUserInput("kingsley","kingsley"));
        }

}

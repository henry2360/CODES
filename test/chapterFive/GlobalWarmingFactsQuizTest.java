package chapterFive;

import chapterFive.GlobalWarmingFactsQuiz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalWarmingFactsQuizTest {
    GlobalWarmingFactsQuiz globalWarmingFactsQuiz;

    @BeforeEach
    void setUp() {
        globalWarmingFactsQuiz =new GlobalWarmingFactsQuiz();
    }

    @AfterEach
    void tearDown() {
        globalWarmingFactsQuiz=null;

    }
    @Test
    void setGlobalWarmingFactsQuizMethodTest(){
        //  assertEquals("A",globalWarmingFactsQuiz.askQuestions(1));
    }

    @Test
    void globalWarmingFactsQuizCheckForPerformance(){
        assertEquals("Excellent",GlobalWarmingFactsQuiz.score(5));
    }


}
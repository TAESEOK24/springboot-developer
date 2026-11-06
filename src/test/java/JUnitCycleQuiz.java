import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {
    @BeforeEach
    public void beforeEach(){
        System.out.println("hello!");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Bye!");
    }

    @Test
    public void junitQuiz3(){
        System.out.println("This is the first test");
    }
    @Test
    public void junitQuiz4(){
        System.out.println("This is the second test");
    }
}

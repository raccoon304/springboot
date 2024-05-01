import org.junit.jupiter.api.*;

public class JunitCycleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("@Before All");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@Before Each");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("@After All");
    }
    @AfterEach
    public void AfterEach(){
        System.out.println("@After Each");
    }
}

import member.Member;
import org.junit.*;

public class PlatformTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: start!");
    }

    @After
    public void after(){
        System.out.println("Test case: finished.");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite of platform: start!\n[connecting with database of platform]");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite of platform: end.");
    }

    @Test
    public void testCaseMemberName(){
        // Given
        Member member = new Member("Adam", 101);
        // When
        String result = member.getMemberName();
        // Then
        Assert.assertEquals("Adam", result);
    }

    @Test
    public void testCaseMembersNumber(){
        // Given
        Member member = new Member("Adam", 101);
        // When
        int result = member.getMemberNumber();
        // Then
        Assert.assertEquals(101, result);

    }
}

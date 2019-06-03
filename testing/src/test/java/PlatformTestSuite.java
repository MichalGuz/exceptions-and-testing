import Member.Member;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlatformTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: start!");
    }

    @After
    public void after(){
        System.out.println("Test case: finished.");
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

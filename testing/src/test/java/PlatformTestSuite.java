import Member.Member;
import org.junit.Assert;
import org.junit.Test;

public class PlatformTestSuite {
    @Test
    public void testCaseMemberName(){
        // Given
        Member member = new Member("Adam", 101);
        // When
        String result = member.getMemberName();
        // Then
        Assert
    }
}

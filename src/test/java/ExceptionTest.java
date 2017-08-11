import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class ExceptionTest {
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }
}

import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class GroupTest {
    @Test(groups = {"systemtest"})
    public void testLogin(){
        System.out.println("this is test login");
    }

    @Test(groups = {"functiontest"})
    public void testOpenPage(){
        System.out.println("this is test Open Page");
    }
}

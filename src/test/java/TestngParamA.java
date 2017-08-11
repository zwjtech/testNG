import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class TestngParamA {
    @BeforeClass
    @Parameters({"name","password"})
    public void beforeTest(String name,String password){
        System.out.println("TestA before: "+name+", password: "+password+",CurrentThread:"+Thread.currentThread().getName());
    }
    @AfterClass
    public void afterTest(){
        System.out.println("TestA after."+",CurrentThread:"+Thread.currentThread().getName());
    }
    @Test
    @Parameters("name")
    public void testA(String name){
        System.out.println("testA process:"+name+",CurrentThread:"+Thread.currentThread().getName());
    }
}

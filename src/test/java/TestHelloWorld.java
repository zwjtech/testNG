import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class TestHelloWorld {
    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "zhuyun@zwj.com");

    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("before test");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }

    @Test
    public void test1()
    {
        System.out.println("at test1");
    }
    @Test
    public void test2()
    {
        System.out.println("at test2");
    }
    @Test
    public void test3()
    {
        System.out.println("at test3");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("after test");
    }
}

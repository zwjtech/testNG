import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class DenpendTest {
    @Test
    public  void test3(){
        System.out.println("我是方法3");
    }
    @Test(dependsOnMethods = {"test3"})
    public void dependencyTest(){
        System.out.println("依赖性测试。");
    }
}
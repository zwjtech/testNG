import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by zhangWeiJie on 2017/8/11.
 */
public class ParamsDataProviderTest {

    @DataProvider(name = "testData")
    public static Object[][] dataBase(){
        return new Object[][]{{"Jimme","male"},{"Jessy","female"}};
    }

    @Test(enabled = false)
    @Parameters("name")
    public  void test1(String name){

    }

    @Test(dataProvider = "testData")
    public void test(String name, String sex){
        System.out.println(name + "性别是"+sex);
    }
}

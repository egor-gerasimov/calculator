import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.CalcUtils;

public class BaseTest {

    @BeforeClass
    public void start() {
        CalcUtils.closeAllCalculators();
        CalcUtils.runCalc();
    }

    @AfterClass
    public void close() {
        CalcUtils.closeCalc();
    }
}

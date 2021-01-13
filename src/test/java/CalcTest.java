import forms.CalcForm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {

    private static final int expectedResult = 1030;

    @DataProvider(name = "values")
    public Object[][] values() {
        return new Object[][]{
                {12, 999, 19}
        };
    }

    @Test(dataProvider = "values")
    public void test(int value1, int value2, int value3) {
        CalcForm calcForm = new CalcForm();
        calcForm.switchToScientific();
        calcForm.add(value1, value2);
        calcForm.addToMemory();
        calcForm.addFromMemoryTo(value3);
        float result = calcForm.getResult();
        Assert.assertEquals(result, expectedResult, "Not correct result");
    }
}

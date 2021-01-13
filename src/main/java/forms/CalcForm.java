package forms;

import java.nio.charset.StandardCharsets;
import model.Button;
import utils.CalcUtils;

public class CalcForm {

    private final Button btn1 = new Button(5);
    private final Button btn2 = new Button(11);
    private final Button btn9 = new Button(14);
    private final Button btnPlus = new Button(23);
    private final Button btnMPlus = new Button(18);
    private final Button btnMR = new Button(7);
    private final Button btnResult = new Button(28);

    public Button getBtnPlus() {
        return btnPlus;
    }

    public Button getBtn1() {
        return btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public Button getBtn9() {
        return btn9;
    }

    public Button getBtnMPlus() {
        return btnMPlus;
    }

    public Button getBtnMR() {
        return btnMR;
    }

    public Button getBtnResult() {
        return btnResult;
    }

    public void switchToScientific() {
        CalcUtils.switchToScientific();
    }

    public void sendKeys(int numeric) {
        byte[] bytes = String.valueOf(numeric).getBytes(StandardCharsets.UTF_8);
        for (byte aByte : bytes) {
            click(aByte);
        }
    }

    private Button getButton(byte b) {
        Button button = null;
        switch (b) {
            case '1' -> button = getBtn1();
            case '2' -> button = getBtn2();
            case '9' -> button = getBtn9();
        }
        return button;
    }

    private void click(byte b) {
        getButton(b).click();
    }

    public float getResult() {
        return CalcUtils.getResult();
    }

    public void clickPlus() {
        getBtnPlus().click();
    }

    public void calculate() {
        getBtnResult().click();
    }

    public void addToMemory() {
        getBtnMPlus().click();
    }

    public void readFromMemory() {
        getBtnMR().click();
    }

    public void add(int value1, int value2) {
        sendKeys(value1);
        clickPlus();
        sendKeys(value2);
        calculate();
    }

    public void addFromMemoryTo(int value) {
        sendKeys(value);
        clickPlus();
        readFromMemory();
        calculate();
    }
}

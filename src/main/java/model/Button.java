package model;

import utils.CalcUtils;

public class Button {

    private static final String controlIdFormat = "\"[CLASS:Button; INSTANCE:%d]\"";
    private final int number;

    public Button(int number) {
        this.number = number;
    }

    private String getControlId() {
        return String.format(controlIdFormat, number);
    }

    public void click() {
        CalcUtils.clickButton(getControlId());
    }
}

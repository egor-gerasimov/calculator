package utils;

import java.io.IOException;

public class CalcUtils {

    private static final String resourcesPath = System.getProperty("user.dir") + "/src/test/resources/";
    private static final String runCalcPath = resourcesPath + "runCalc.exe";
    private static final String closeCalcPath = resourcesPath + "closeCalc.exe";
    private static final String clickButtonPath = resourcesPath + "clickButton.exe";
    private static final String getResultPath = resourcesPath + "getText.exe";
    private static final String switchToScientificPath = resourcesPath + "switchToScientific.exe";
    private static final String closeAllCalcsPath = resourcesPath + "closeAllCalcs.exe";

    private static void execute(String filePath) {
        try {
            Process p = Runtime.getRuntime().exec(filePath);
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void runCalc() {
        execute(runCalcPath);
    }

    public static void closeCalc() {
        execute(closeCalcPath);
    }

    public static void clickButton(String buttonControlId) {
        execute(clickButtonPath + " " + buttonControlId);
    }

    public static float getResult() {
        execute(getResultPath);
        return ClipboardUtils.getFirstFloat();
    }

    public static void switchToScientific() {
        execute(switchToScientificPath);
    }

    public static void closeAllCalculators() {
        execute(closeAllCalcsPath);
    }
}

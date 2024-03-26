package Homework;

import io.appium.java_client.AppiumDriver;
import Homework.screens.Tabbar;

public class GoToMainFromTabbarStrategy implements GoToMainScreenStrategy{
    AppiumDriver<?> driver;
    public GoToMainFromTabbarStrategy(AppiumDriver<?> driver){
        this.driver = driver;
    }
    @Override
    public void goToMain() {
        Tabbar tabbar = new Tabbar(driver);
        tabbar.goToMain();
    }
}

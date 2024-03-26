import Homework.GoToMainFromCartButton;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import Homework.screens.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Module6 extends BaseTest {
    @Test
    public void homeTest(){
        MainScreen mainScreen = new MainScreen(driver);
        //проверка отображения логотипа Мвидео на главном экране
        mainScreen.getLogoTypeIcon().isDisplayed();
        //переход на экран Списки
        Tabbar tabbar = new Tabbar(driver);
        tabbar.goToLists();
        //нажатие на кнопку "Посмотреть каталог"
        ListsScreen listsScreen = new ListsScreen(driver);
        listsScreen.showCatalog();
        //Раскрытие списка "Смартфоны и гаджеты"
        CatalogScreen catalogScreen = new CatalogScreen(driver);
        catalogScreen.openSmartphonesAndGadgets();
        //Проверка отображения элемента "Samsung"
        catalogScreen.getSamsungTitle().isDisplayed();
        //Переход на экран Профиль
        tabbar.goToProfile();
        //Переход на выбор города
        ProfileScreen profileScreen = new ProfileScreen(driver);
        profileScreen.chooseCity();
        //Закрытие экрана выбора города
        ChooseCityScreen chooseCityScreen = new ChooseCityScreen(driver);
        chooseCityScreen.back();
        //Переход на экран Корзина
        tabbar.goToCart();
        //Нажатие на кнопку "На главную"
        CartScreen cartScreen = new CartScreen(driver);
        cartScreen.goToMainScreenByStrategy(new GoToMainFromCartButton(driver));
        //Проверка, что заголовок на экране содержит текст "Я в магазине"
        assertEquals("Я в магазине", mainScreen.getStoreMainTitleText());
    }
}

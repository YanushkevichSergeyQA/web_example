package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class TodayTixPage extends Form {
    private final static By FORM_LOCATOR = By.xpath("//img[@alt='TodayTix Logo']");

    private final ILabel searchLbl = AqualityServices.getElementFactory().getLabel(By.id("topBarSearch"), "Search");

    public TodayTixPage() {
        super(FORM_LOCATOR, "TodayTix main page");
    }

    public void searchAndClick(String showName) {
        searchLbl.sendKeys(showName);
        AqualityServices.getElementFactory().getLabel(By.xpath(String.format("//*[contains(text(), '%s')]", showName)),
                "Click " + showName).click();
    }

}

package tests.search;

import enums.ShowName;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TodayTixPage;
import tests.BaseTest;
import utilities.Log;

public class SearchForShowTest extends BaseTest {

    @Test
    public void testSearchForShow() {
        TodayTixPage todayTixPage = new TodayTixPage();

        Log.step(1, "Open todaytix site and check if we are on it");
        Assert.assertEquals(getBrowser().getDriver().getTitle(), "TodayTix Home London Title", "Is not todayTix page");

        Log.step(2, "Type show name on search and click on it");
        todayTixPage.searchAndClick(ShowName.TLK.getName());

    }

}

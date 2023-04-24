package tests;

import manage.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    Logger logger = LoggerFactory.getLogger(TestBase.class);
    static ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void startLogger(Method method){
        logger.info("Tests start--> "+method.getName());
    }

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void stop(){
        app.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void finishLogger(){
        logger.info("***************************************************");
    }

}

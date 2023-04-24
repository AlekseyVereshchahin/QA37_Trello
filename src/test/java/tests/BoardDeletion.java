package tests;

import org.testng.annotations.Test;

public class BoardDeletion extends  TestBase{

    @Test
    public void boardDeletion(){
        app.getBoard().clickTheFirstBoard();
        app.getBoard().pause(5000);
        app.getBoard().openSideBar();
        app.getBoard().pause(5000);
        app.getBoard().openMore();
        app.getBoard().pause(5000);
        app.getBoard().closeBoard();
        app.getBoard().pause(5000);
        app.getBoard().deleteBoard();

    }


}

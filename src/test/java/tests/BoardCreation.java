package tests;

import models.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {


    @Test
    public void boardCreation1() {
        Board board = Board.builder().title("qa37").build();
        logger.info("Board creation--"+board.getTitle());

        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().pause(5000);
        app.getBoard().fillInBoardCreationForm(board);
        //app.getBoard().scrollDownTheForm();
        app.getBoard().pause(5000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(5000);
        //app.getBoard().isCreated();

        Assert.assertTrue(app.getBoard().isCreated());
        logger.info("Board Created");

//        app.getBoard().pause(2000);
//        app.getBoard().returnToHomePage();

        //Assert
    }

    @Test
    public void boardCreation2() {

        int boardCountBeforeCreation = app.getBoard().getBoardCount();
        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillInBoardCreationForm("qa37");
       // app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();
        app.getBoard().pause(2000);

        int boardCountAfterCreation= app.getBoard().getBoardCount();

        Assert.assertEquals(boardCountAfterCreation,boardCountBeforeCreation+1);


    }



}

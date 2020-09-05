package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestRectangleLogic.class, TestSquareLogic.class, TestCircleLogic.class })
public class AllTests {

}

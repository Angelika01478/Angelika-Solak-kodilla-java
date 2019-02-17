package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite{

    private static int testCounter=0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("We are starting to test the ShapeCollector class.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("We have just finished all tests.");
        System.out.println("Number of tests performed: " + testCounter);
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        shapeCollector= new ShapeCollector();
        System.out.println("Preparing to execute the test number "+ testCounter);
    }

    @After
    public void afterEveryTest(){
        System.out.println("The test number " + testCounter + " have just finished");
    }

    //test sprawdzajacy czy po dodaniu figury do pustej kolekcji liczba figur w kolekcji wynosi 1
    @Test
    public void testAddFigureToEmpltyCollection(){
        Shape testShape = new Circle(10);
        shapeCollector.addFigure(testShape);
        int result = shapeCollector.showFigures().size();
        Assert.assertEquals(1, result);
    }


    //czy figura pobrana z klasy jest taka sama jak figura do niej wstawiania
    @Test
    public void testGetFigure(){
        Shape testShape= new Circle(10);
        shapeCollector.addFigure(testShape);
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(testShape,result);
    }

    //czy proba usuniecia nieistniejacej figury zwroci false
    @Test
    public void testRemoveNonExistingShape(){
        boolean result = shapeCollector.removeFigure(new Triangle(10,20));
        Assert.assertFalse(result);
    }

    //czy udalo sie usunac figure z klasy
    @Test
    public void testRemovingFigureFromClass(){
        Shape testShape= new Circle(10);
        shapeCollector.addFigure(testShape);
        boolean result = shapeCollector.removeFigure(testShape);
        int size= shapeCollector.showFigures().size();
        Assert.assertTrue(result);
        Assert.assertEquals(0, size);
    }

    //czy proba pobrania nieistniejacej figury zwroci null
    /*@Test
    public void testGetNonExistingFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        boolean thrown=false;
        try {
            shapeCollector.getFigure(1);

        }catch (IndexOutOfBoundsException exept){
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }
*/
//czy proba pobrania nieistniejacej figury zwroci null
    @Test
    public void testGetNonExistingFigure() {
        Shape result=shapeCollector.getFigure(1);
        Assert.assertEquals(null, result);

    }


    //czy metoda showFigures zwraca cala arrayListe
    @Test
    public void testShowFigure(){
        Shape testShape1= new Circle(10);
        Shape testShape2= new Circle(20);
        shapeCollector.addFigure(testShape1);
        shapeCollector.addFigure(testShape2);

        ArrayList<Shape> testList = new ArrayList<>();
        testList.add(new Circle(10));
        testList.add(new Circle(20));
        boolean containsAll=testList.containsAll(shapeCollector.showFigures()) && shapeCollector.showFigures().containsAll(testList);
       Assert.assertTrue(containsAll);
    }

    //czy metoda showFigures zawiera wszytsko
    @Test
    public void testCheckFigures() {
        Shape testShape1= new Square(10);
        Shape testShape2= new Square(20);
        shapeCollector.addFigure(testShape1);
        shapeCollector.addFigure(testShape2);

        String result = shapeCollector.toString();
        String expectedString="ShapeCollector{myShapes=[this is the square. The field is equal 100.0, this is the square. The field is equal 400.0]}";
        Assert.assertEquals(expectedString, result);
    }




}

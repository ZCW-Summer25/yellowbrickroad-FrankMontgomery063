package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Triangle roof;
    private Triangle roof1;
    private Circle sun;
    private Circle sun1;
    private Square door;
    private Square door1;
    private Square door2;
    private Square door3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
            wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(200);
        wall.makeVisible();

        door = new Square();
        door.changeColor("green");
        door.moveVertical(250);
        door.moveHorizontal(90);
        door.changeSize(30);
        door.makeVisible();

        door = new Square();
        door.changeColor("green");
        door.moveVertical(230);
        door.moveHorizontal(90);
        door.changeSize(30);
        door.makeVisible();

        door1 = new Square();
        door1.changeColor("green");
        door1.moveVertical(210);
        door1.moveHorizontal(90);
        door1.changeSize(30);
        door1.makeVisible();

        door2 = new Square();
        door2.changeColor("green");
        door2.moveVertical(180);
        door2.moveHorizontal(255);
        door2.changeSize(30);
        door2.makeVisible();

        door3 = new Square();
        door3.changeColor("green");
        door3.moveVertical(210);
        door3.moveHorizontal(90);
        door3.changeSize(10);
        door3.makeVisible();


        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        window1 = new Square();
        window1.changeColor("green");
        window1.moveHorizontal(150);
        window1.moveVertical(100);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("blue");
        window2.moveHorizontal(20);
        window2.moveVertical(50);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("green");
        window3.moveHorizontal(25);
        window3.moveVertical(200);
        window3.makeVisible();

        window4 = new Square();
        window4.changeColor("green");
        window4.moveHorizontal(155);
        window4.moveVertical(198);
        window4.makeVisible();

        window5 = new Square();
        window5.changeColor("green");
        window5.moveHorizontal(255);
        window5.moveVertical(200);
        window5.makeVisible();

        

        

        roof = new Triangle();
        roof.changeSize(50, 225);
        roof.moveHorizontal(150);
        roof.moveVertical(70);
        roof.makeVisible();

        roof1 = new Triangle();
        roof1.changeSize(25, 125);
        roof1.moveHorizontal(320);
        roof1.moveVertical(200);
        roof1.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(200);
        sun.moveVertical(-20);
        sun.changeSize(60);
        sun.makeVisible();

        sun1 = new Circle();
        sun1.changeColor("blue");
        sun1.moveHorizontal(170);
        sun1.moveVertical(225);
        sun1.changeSize(5);
        sun1.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

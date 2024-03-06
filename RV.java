import java.awt.*;
import java.awt.geom.*;

public class RV implements DrawingObject {

    public Rectangle body, front2Van, doorpassage, door, window3, window4, backTopVent, middleTopVent;
    public Circle windowBack, middleTopVent1, middleTopVent2, bulletHole1, bulletHole2, wheel;
    public Line frontmid2Window, topStrip, middleStrip, botStrip, sideStrip1, sideStrip2;
    public Square doorOutline, frontTopVent;
    public FrontVan frontVan, windowFrontVan;
    public BackVan backVan;

    public Color colorBulletHole = new Color(88, 60, 24);
    public Color colorBody = new Color(189, 159, 121);
    public Color colorDoorPassage = new Color(41, 7, 7);
    public Color colorDoor = new Color(165, 136, 98);
    public Color colorDoorWindow = new Color(188, 159, 119);
    public Color colorWindow = new Color(35, 6, 2);
    public Color color2Window = new Color(34, 4, 6);
    public Color colorRedStrip = new Color(120, 33, 23);
    public Color colorBlackStrip = new Color(38, 6, 0);
    public Color colorYellowStrip = new Color(183, 108, 39);
    public Color colorTopVents = new Color(89, 59, 33);
    public Color colorWheel = new Color(77, 36, 17);

    public int x, y;
    public int size;
    public int acceleration, speed, maxspeed;

    public boolean isSlowingDown, movedLeft, movedRight;

    public RV(int x, int y, int size, int maxspeed){
        this.x = x;
        this.y = y;
        this.size = size;
        acceleration = 1;
        this.maxspeed = maxspeed;
        speed = 0;
        isSlowingDown = false;
        movedLeft = false;
        movedRight = false;
    }

    public void moveRight(){

        if (maxspeed > speed) {
            speed += acceleration;
        }
        x += speed;
        
        movedRight = true;
    }

    public void moveLeft(){

        if (maxspeed > speed) {
            speed += acceleration;
        }
        x -= speed;

        movedLeft = true;
    } 

    public void isSlowingDown() {
        isSlowingDown = true;
    }

    public void slowDown(){
        if (isSlowingDown == true) {
            if (speed > 0) {
                speed -= 0.1;
                if (movedRight)
                    x += speed;
                else if (movedLeft)
                    x -= speed;
            }
        }
        if (speed == 0) {
            isSlowingDown = false;
            movedLeft = false;
            movedRight = false;
        }
        
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        frontTopVent = new Square(x + 210, y + 155, 55, colorTopVents);
        frontTopVent.draw(g2d);

        backTopVent = new Rectangle(x + 475, y + 147,  95,  50, colorTopVents);
        backTopVent.draw(g2d);

        middleTopVent = new Rectangle(x + 350, y + 153,  66,  50, colorTopVents);
        middleTopVent.draw(g2d);

        middleTopVent1 = new Circle(x + 335, y + 153,  40, colorTopVents);
        middleTopVent1.draw(g2d);

        middleTopVent2 = new Circle(x + 391, y + 153,  40, colorTopVents);
        middleTopVent2.draw(g2d);

        body = new Rectangle(x + 200, y + 175,  375,  150, colorBody);
        body.draw(g2d);

        front2Van = new Rectangle(x + 105, y + 280,  95,  45, colorBody);
        front2Van.draw(g2d);

        frontVan = new FrontVan(x + 200, x + 105, x + 200, y + 175, y + 280, y + 280, colorBody);
        frontVan.draw(g2d);

        backVan = new BackVan(x + 575, x + 575, x + 670, x + 670, x + 575, y + 175, y + 325, y + 225, y + 175, y + 175, colorBody);
        backVan.draw(g2d);

        g2d.translate(-25, 18);

        windowFrontVan = new FrontVan(x + 205, x + 151, x + 205, y + 185, y + 255, y + 255, colorWindow);
        windowFrontVan.draw(g2d);

        frontmid2Window = new Line(x + 215, y + 189, x + 215, y + 249,  10, color2Window);
        frontmid2Window.draw(g2d);

        g2d.setTransform(reset);

        sideStrip1 = new Line(x + 107, y + 290, x + 599, y + 290,  6, colorYellowStrip);
        sideStrip1.draw(g2d);

        sideStrip2 = new Line(x + 109, y + 300, x + 585, y + 300,  10, colorRedStrip);
        sideStrip2.draw(g2d);

        doorpassage = new Rectangle(x + 255, y + 215,  45,  100, colorDoorPassage);
        doorpassage.draw(g2d);

        door = new Rectangle(x + 209, y + 215,  45,  100, colorDoor);
        door.draw(g2d);

        bulletHole1 = new Circle(x + 220, y + 270, 4, colorBulletHole);
        bulletHole1.draw(g2d);
        g2d.translate(20, -3);
        bulletHole1.draw(g2d);
        g2d.translate(-5, 20);
        bulletHole1.draw(g2d);

        g2d.setTransform(reset);

        bulletHole2 = new Circle(x + 230, y + 274, 5, colorBulletHole);
        bulletHole2.draw(g2d);
        g2d.translate(-17, 16);
        bulletHole2.draw(g2d);

        g2d.setTransform(reset);

        doorOutline = new Square(x + 219, y + 224,  25, colorDoorWindow);
        doorOutline.draw(g2d);
        
        window3 = new Rectangle(x + 305, y + 215,  75,  45, colorWindow);
        window3.draw(g2d);

        topStrip = new Line(x + 204, y + 182, x + 581, y + 182,  9, colorBlackStrip);
        topStrip.draw(g2d);

        middleStrip = new Line(x + 203, y + 190, x + 620, y + 190,  7, colorYellowStrip);
        middleStrip.draw(g2d);

        botStrip = new Line(x + 204, y + 197, x + 630, y + 197,  10, colorRedStrip);
        botStrip.draw(g2d);

        window4 = new Rectangle(x + 459, y + 215,  107,  65, colorWindow);
        window4.draw(g2d);

        windowBack = new Circle(x + 579, y + 214,  49, color2Window);
        windowBack.draw(g2d);

        wheel = new Circle(x + 150, y + 310, 50, colorWheel);
        wheel.draw(g2d);
        g2d.translate(340, 0);
        wheel.draw(g2d);





        //this is for evident change in gtihub

        



        
        g2d.setTransform(reset);
    }
    
}

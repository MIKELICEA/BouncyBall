import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.fillWorld();   
    }
    
    public void fillWorld()
    {
        Ball ball1;
        ball1 = new Ball();
        this.addObject(ball1, 500, 200);
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    private String mydirection = "TopRight";
    
    public void act()
    {
        if(this.getY() < 20 || this.getY() > 780 || this.getX() < 20 || this.getX() > 980)
        {
            switch(mydirection)
            {
               case "TopRight": mydirection = "BottomRight";
                                break;
               case "BottomRight": mydirection = "BottomLeft";
                                break;
               case "BottomLeft": mydirection = "TopLeft";
                                break;
               case "TopLeft" : mydirection = "TopRight";
                                break;
            }  
        }
            
        if(mydirection == "TopRight")
        {
          this.moveRight();
          this.moveUp();
        }
            
        if(mydirection == "BottomRight")
        {
           this.moveRight();
           this.moveDown();
        }
        
        if(mydirection == "BottomLeft")
        {
           this.moveLeft();
           this.moveDown();
        }  
        
        if(mydirection == "TopLeft")
        {
           this.moveLeft();
           this.moveUp();
        }
          
        // Add your action code here.
    }
    
    public void moveUp()
    {
        this.setLocation(this.getX(), this.getY() - 5);
    }
    
    public void moveDown()
    {
        this.setLocation(this.getX(), this.getY() + 5);
    }
    
    public void moveLeft()
    {
        this.setLocation(this.getX() - 5, this.getY());
    }
    
    public void moveRight()
    {
       this.setLocation(this.getX() + 5, this.getY());
    }
    
}

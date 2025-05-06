import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Lee
 * @version April 2025
 */
public class Apple extends Actor
{
    public Apple(){
        GreenfootImage apple = new GreenfootImage("Apple1.png");
        apple.scale(60,60);
        setImage(apple);
        
    }
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Apple falls downwards.
        setLocation(getX(), getY() + 3);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}

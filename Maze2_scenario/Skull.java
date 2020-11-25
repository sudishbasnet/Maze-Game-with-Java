import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Actor
{
    /**
     * Act - do whatever the skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction =50; //speed direction for skull movemennt.
    
    public void act() 
    {
         move(); 
             
                
        Actor GoldenBall;  //calling actor
        GoldenBall = getOneObjectAtOffset(0,0,GoldenBall.class);
        if (GoldenBall!=null)
        {World myWorld;
            myWorld= getWorld();
            myWorld.removeObject(GoldenBall);  //removes ball if it touches skull
            GameOver go= new GameOver();      
            myWorld.addObject(go, myWorld.getWidth()/2,myWorld.getHeight()/2);//giving the position where to show the message.
            Greenfoot.playSound("skull.wav");//adding sound effect.
            Greenfoot.stop();
        }
    }
    public void move() 
    {     if ((direction < 0 && getX() == 0) || (direction > 0 && 
        getX() == getWorld().getWidth()-1)) direction = -direction; 
        //checking edges to return if there isn't way.
        move(direction);// movement
         }
        }
     

               


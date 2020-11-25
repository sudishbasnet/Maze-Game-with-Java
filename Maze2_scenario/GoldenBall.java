import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenBall extends Actor
{
    /**
     * Act - do whatever the GoldenBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
     {
       
        key();
        win();
        freefall();
       
       
        Actor Strawberry;
        Strawberry = getOneObjectAtOffset(0, 0, Strawberry.class);
        if (Strawberry !=null)
           {World myWorld;
            myWorld = getWorld();
            Maze maze = (Maze)myWorld;//
            //(creating Counter counter variable)
            Counter counter = maze.getCounter();//(getting counter) 
            counter.addScore();//(to add score in the scnerio)
            Greenfoot.playSound("eat.wav");//(adding sound effect) .
            myWorld.removeObject(Strawberry);//(removing straawberry when ball hits)
        }  
    } 
    
    public void freefall(){
         int downChange =60;//(giving displacement to ball according to it's size.)
         if (canMove (0,downChange) ==true){
             Greenfoot.delay(1);
             setLocation(getX(),getY()+downChange);
             Greenfoot.playSound("fall.wav");
            }
    }
    
    public boolean canMove(int x, int y)
       {
        Actor sand;
        sand=getOneObjectAtOffset(x,y,sandroad.class);
        
        //the section below checks if there is a block you can move to
        // if there is it sets sand to a vlaue otherwise it says null
        // The errors are in this section
        boolean flag=false;
        if (sand !=null)
        {
            flag=true;
            
        }
        
        return flag;
        
    
     }
    
    public void key()
      {
        //Note 1: Down the page increase the y value and going to the right increases the x value
        //Note 2: Each block is 60 pixels wide and high 
        int leftChange=(-60);//choose the appropriate left step size ; 
        int rightChange=(60);//choose the appropriate right step size ; 
        int upChange=(-60);//choose the appropriate up step size ; 
        int downChange=(60);//choose the appropriate down step size;
        if (Greenfoot.isKeyDown("a"))
        {
            if (canMove(leftChange, 0)==true){
            setLocation(getX()+leftChange, getY()) ;}
            Greenfoot.playSound("move.wav");//adding sound effect.
        }
        if (Greenfoot.isKeyDown("right"))
        {
           if (canMove(rightChange, 0)==true){
           setLocation(getX()+rightChange, getY()) ;}
            Greenfoot.playSound("move.wav");
                    }
        if (Greenfoot.isKeyDown("s"))
        {
            if (canMove(0,upChange)==true){
            setLocation(getX(), getY()+upChange) ;}
            Greenfoot.playSound("move.wav");
             }
       
        if (Greenfoot.isKeyDown("down"))
       
        if (canMove(0, downChange)==true){               
            setLocation(getX(), getY()+downChange) ;
         }
        
    
        }

      public void win()
    {
        Actor win;
        win=getOneObjectAtOffset(0,0,Goal.class);
        if (win !=null)
        {
            Greenfoot.playSound("welldone1.wav");
            Greenfoot.stop();
            World myWorld= getWorld();//creating another dip for ending message.
            WellDone wd= new WellDone();
            myWorld.addObject(wd, myWorld.getWidth()/2,myWorld.getHeight()/2);//giving the position where to show the message.
        }

     }
    
   
    }

     
   
     
  
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze extends World
{
    Counter counter = new Counter();//creating new counter class for new counter
    /**
     * Constructor for objects of class Maze.
     * 
     */
    
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 850, 1); 
        for (int loop=40;loop<960;loop=loop+60)
        {
            addObject(new sandroad(), loop,50);
            addObject(new sandroad(), loop,230);
            addObject(new sandroad(), loop,410);
            addObject(new sandroad(), loop,590);
            addObject(new sandroad(), loop,770);
            for (int loop_2=0;loop_2<=1;loop_2=loop_2+1)
            {
                addObject(new sandroad(), 100,110+(loop_2*60));
                addObject(new sandroad(), 340,110+(loop_2*60));
                addObject(new sandroad(), 580,110+(loop_2*60));
                addObject(new sandroad(), 160,290+(loop_2*60));
                addObject(new sandroad(), 400,290+(loop_2*60));
                addObject(new sandroad(), 700,290+(loop_2*60));
                addObject(new sandroad(), 100,470+(loop_2*60));
                addObject(new sandroad(), 340,470+(loop_2*60));
                addObject(new sandroad(), 760,470+(loop_2*60));
                addObject(new sandroad(), 160,650+(loop_2*60));
                addObject(new sandroad(), 400,650+(loop_2*60));
            }
        }
           addObject(new Goal(), 40,770);
           addObject(new GoldenBall(),940 ,50);
           addObject(new Skull (),38,406);//adding object skull for obstacle
           addObject(new Skull (),44,47);
           addObject(new Skull (),698,230);
           addObject(new Skull (),162,764);
           addObject(new Strawberry (),579,172);//adding object strawberry to eat
           addObject(new Strawberry (),156,356); 
           addObject(new Strawberry (),760,530);
           addObject(new Strawberry (),581,769);
           addObject(counter ,835,312);//adding object counter for score
      
          
           
           
    }
    public Counter getCounter()//to give actor whatever it wants
    {
        return counter;
    }
}

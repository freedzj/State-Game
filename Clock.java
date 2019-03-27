import java.util.concurrent.TimeUnit;

public class Clock implements Runnable
{
    private Hero hero;

    public Clock(Hero hero)
    {
        this.hero = hero;
    }
public void run(){
    while(true){
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch(InterruptedException e){
            e.printStackTrace();    
        }
        hero.setState(hero.getStandingState());
    }

    }
}

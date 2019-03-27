public class Ducking extends State
{
    Hero hero;

    public Ducking(Hero hero)
    {
        this.hero = hero;
    }

    void downReleased(){
      System.out.println(hero.getName() + " is standing.");
      hero.setState(hero.getStandingState());
    }

    void hitFire(){
      System.out.println(hero.getName() + " was hit by a fire object.");
      hero.setState(hero.getDeadState());
    }

    void hitRolled(){
      System.out.println(hero.getName() + " was hit by a rolled object.");
      hero.setState(hero.getDeadState());
    }
}

public class Diving extends State
{
    Hero hero;

    public Diving(Hero hero)
    {
        this.hero = hero;
    }

    void upReleased(){
      System.out.println(hero.getName() + " is ducking.");
      hero.setState(hero.getDuckingState());
    }

    void hitRolled(){
      System.out.println(hero.getName() + " was hit by a rolled object.");
      hero.setState(hero.getDeadState());
    }
}

public class Jumping extends State
{
    Hero hero;

    public Jumping(Hero hero)
    {
        this.hero = hero;
    }

    void upReleased(){
      System.out.println(hero.getName() + " is standing.");
      hero.setState(hero.getStandingState());
    }

    void downPressed(){
      System.out.println(hero.getName() + " is diving.");
      hero.setState(hero.getDivingState());
    }

    void hitFire(){
      System.out.println(hero.getName() + " was hit by a fire object.");
      hero.setState(hero.getDeadState());
    }

    void hitThrown(){
      System.out.println(hero.getName() + " was hit by a thrown object.");
      hero.setState(hero.getDeadState());
    }
}

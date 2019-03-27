public class Client{
  public static void main(String[] args)
  {
      Hero hero = new Hero("Duncan");

      hero.downPressed();
      hero.downReleased();
      hero.upPressed();
      hero.rolled();
      hero.upReleased();
      hero.upPressed();
      hero.downPressed();
      hero.fire();
      hero.downReleased();
      hero.upReleased();
      hero.escPressed();
      hero.fire();
  }
}

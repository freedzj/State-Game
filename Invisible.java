public class Invisible extends State
{
    private Hero hero;
    private String name;

    public Invisible(Hero hero)
    {
        this.hero = hero;
        name = hero.getName();
    }
}

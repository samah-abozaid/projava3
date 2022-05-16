package fr.m2i;

public abstract class AbstractBrawlerCharacter {

    protected String name;
    protected int healthPoint;
    protected int moveSpeed;

    public AbstractBrawlerCharacter(String name, int healthPoint, int moveSpeed) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public abstract void attack(AbstractBrawlerCharacter enemy);

    public void speak(String replique) {
        System.out.println(String.format("%s dit : \"%s\"", name, replique));
    }

    public void move() {
        System.out.println(String.format("%s a fait un bon %d cases !", name, moveSpeed));
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}

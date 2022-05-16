package fr.m2i;

public class Soldier extends AbstractBrawlerCharacter {

    private int attackDamage;

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(AbstractBrawlerCharacter enemy) {

        // Je check en premier si l'objet ennemi est null puis si il a de santé via le getter
        if (enemy == null || enemy.getHealthPoint() <= 0) {
            System.out.println("On ne frappe pas un ennemi à terre !");
            return; // On arrête la méthode ici avec le return
        }

        // Je récupère les points de vie de mon ennemi via le getter
        int enemyHealthPoint = enemy.getHealthPoint();

        // Je décrémente la vie de mon adversaire avec mes points d'attaque
        enemyHealthPoint -= attackDamage;

        // Je met à jour les points de vie de mon adversaire
        enemy.setHealthPoint(enemyHealthPoint);

        String attackMessageToFormat = "%s a infligé %d de dégats à %s ! Il lui reste %d de point de vie";
        System.out.println(String.format(attackMessageToFormat, name, attackDamage, enemy.getName(), enemy.getHealthPoint()));
    }
}




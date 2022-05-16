package fr.m2i;



    public class Wizard extends AbstractBrawlerCharacter {

        private int mana;

        public Wizard(String name, int healthPoint, int moveSpeed, int mana) {
            super(name, healthPoint, moveSpeed);
            this.mana = mana;
        }

        @Override
        public void attack(AbstractBrawlerCharacter enemy) {

            if (enemy == null || enemy.getHealthPoint() <= 0) {
                System.out.println("On ne frappe pas un ennemi à terre !");
                return;
            }

            enemy.setHealthPoint(enemy.getHealthPoint() - mana);

            String attackMessageToFormat = "%s lance un sort occulte sur %s ! Il perd %d point de vie, il lui reste %d";
            System.out.println(String.format(attackMessageToFormat, name, enemy.getName(), mana, enemy.getHealthPoint()));
        }
    }


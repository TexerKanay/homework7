public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeOfSuperAbility;

    public Hero(int health, int damage, String typeOfSuperAbility) {
        super();
        this.health = health;
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
    @Override
    public abstract void applySuperAbility();
}




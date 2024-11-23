public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, String typeOfSuperAbility, double healPoints) {
        super(health, damage, typeOfSuperAbility);
        this.healPoints = healPoints;
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    // метод увеличения опыта лечения на 10%
    public void increaseExperience() {
        this.healPoints *= 1.1;
        System.out.println("Medic увеличил количество лечения " + this.healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + getTypeOfSuperAbility());
    }
}


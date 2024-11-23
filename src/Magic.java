public class Magic extends Hero {
    public Magic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность: " + getTypeOfSuperAbility());
    }
}


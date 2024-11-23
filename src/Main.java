public class Main {
    public static void main(String[] args) {
        //массив
        Hero[] heroes = new Hero[3];

        heroes[0] = new Warrior(300, 50, "CRITICAL DAMAGE");
        heroes[1] = new Magic(250, 40, "MAGICAL DAMAGE");
        heroes[2] = new Medic(200, 30, "MEDICAL DAMAGE", 50);

        // перебираем массив
        for (Hero hero : heroes) {
            hero.applySuperAbility();


            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
        System.out.println(heroes[0].toString() + " " + heroes[1].toString() + " " + heroes[2].toString());
    }
}

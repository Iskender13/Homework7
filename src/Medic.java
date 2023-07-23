public class Medic extends Hero{
    int healPoints;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic использовал способность Лечебная Травка");

    }
    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1); // Увеличиваем опыт лечения на 10%
    }
}


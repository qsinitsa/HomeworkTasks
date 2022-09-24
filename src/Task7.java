public class Task7 {
    public static void main(String[] args) {
        int OverWeight = 7;
        double losingWeightPerDay1 = 0.25;
        double losingWeightPerDay2 = 0.5;
        double needDays1 = OverWeight / losingWeightPerDay1;
        double needDays2 = OverWeight / losingWeightPerDay2;
        double averageValue = (needDays1 + needDays2) / 2;
        System.out.println("В среднем спортсену понадобится " + averageValue + " дней для похудения");
    }
}

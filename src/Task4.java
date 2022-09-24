public class Task4 {
    public static void main(String[] args) {
        byte machineCapacity = 16;
        int capacityPerMin = machineCapacity / 2;
        int minutes20 = capacityPerMin * 20;
        int minutesInDay = 60 * 24;
        int capacityPerDay = capacityPerMin * minutesInDay;
        int capacityPer3Days = capacityPerDay *3;
        int capacityPerMonth = capacityPerDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + minutes20 + " штук");
        System.out.println("За сутки машина произвела бутылок " + capacityPerDay + " штук");
        System.out.println("За 3 дня минут машина произвела бутылок " + capacityPer3Days + " штук");
        System.out.println("За месяц машина произвела бутылок " + capacityPerMonth + " штук");

    }
}

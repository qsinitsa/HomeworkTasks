public class Task8 {
    public static void main(String[] args) {
        int masha = 67760;
        int denis = 83690;
        int kristna = 76230;
        double mashaNew = masha + masha * 0.1;
        double denisNew = denis + denis * 0.1;
        double kristinaNew = kristna + kristna * 0.1;
        int amtMasha = masha * 12;
        int amtDenis = denis * 12;
        double amtkristina = kristna * 12;
        double amtMashaNew = mashaNew * 12;
        double amtKristinaNew = kristinaNew * 12;
        double amtDenisNew = denisNew * 12;
        System.out.println("Новая зарплата Кристины " + kristinaNew);
        System.out.println("Новая зарплата Дениса " + denisNew);
        System.out.println("Новая зарплата Маши " + mashaNew);
        System.out.println("Разница годовой зарплаты Маши " + (amtMashaNew - amtMasha));
        System.out.println("Разница годовой зарплаты Дениса " + (amtDenisNew - amtDenis));
        System.out.println("Разница годовой зарплаты Кристины " + (amtKristinaNew - amtkristina));
    }
}

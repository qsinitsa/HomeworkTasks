public class Task6 {
    public static void main(String[] args) {
        byte numerOfBananas = 5;
        byte bananaWeight = 80;
        byte milk = 2;
        byte milkWeight =105;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        int amout = numerOfBananas * bananaWeight + milk * milkWeight + icecream * icecreamWeight + eggs * eggWeight;
        double amoutKg =(double) amout / 1000;
        System.out.println("Всего в завтраке спортсмена " + amoutKg + "кг продуктов." );
        System.out.println(amout);

    }
}

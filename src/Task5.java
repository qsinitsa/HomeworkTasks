public class Task5 {
    public static void main(String[] args) {
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCans / cansPerClass;
        int totalWhite = totalClasses * whiteCansPerClass;
        int totalBrown = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно" + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

    }
}

public class Zad6 {
    public static void main(String[] args) {
        int room1 = 3*4;
        int room2 = 3*4;
        int room3 = 2*3;
        int room4 = 2*2;
        int allRooms = room1+room2+room3+room4;
        int ludzie = 4;
        int spaceForOnePerson = allRooms/ludzie;

        System.out.println("Powierzchnia mieszkania dla pojedynczej osoby to " + spaceForOnePerson + "m^2");

    }


}
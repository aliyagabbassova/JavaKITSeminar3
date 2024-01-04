package HomeWork6;

public class MontyHallSimulation {
    public static void main(String[] args) {
        GoodPlayer goodPlayer = new GoodPlayer();
        BadPlayer badPlayer = new BadPlayer();

        SuperGame superGame = new SuperGame();
        superGame.setPlayer(goodPlayer);
        superGame.Play(100);
        System.out.println("Good player stats:");
        superGame.printStats();

        superGame.setPlayer(badPlayer);
        superGame.Play(100);
        System.out.println("Bad player stats:");
        superGame.printStats();
    }
}

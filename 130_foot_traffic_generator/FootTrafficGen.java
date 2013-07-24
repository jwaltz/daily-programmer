import java.util.Random;

public class FootTrafficGen {
    public static void main(String[] args) {
        //read in stuff from command line
        int EVENT_COUNT = Integer.parseInt(args[0]);
        int VISITOR_COUNT = Integer.parseInt(args[1]);
        int ROOM_COUNT = Integer.parseInt(args[2]);
        int START_TIME = Integer.parseInt(args[3]);
        int END_TIME = Integer.parseInt(args[4]);
        Random rand = new Random(System.nanoTime());
    }

}

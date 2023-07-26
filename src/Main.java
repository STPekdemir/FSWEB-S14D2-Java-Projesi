import com.Workintech.Sprint_14.Bed;
import com.Workintech.Sprint_14.Bedroom;
import com.Workintech.Sprint_14.Ceiling;
import com.Workintech.Sprint_14.Lamp;
import com.Workintech.Sprint_14.Wall;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");

        Wall wall2 = new Wall("East");

        Wall wall3 = new Wall("South");

        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

        /*
         * Output
         * Bed is being made
         * The bed is being made.
         * Lamp is being turned on.
         */
    }
}
import java.util.ArrayList;
import java.util.List;

public abstract class Animals {

    private String name;
    private static int count = 0;


    public Animals(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public List<String> getListCommand() {
        return listCommand;
    }

    public abstract void sound();

    private List<String> listCommand = new ArrayList<>();


}

import java.util.*;

public class MyGraphNodes {
    int value;
    List<MyGraphNodes> neighbors;

    public MyGraphNodes(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void setValue(int value1) {
        this.value = value1;
    }
}

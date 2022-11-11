import java.util.ArrayList;

public class Folder extends Component {

    ArrayList<Component> d = new ArrayList<>();
    void add(Component f) {
        this.d.add(f);
    }
    int getSize() {
        int sum = 0;
        for(int i = 0; i < d.size(); i++)
            sum = sum + d.get(i).getSize();

        return sum;
    }
}

package chainofresponsibilityrg;

import java.util.*;

class Container extends Component {
    protected List<Component> children = new ArrayList<>();

    public Container(Container parent) {
        super(parent, null);
    }

    public void add(Component child) {
        children.add(child);
    }

    @Override
    public void showHelp() {
        if (tooltipText != null) {
            System.out.println("Container Tooltip: " + tooltipText);
        } else {
            super.showHelp();
        }
    }
}

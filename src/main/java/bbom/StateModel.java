package bbom;

public class StateModel implements StateModelInterface {
    private int state;

    public StateModel() {
        state = 0;
    }

    @Override
    public void updateState() {
        state++;
    }

    @Override
    public int getState() {
        return state;
    }
}

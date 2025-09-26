package bbom;

public class Controller {
    private final StateModelInterface state;
    private final ViewInterface view;

    public Controller(StateModelInterface state, ViewInterface view) {
        this.state = state;
        this.view = view;
        this.view.setController(this);
    }

    public void onUpdateButtonPressed() {
        state.updateState();
        view.updateStateDisplay(state.getState());
    }

    public void start() {
        view.show();
    }
}

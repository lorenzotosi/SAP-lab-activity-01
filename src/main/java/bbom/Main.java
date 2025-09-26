package bbom;

public class Main {
    static public void main(String[] args) throws Exception {
        StateModelInterface model = new StateModel();
        ViewInterface view = new View();
        Controller controller = new Controller(model, view);

        javax.swing.SwingUtilities.invokeAndWait(controller::start);
    }
}

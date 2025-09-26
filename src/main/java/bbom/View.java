package bbom;

import javax.swing.*;

public class View implements ViewInterface {
    private final JFrame frame;
    private final JLabel stateLabel;
    private Controller controller;

    public View() {
        frame = new JFrame("My BBoM App");
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton updateButton = new JButton("Update");
        stateLabel = new JLabel("State value: 0");

        updateButton.addActionListener(e -> {
            if (controller != null) {
                controller.onUpdateButtonPressed();
            }
        });

        JPanel panel = new JPanel();
        panel.add(updateButton);
        panel.add(stateLabel);

        frame.getContentPane().add(panel);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void updateStateDisplay(int state) {
        stateLabel.setText("State value: " + state);
    }

    public void show() {
        frame.setVisible(true);
    }
}

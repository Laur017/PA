import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    private final Mainframe frame;
    private JButton loadBtn;
    private JButton saveBtn;
    private JButton exitBtn;

    public ControlPanel(Mainframe frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        loadBtn = new JButton("Load");
        saveBtn = new JButton("Save");
        exitBtn = new JButton("Exit");
        add(loadBtn);
        add(saveBtn);
        add(exitBtn);

        loadBtn.addActionListener(this::loadEvent);
        saveBtn.addActionListener(this::saveEvent);
        exitBtn.addActionListener(this::exitEvent);
    }

    private void loadEvent(ActionEvent event) {
        System.out.println("Load");
    }

    private void saveEvent(ActionEvent event) {
        System.out.println("Save");
    }

    private void exitEvent(ActionEvent event) {
        frame.dispose();
    }
}

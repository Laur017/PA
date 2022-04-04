import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConfigurationPanel extends JPanel {
    private final Mainframe frame;
    private JLabel gridLabel;
    private JSpinner rowSpinner;
    private JSpinner columnSpinner;
    private JButton createBtn;

    public ConfigurationPanel(Mainframe frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        gridLabel = new JLabel("Grid size:");
        rowSpinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        columnSpinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        createBtn = new JButton("Enter");

        add(gridLabel);
        add(rowSpinner);
        add(columnSpinner);
        add(createBtn);

        createBtn.addActionListener(this::changeCanvas);
    }

    private void changeCanvas(ActionEvent e) {
        System.out.println(
                "New Canvas of size " + rowSpinner.getValue().toString() + " x " + columnSpinner.getValue().toString());
        frame.drawingPanel.init(getRowsNr(), getColumnsNr());
    }

    public int getRowsNr() {
        return (int) rowSpinner.getValue();
    }

    public int getColumnsNr() {
        return (int) columnSpinner.getValue();
    }
}

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame
{
    protected ConfigurationPanel configPanel;
    protected ControlPanel controlPanel;
    protected DrawingPanel drawingPanel;

    public Mainframe()
    {
        super("L6");
        init();
    }

    private void init()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configPanel = new ConfigurationPanel(this);
        controlPanel = new ControlPanel(this);
        drawingPanel = new DrawingPanel(this);
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
        add(drawingPanel, BorderLayout.CENTER);
        pack();
    }

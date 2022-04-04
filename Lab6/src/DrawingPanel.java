import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawingPanel extends JPanel
{
    private final Mainframe frame;
    private int rowsNr;
    private int columnsNr;
    private final int canvasWidth = 400;
    private final int canvasHeight = 400;
    private int boardWidth;
    private int boardHeight;
    private int cellWidth;
    private int cellHeight;
    private int centerX;
    private int centerY;
    private int stoneSize;
    private BufferedImage image;
    private Graphics2D offscreen;

    public DrawingPanel(Mainframe frame)
    {
        this.frame = frame;
        init(frame.configPanel.getRowsNr(), frame.configPanel.getColumnsNr());
    }

    final void init(int rowsNr, int columnsNr)
    {
        this.rowsNr = rowsNr;
        this.columnsNr = columnsNr;
        this.stoneSize = 20;
        this.centerX = stoneSize + 10;
        this.centerY = stoneSize + 10;
        this.cellWidth = (canvasWidth - 2 * centerX) / (columnsNr - 1);
        this.cellHeight = (canvasHeight - 2 * centerY) / (rowsNr - 1);
        this.boardWidth = (columnsNr - 1) * cellWidth;
        this.boardHeight = (rowsNr - 1) * cellHeight;
        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        createOffscreenImage();
        repaint();
    }

    private void createOffscreenImage()
    {
        image = new BufferedImage(canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = image.createGraphics();
        offscreen.setColor(Color.WHITE);
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
    }

    @Override
    protected void paintComponent(Graphics graphics)
    {
        paintGrid();
        graphics.drawImage(image, 0, 0, this);
    }

    private void paintGrid()
    {
        offscreen.setColor(Color.DARK_GRAY);

        for (int row = 0; row < rowsNr; row++)
        {
            int x1 = centerX;
            int y1 = centerY + row * cellHeight;
            int x2 = centerX + boardWidth;
            int y2 = y1;
            offscreen.drawLine(x1, y1, x2, y2);
        }

        for (int column = 0; column < columnsNr; column++)
        {
            int x1 = centerX + column * cellWidth;
            int y1 = centerY;
            int x2 = x1;
            int y2 = centerY + boardHeight;
            offscreen.drawLine(x1, y1, x2, y2);
        }

        for (int row = 0; row < rowsNr; row++)
        {
            for (int col = 0; col < columnsNr; col++)
            {
                int x = centerX + col * cellWidth;
                int y = centerY + row * cellHeight;
                offscreen.setColor(Color.LIGHT_GRAY);
                offscreen.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
            }
        }
    }
}

/**
 * A cloud made of three overlapping Circle objects.
 */
public class Cloud
{
    private Circle c1;
    private Circle c2;
    private Circle c3;
    private boolean isVisible;

    /**
     * Create a cloud at the default position.
     */
    public Cloud()
    {
        c1 = new Circle();
        c2 = new Circle();
        c3 = new Circle();
        isVisible = false;

        // Default color
        c1.changeColor("white");
        c2.changeColor("white");
        c3.changeColor("white");

        // Default sizes
        c1.changeSize(40);
        c2.changeSize(50); // middle bigger
        c3.changeSize(40);

        // Default positions relative to the cloud
        c1.moveHorizontal(-20);
        c1.moveVertical(-60);

        c2.moveHorizontal(10);
        c2.moveVertical(-80);

        c3.moveHorizontal(40);
        c3.moveVertical(-60);
    }

    /**
     * Make the cloud visible.
     */
    public void makeVisible()
    {
        if (!isVisible) {
            isVisible = true;
            c1.makeVisible();
            c2.makeVisible();
            c3.makeVisible();
        }
    }

    /**
     * Make the cloud invisible.
     */
    public void makeInvisible()
    {
        if (isVisible) {
            isVisible = false;
            c1.makeInvisible();
            c2.makeInvisible();
            c3.makeInvisible();
        }
    }

    /**
     * Move the cloud horizontally.
     */
    public void moveHorizontal(int distance)
    {
        c1.moveHorizontal(distance);
        c2.moveHorizontal(distance);
        c3.moveHorizontal(distance);
    }

    /**
     * Move the cloud vertically.
     */
    public void moveVertical(int distance)
    {
        c1.moveVertical(distance);
        c2.moveVertical(distance);
        c3.moveVertical(distance);
    }

    /**
     * Slowly move the cloud horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int step = distance < 0 ? -1 : 1;
        for (int i = 0; i != distance; i += step) {
            c1.moveHorizontal(step);
            c2.moveHorizontal(step);
            c3.moveHorizontal(step);
        }
    }

    /**
     * Slowly move the cloud vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int step = distance < 0 ? -1 : 1;
        for (int i = 0; i != distance; i += step) {
            c1.moveHorizontal(step);
            c2.slowMoveVertical(step);
            c3.slowMoveVertical(step);
        }
    }

    /**
     * Change the color of the cloud.
     */
    public void changeColor(String color)
    {
        c1.changeColor(color);
        c2.changeColor(color);
        c3.changeColor(color);
    }

    /**
     * Change the size of the cloud (scales all circles proportionally).
     */
    public void changeSize(int size)
    {
        c1.changeSize(size - 10); // left
        c2.changeSize(size);      // middle
        c3.changeSize(size - 10); // right
    }

}

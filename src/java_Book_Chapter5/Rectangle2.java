package java_Book_Chapter5;

/**
Another class that represents a rectangle.
*/
public class Rectangle2 {
	private int width;
    private int height; 

    public void setDimensions(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getArea()
    {
		return width * height;
	}
}

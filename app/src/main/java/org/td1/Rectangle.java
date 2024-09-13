package org.td1;

/** Rectangle */
public class Rectangle {
  public int Length;
  public int Width;

  public int perimeter() {
    return Length * 2 + Width * 2;
  }

  public int area() {
    return Length * Width;
  }

  public boolean isSquare() {
    return Length == Width;
  }

  public String displayRectangle() {
    String result =
        "Length: "
            + Length
            + " - Width: "
            + Width
            + " - Perimeter: "
            + perimeter()
            + " - Area: "
            + area()
            + " - "
            + (isSquare() ? "It’s a square" : "It’s not a square");
    return result;
  }
}

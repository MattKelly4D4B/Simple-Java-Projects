public class Rectangle{
  private int x;
  private int y;
  private int l;
  private int w;
  public Rectangle (int x, int y, int l, int w) {
    this.x = x;
    this.y = y;
    this.l = l;
    this.w = w;
 }

 @Override
 public String toString() {
   return "Rectangle: x=" + this.x + " y=" + this.y + " length=" + this.l + " width=" + this.w;
 }
}

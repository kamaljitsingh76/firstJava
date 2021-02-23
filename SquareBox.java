public class SquareBox extends Box
{
 int wt;
 public SquareBox(int x, int y, int z, int wt)
 {
  super.l=x;
  super.b=y;
  super.w=z;
  this.wt=wt;
 }
 public display()
 {
  super.display();
  System.out.println("Weight of the Box is:" +wt);
 }
}

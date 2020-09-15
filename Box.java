class Box
{
  int l,b,w;
  Box(int x, int y, int z)
  {
    l=x;
    b=y;
    w=z;
  }
  int volume()
  {
    return (l*b*w);
  }
  void display()
  {
    System.out.println("length="+l);
    System.out.println("breadth="+b);
    System.out.println("width="+w);
    System.out.println("Volume="+volume());
  }
}

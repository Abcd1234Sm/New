import java.util.*;
class DungeonsAndDragonsDice
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[4];
    System.out.println("DUNGEONS AND DRAGONS DICE ROLLER");
    System.out.println("Select the dice you want to roll from the list - ");
    System.out.println("[1] d4");
    System.out.println("[2] d6");
    System.out.println("[3]d8");
    System.out.println("[4] d10");
    System.out.println("[5] d12");
    System.out.println("[6] d20");
    System.out.println("[7]d100");
    int n=sc.nextInt();
    switch(n)
    {
      case 1:
        a=new int[4];
        break;
      case 2:
        a=new int[6];
        break;
      case 3:
        a=new int[8];
        break;
      case 4:
        a=new int[10];
        break;
      case 5:
        a=new int[12];
        break;
      case 6:
        a=new int[20];
        break;
      case 7:
        a=new int[100];
        break;
      default:
        System.out.println("Wrong Input !");
    }
    for(int i=1;i<a.length+1;i++)
    {
      a[i-1]=i;
    }
    
    Random rgen = new Random();  // Random number generator   
 
  for (int i=0; i<a.length; i++) {
      int randomPosition = rgen.nextInt(a.length);
      int temp = a[i];
      a[i] = a[randomPosition];
      a[randomPosition] = temp;
  }
  System.out.println(a[a.length/2]);
  //for(int i=0;i<a.length;i++)
   //System.out.println(a[i]);
  sc.close();
  }
}
  
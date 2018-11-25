class ArrEvnPrint
{
  public static void main(String a[])
  {
  System.out.println("This program is to print EVEN numbers from 1 to 10");
  int[] arrnum=new int[10];
  for(int i=0; i<10; i++)
  {
  arrnum[i]=i+1;
  if(arrnum[i] % 2 == 0)
    System.out.println("This is an EVEN number in 1-10 : "+arrnum[i]);
  }
  }
}

import java.util.Scanner;

public class NegAgeExcep 
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in); //To get keyboard input
    System.out.println("Enter only positive value for age: ");
    int input=sc.nextInt();
    if (input < 0)
    try 
    {
      throw new NegativeAgeException("Please Enter Positive Integers");
    } 
    catch (NegativeAgeException e) // TODO Auto-generated catch block
    {
      System.out.println(e.getMessage());
    }
    else
    System.out.println("Entered Number is a Positive Integer");
  }
}
class NegativeAgeException extends Exception 
{
  private String message;
  public NegativeAgeException() 
  {
    // TODO Auto-generated constructor stub
  } 
  public NegativeAgeException(String message) 
  {
    this.message= message;
    // TODO Auto-generated constructor stub
  }
  public String getMessage() 
  {
    return message;
  }
  public void setMessage(String message) 
  {
    this.message = message;
  }
}

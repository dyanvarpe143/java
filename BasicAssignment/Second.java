class Sample1
{
  int var1;

  void setVar1(int var1)
  {

    this.var1=var1;
  }

  int getVar1()
  {
    return var1;
   }
 }
public class Second
{ 
  public static void main(String args[])
  {

  Sample1 s1=new Sample1();
   s1.setVar1(101);  
   System.out.println(s1.getVar1());    
    
}
} 
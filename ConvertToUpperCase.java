
public class UpperCase 
{
  public static void main(String[]args){
   
   String s="venky is a good gentel man";
   char[]a=s.toCharArray();
   int i=0;
   while(i<a.length)
    {
   
         if(i==0) 
         {
          convertToUpperCase(a,0); 
          i++;
         }
        while(i<a.length && a[i]!=' ')i++;
        if(i<a.length-1)convertToUpperCase(a,i+1);
        i++;
    
   }

}
    public static void convertToUpperCase(int[]a,int i)
    {
        if(a[i]>='a' && a[i]<='z') a[i]=a[i]-32;
    }
}
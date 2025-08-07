import java.util.*;
class water
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of glasses: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of liters: ");
        int k=sc.nextInt();
        int sol=solution(n,k);
        System.out.println("The count is: "+sol);
        sc.close();
    }
    static int solution(int n,int k)
        {
            int count=0;
            for(int i=n;i>0;i--)
            {
                if(k>=i)
                {
                    k-=i;
                    count++;
                }
                if(k==0)
                {
                    return count;
                }
            }
            return -1;
        }
}

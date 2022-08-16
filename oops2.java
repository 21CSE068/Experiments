package oops;

public class divisible {

    public static void main(String[] args) 
    {
            int sum=0;
            for(int i=101;i<200;i++)
            {
                if(i%7==0)
                {
                    sum=sum+i;
                }
            }
    System.out.println(sum+"sum of all integers which greater than 100 and less than 200 which are divisble by 7:");
}
}
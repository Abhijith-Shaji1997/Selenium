public class Average 
{
    public static void main(String[] args)
 {

        int num1 = 10, num2 = 20, num3 = 30;
        System.out.println("Average of three integers: " + getAverage(num1, num2, num3));
        float num4 = 10.5f, num5 = 20.5f, num6 = 30.5f;
        System.out.println("Average of three float numbers: " + getAverage(num4, num5, num6));
    }

    public static float getAverage(float num1, float num2, float num3) 
{
        float avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    public static int getAverage(int num1, int num2, int num3) 
{
        int avg = (num1 + num2 + num3) / 3;
        return avg;
    }
}

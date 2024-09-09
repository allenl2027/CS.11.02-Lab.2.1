/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Allen Liang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int num1=(add(1,2));
        System.out.println(num1);
        int num2=(add(1,2,3,4));
        System.out.println(num2);
        String morning=(morningGreeting("Allen"));
        System.out.println(morning);
        String after=(afternoonGreeting("Allen"));
        System.out.println(after);
        String trip=(triple("hi"));
        System.out.println(trip);
        double ha=(half(9));
        System.out.println(ha);
        int roundedPos=(roundPositiveValueToNearestInteger(6.6));
        System.out.println(roundedPos);
        int roundedNeg=(roundNegativeValueToNearestInteger(-6.6));
        System.out.println(roundedNeg);
    }

    // 1. add
    public static int add(int a,int b)
    {
        return a+b;
    }
    // 2. add
    public static int add(int a,int b,int c,int d)
    {
        return add(add(a,b),add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name)
    {
        return "早上好, "+name+"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name)
    {
        return "下午好, "+name+"!";
    }
    // 5. triple
    public static String triple(String tri)
    {
        return tri+tri+tri;
    }
    // 6. half
    public static double half(int hal)
    {
        return hal/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double pos)
    {
        return (int)(pos+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double neg)
    {
        return (int)(neg-0.5);
    }
}

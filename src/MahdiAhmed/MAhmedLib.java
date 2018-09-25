package MahdiAhmed;

public class MAhmedLib {
    //string section
    public static String dateStr(String a)
    {
        String month = a.substring(0,2);
        String day = a.substring(3,5);
        String year = a.substring(6);
        String newDate = day + "-" + month + "-" + year;
        return newDate;
    }

    public static String cutOut(String a, String b)
    {
        int x = a.indexOf(b);
        String firstPart = a.substring(0,x);
        String lastPart = a.substring(x + b.length());
        return firstPart + lastPart;
    }

    public static boolean isPalindrome(String a)
    {
        String x = "";
        for (int i = 0; i < a.length(); i++)
        {
            x = x + a.substring(a.length() - (i + 1), a.length() - i);
        }
        if(x.compareTo(a) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //math section
    public static boolean isFibonacci(int a)
    {
        int x = 0;
        int y = 1;
        int z = 0;
        while (z <= a)
        {
            if (a == z)
            {
                return true;
            }
            z = x + y;
            x = y;
            y = z;
        }
        return false;
    }

    public static int sumUpTo(int a)
    {
        int x = 0;
        for (int i = 0; i < a; i++)
        {
            x = x + (a - i);
        }
        return x;
    }

}

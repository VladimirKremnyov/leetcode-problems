package problems;

public class RevertNumber {
    public int reverse(int x) {
        String str = String.valueOf(x);         //turn to a string
        String revstr = "";

        for(int i=str.length()-1; i>=0; i--)    //reverse the string
            if(str.charAt(i) != '-')            //skip the negative, check for it later
                revstr += str.charAt(i);

        long result = Long.valueOf(revstr);     //long value of reversed strubg
        if(result > Integer.MAX_VALUE) return 0;//when overflow, greater than max int

        if(x < 0) result *= (-1);               //if it was negative, make it negative

        return (int)result;                     //return the result casted as (int)
    }
}

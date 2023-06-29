package leetcode.leetCode;

public class Polindrom {
    public static void main(String[] args) {
        int polindrom = 12221;
        System.out.println(isPalindrome(polindrom));

    }

    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        } if (0==x) {
            return true;
        }

        int tmp = x;
        int ans = 0;
        while (0!=tmp) {
            ans = ans*10 + tmp%10;
            tmp /= 10;
        }

        return ans==x ? true : false;

    }
}

package No476;

/**
 * Created by bupt on 6/8/17.
 */
public class Solution {
    public static int findComplement(int num){
        String binaryInt = Integer.toBinaryString(num);
        System.out.println(binaryInt);
        StringBuffer complementString = new StringBuffer();
        for(int i = 0; i< binaryInt.length();i++){
            char c = binaryInt.charAt(i);
            if(c == '1')
                complementString.append("0");
            else
                complementString.append("1");
        }
        System.out.println(complementString);

        int res = 0;
        for(int i = 0;i < complementString.length();i++){
            int index = complementString.charAt(i) - '0';
            res += index * Math.pow(2,complementString.length()-1-i);
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(findComplement(a));
    }
}

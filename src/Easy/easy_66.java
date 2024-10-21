package Easy;

public class easy_66 {
    public int[] plusOne(int[] digits) {

        int carry = 1;

        for(int i = digits.length - 1; i >= 0; i--){
            int digit = digits[i];
            int sum = digit + carry;

            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if(carry != 1){
            return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOne2(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}

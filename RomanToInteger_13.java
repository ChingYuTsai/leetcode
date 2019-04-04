public class RomanToInteger_13 {
    public int romanToInt(String s) {
        int total = 0;
        char[] input = s.toCharArray();
        for(int i = 0; i < input.length; i++){
            if(input[i] == 'I'){
                if(i+1 < input.length && input[i+1] == 'V'){
                    total = total + 4;
                    i++;
                }else if(i+1 < input.length && input[i+1] == 'X'){
                    total = total + 9;
                    i++;
                }else {
                    total = total + 1;
                }
            }else if(input[i] == 'V'){
                total = total + 5;
            }else if(input[i] == 'X'){
                if(i+1 < input.length && input[i+1] == 'L'){
                    total = total + 40;
                    i++;
                }else if(i+1 < input.length && input[i+1] == 'C'){
                    total = total + 90;
                    i++;
                }else {
                    total = total + 10;
                }
            }else if(input[i] == 'L'){
                total = total + 50;
            }else if(input[i] == 'C'){
                if( i+1 < input.length && input[i+1] == 'D'){
                    total = total + 400;
                    i++;
                }else if(i+1 < input.length && input[i+1] == 'M'){
                    total = total + 900;
                    i++;
                }else {
                    total = total + 100;
                }
            }else if(input[i] == 'D'){
                total = total + 500;
            }else if(input[i] == 'M'){
                total = total + 1000;
            }
        }
        return total;
    }
}

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String args[]) {
        String str;
        char ch;
        String str1 = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  ");
        str = scan.nextLine();
        int end = str.length();
        for (int i = str.length()-1; i > 0; i--) {
            ch = str.charAt(i);
            if (ch == ' ') {
                for (int j = i + 1; j < end; j++) {
                    str1 = str1+str.charAt(j);
                }
                str1=str1+" ";
                end = i;
            }   
        }
        for(int j=0;j<end;j++){
                    str1=str1+str.charAt(j);
                }
        System.out.println("reverse sentence: " + str1);
    }
}

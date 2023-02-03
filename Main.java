import java.util.Scanner;
public class Main {

    static boolean isPalindrome (String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str= "";
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Kelime Giriniz : ");
        str = input.nextLine();

        if (isPalindrome(str)){
            System.out.print("Palindromik Bir Kelime Girdiniz!");
        }else{
            System.out.print("Girdiğiniz Kelime Palindromik Değil!");
        }

    }


}

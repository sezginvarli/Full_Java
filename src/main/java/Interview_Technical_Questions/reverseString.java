package Interview_Technical_Questions;

public class reverseString {


    public static void main(String[] args) {
        reverseString("ali");
    }


    public static String reverseString(String str) {
        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }
}
// kod çalışmıyor...incerlenecek...metod çağırmada sorun olabilir
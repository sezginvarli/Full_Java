package Interview_Technical_Questions;

public class checkPrime {
    public static void main(String[] args) {
        checkPrime(5);
    }
    public static boolean checkPrime (int n){
        if(n<=1){
            return false;
        }
        for (int i=2; i< Math.sqrt(n); i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
}
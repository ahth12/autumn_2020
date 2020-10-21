public class NewMath {
    public static int fact(int a){
        int temp_fact = 1;
        for (int i = 1; i < a+1; i++){
            temp_fact *= i;
        }
        return temp_fact;
    }
    public static int abs(int a){
        return a>0?a:-a;
    }
    public static int pow(int a, int b){
        if (b==0){return 1;}
        for (int i = 1; i< b; i++) {
            a *=a;
        }
        return a;
    }
}

/** 
* @author Bilous Anton
*/
public class NewMath {
	/** Function that calculate factorial
	* @param a - number of factorial
	* @return return factorial of a
	*/
    public static int fact(int a){
        int temp_fact = 1;
        for (int i = 1; i < a+1; i++){
            temp_fact *= i;
        }
        return temp_fact;
    }
	/** Function that calculate absolute value of number
	* @param a - number what factorial we want to know
	* @return returns absolute value of a
	*/
    public static int abs(int a){
        return a>0?a:-a;
    }
	/** Function that calculate power of number a
	* @param a - number
	* @param b - power
	* @return returns a of the power b
	*/
    public static int pow(int a, int b){
        if (b==0){return 1;}
        for (int i = 1; i< b; i++) {
            a *=a;
        }
        return a;
    }
}
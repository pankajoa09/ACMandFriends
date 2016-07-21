import java.util.Scanner;

class Main {
        public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int count = 0;
        for (int i=1; i*i <= 2*n; i++) {
                if ((i%2 == 1 && n%i == 0) || (i%2 == 0 && n%i != 0 && 2*n%i == 0)){
                count += 1;
                }
        }
System.out.println(count);
        }
}

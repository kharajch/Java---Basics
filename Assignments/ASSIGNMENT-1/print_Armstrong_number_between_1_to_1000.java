
public class print_Armstrong_number_between_1_to_1000 {
    public static void main(String[] args) {

        boolean a;

        System.out.println("Armstrong numbers between 1 to 1000 are :");
        for (int i = 1; i <= 1000; i++) {
            a = armstrong(i);
            if (a == true) {
                System.out.printf("%d ", i);
            }

        }

    }

    static boolean armstrong(int n) {
        int n_cpy = n;
        int n_cpy2 = n;
        int num_of_dig = 0;
        int dig;
        int sum = 0;

        while (n_cpy > 0) {
            n_cpy /= 10;
            num_of_dig++;
        }

        while (n_cpy2 > 0) {
            dig = (n_cpy2 % 10);
            n_cpy2 /= 10;
            sum += Math.powExact(dig, num_of_dig);
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}

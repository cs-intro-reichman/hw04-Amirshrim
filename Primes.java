public class Primes {

    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("empty");
            return;
        }
        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            return;
        }

        
        boolean[] isprime = new boolean[n + 1];
        for (int i = 2; i <= n; i++){ 
            isprime[i] = true;
        }

        
        int i = 2;
        while(i * i <= n){
            if(isprime[i]){
                int j = i * i;
                while(j <= n){
                    isprime[j] = false;
                    j += i;
                }
            }
            i++;
        }

        
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for(int p = 2; p <= n; p++){
            if(isprime[p]){
                System.out.println(p);
                counter++;
            }
        }

        
        double totalNumbers = n - 1;
        double percentage = (counter / totalNumbers) * 100;
        
        
        System.out.println("There are " + counter + " primes between 2 and " + n + 
                           " (" + (int) percentage + "% are primes)");
    }
}
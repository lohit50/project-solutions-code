class Solution {
    public static int[] primeList;
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n%2==0 || n%3==0) return false;
        else{
            for (int i = 5; i*i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        primeList = new int[right - left];
        int[] pair = new int[2];
        int last_prime = 2;
        pair[0] = 2;
        pair[1] = 3;
        if(left == 1 && right > 2) return pair;
        for(int i = left; i <= right; i++){
            if(i > 2 && i%2 == 0) continue;
            if(isPrime(i)){
                if(pair[0] == 2) pair[0] = i;
                else if(pair[1] == 3) pair[1] = i;
                else{
                    if(pair[1] - pair[0] > i - last_prime){
                        pair[0] = last_prime;
                        pair[1] = i;
                    }
                }
                last_prime = i;
                i++;
            }
        }
        if( pair[0] == 2 || pair[1] == 3 ){
            pair[0] = -1;
            pair[1] = -1;
        }
        return pair;
    }
}
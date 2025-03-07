class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19) return true;
        if(n%2==0 || n%3==0 || n%5==0 || n%7 == 0 || n%11 == 0 || n%13 == 0 || n%17 == 0 ||n%19 == 0) return false;
        else{
            for (int i = 5; i*i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] pair = new int[2];
        int last_prime = 2;
        pair[0] = 2;
        pair[1] = 3;
        if(left == 1 && right > 2) return pair;
        for(int i = left; i <= right; i++){
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
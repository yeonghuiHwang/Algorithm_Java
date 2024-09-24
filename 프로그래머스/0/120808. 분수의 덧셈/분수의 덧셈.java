class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1; // 분자
        int denom = denom1 * denom2; // 분모
        
        // gcd 메서드를 호출하여 최대공약수 계산
        int gcd = gcd(numer, denom);
        
        // 기약분수로 변환 후 반환
        return new int[] {numer / gcd, denom / gcd};
    }
    
    // 최대공약수를 구하는 메서드는 클래스 밖에 정의
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

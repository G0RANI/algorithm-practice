package programers;

import java.util.HashSet;

public class No51 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    HashSet<Integer> mayPrimes = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);

        for(Integer mayPrime : mayPrimes){
            if(isPrime(mayPrime)) answer++;
        }

        return answer;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals(""))
            mayPrimes.add(Integer.parseInt(comb));

        // 2. 남은 숫자 중 한 개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));

    }

    public boolean isPrime(Integer mayPrime) {

        if (mayPrime == 0 || mayPrime == 1) return false;

        for(int i = 2; i <= Math.sqrt(mayPrime); i++) {
            if(mayPrime % i == 0) return false;
        }

        return true;
    }
}

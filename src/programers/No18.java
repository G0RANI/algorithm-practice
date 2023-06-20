package programers;

public class No18 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        int answer = 0;
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < pronunciations.length; i++) {
            for(int j = 0; j < babbling.length; j++) {
                babbling[j] = babbling[j].replace(pronunciations[i], String.valueOf(i));
            }
        }

        for(int i = 0; i < babbling.length; i++){
            if(!babbling[i].contains("00") &&
                    !babbling[i].contains("11") &&
                    !babbling[i].contains("22") &&
                    !babbling[i].contains("33")){
                String temp = babbling[i];
                temp = temp.replace("0", "");
                temp = temp.replace("1", "");
                temp = temp.replace("2", "");
                temp = temp.replace("3", "");
                if(temp.equals("")) answer++;
            }
        }
    }

}

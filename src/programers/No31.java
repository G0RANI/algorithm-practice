package programers;

public class No31 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/72410
    public String solution(String new_id) {
        String answer = "";
        String newId = new_id;

        newId = newId.toLowerCase();

        newId = newId.replaceAll("[^a-z0-9-_.]", "");

        newId = newId.replaceAll("\\.+", ".");

        newId = newId.replaceAll("^\\.|\\.$", "");

        if(newId.equals("")) newId = "a";

        if(newId.length() > 15){
            newId = newId.substring(0, 15);
            newId = newId.replaceAll("\\.$", "");
        }

        while (newId.length() <= 2) {
            newId += newId.charAt(newId.length() - 1);
        }

        answer = newId;
        return answer;
    }
}

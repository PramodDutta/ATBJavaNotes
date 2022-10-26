package thetestingacademy.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ProblemMap {
    public static void main(String[] args) {
        String msg = "Hi Pramod Dutta, How are you bro Pramod ?";
//        Map<Character, Integer> characterMap = new HashMap();
        Map<String, Integer> characterMap = new HashMap();
//        char[] character = msg.toCharArray();
        String[] words = msg.split(" ");

//        for (char ch:character) {
//            Integer count = characterMap.get(ch);
//            if(count == null){
//                characterMap.put(ch,1);
//            }else{
//                characterMap.put(ch,count+1);
//            }
//        }

        for (String ch:words) {
            Integer count = characterMap.get(ch);
            if(count == null){
                characterMap.put(ch,1);
            }else{
                characterMap.put(ch,count+1);
            }
        }

        System.out.println(characterMap);


    }
}

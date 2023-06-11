package thetestingacademy.collections.map.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MP02 {
    public static void main(String[] args) {
        String msg = "Hi Pramod Dutta, How are you bro Pramod ?";
        // Char -> Dutta -1, Pramod - 2
        // split " " - > Hi, Pramod, Dutta, , How, are, you, bro, Pramod
        String[] words = msg.split(" ");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> charMap = new HashMap<>();
        //Hi, 1
        //      Pramod, 2

        for (String ch : words) {
            Integer count = charMap.get(ch);
            if(count == null){
                charMap.put(ch,1); // Hi,1 , Pramod,2 , Dutta,1, how = 1, ARE = 1,YOU =1 BRO, 1
            }else{
                charMap.put(ch,count+1);
            }
        }

        System.out.println(charMap);


    }
}

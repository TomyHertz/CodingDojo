package Hashmatique;

import java.util.HashMap;
import java.util.Set;
public class Map {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("La Incondicional", "Tú, la misma, siempre tú Amistad, ternura ¿qué sé yo?");
        trackList.put("En la Cama", "Dime en la cama todo lo que quieres Yo me meto contigo donde sea");
        trackList.put("Shhh", "I don't want nobody else to hear the sounds This love is a private affair");
        trackList.put("Easy", "Oh you heard What they say Oh, the more things change");

        String name = trackList.get("Shhh");
        System.out.println(name);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
    
}

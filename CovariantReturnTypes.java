import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Advanced Java

//Complete the classes below
class Flower {
    String  whatsYourName(){
        return "I have many names and tyes";
    }
}

class Jasmine extends Flower {
    String  whatsYourName(){
        return "Jasmine";
    }

}

class Lily extends Flower {
    String  whatsYourName(){
        return "Lily";
    }
}

class Region {
     Flower yourNationalFlower(){
         Flower obj = new Flower();
         return obj;
     }
}

class WestBengal extends Region {
    Jasmine yourNationalFlower(){
        Jasmine jas = new Jasmine();
        return jas;
    }
}

class AndhraPradesh extends Region{
    Lily yourNationalFlower(){
        Lily lil = new Lily();
        return lil;
    }
}


public class CovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
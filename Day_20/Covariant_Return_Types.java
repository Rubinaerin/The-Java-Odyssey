import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Flower base class
class Flower {
    public String whatsYourName() {
        return "I have many names";
    }
}

// Jasmine is a subclass of Flower
class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

// Lily is a subclass of Flower
class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

// Region (State) base class
class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

// WestBengal overrides Region and returns Jasmine (subclass of Flower)
class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

// AndhraPradesh overrides Region and returns Lily (subclass of Flower)
class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}


public class Solution {
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

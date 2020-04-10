import java.util.Random;
public class PasswordGenerator {
    // character set
    private String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w",
            "x","y","z","1","2","3","4","5","6","7","8","9","0","!","@","#","$","%","^","&","*","?","-",
            "_","+","=","/",",",".","{","}","[","]","<",">"};
    // size of character set
    private int size = characters.length;
    // length of password you'd like
    private int length = 20;
    private Random random;

    // randomizes upper/lower case for letters
    private void caseRandomizer(int r) {
        // 0 = lower case, 1 = upper case
        int c = random.nextInt(2);
        String l = characters[r];

        if (c == 1) {
            System.out.print(l.toUpperCase());
        } else {
            System.out.print(l);
        }
    }

    private void generate(int n) {
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(size);
            //check for letter
            if (r < 26) {
                caseRandomizer(r);
            } else {
                System.out.print(characters[r]);
            }
        }
        System.out.println("");
    }


    public PasswordGenerator() {
        random = new Random();

        for (int i = 0; i < 100; i++) {
            // adds a bit of randomness to length (-2..2)
            int n = random.nextInt(5) - 2;
            generate(length + n);
        }
    }


    public static void main(String[] args) {
        new PasswordGenerator();
    }
}

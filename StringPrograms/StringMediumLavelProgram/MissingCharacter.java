package StringMediumLavelProgram;

public class MissingCharacter {
    public static void main(String[] args) {
        String str = "abcdefgijklmnopqrstuvwxyz";
        System.out.println("The missing character is: " + findMissingCharacter(str));
    }

    public static char findMissingCharacter(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c;
        }
        return (char) (('a' + 'z') * 26 / 2 - sum);
    }
}

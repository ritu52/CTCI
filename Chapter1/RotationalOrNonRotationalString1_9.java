package Chapter1;

public class RotationalOrNonRotationalString1_9 {

    public static void main(String[] args) {
        isRotation("waterbottle", "erbottlewat");
        isRotation("waterbottle", "erbottlewaa");
        isRotation("air", "tees");
        isRotation("bake", "akeb");
        isRotation("bake", "keba");
        isRotation("bake", "ebak");
        isRotation("bake", "bakk");
    }

    private static void isRotation(String mainString, String rotatedString) {

        if (mainString.length() == rotatedString.length()) {
            String concatenatedString = mainString.concat(mainString);

            if (concatenatedString.contains(rotatedString)) {
                System.out.printf("%s is a rotational string of %s%n", rotatedString, mainString);
            } else {
                System.out.printf("%s is not a rotational string of %s%n", rotatedString, mainString);
            }
        } else {
            System.out.printf("%s is not a rotational string of %s%n", rotatedString, mainString);
        }
    }
}

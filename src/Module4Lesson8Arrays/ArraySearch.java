package Module4Lesson8Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        String[] concepts = {"programmer", "developer", "abstraction", "polymorphism", "inheritance"};
        String[] pasttimes = {"long walks", "sunrises", "sunsets", "skippin rocks"};

        System.out.println(searchArray("polymorphism", concepts));
        System.out.println(searchArray("inheritance", concepts));
        System.out.println(searchArray("sunsets", pasttimes));
        System.out.println(searchArray("breakdancing",pasttimes));
    }

    public static boolean searchArray(String searchedWord, String[] source) {
        boolean result = false;
        for (String concept : source) {
            if (concept.equals(searchedWord)) {
                result = true;
                break;
            }
        }
        return result;
    }
    public static boolean searchArray(int searchedInt, int[] source) {
        boolean result = false;
        for (int number : source) {
            if (number == searchedInt) {
                result = true;
            }
        }
        return result;
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String word = args[0];
        String[] permutations = generatePermutations(word);
        Arrays.sort(permutations);
        // for (String permutation : permutations) {
        //     System.out.println(permutation);
        // }

        int idxOfOriginal = Arrays.asList(permutations).indexOf(word);
        // need to convert the static array to a list in order to get the index of the word..

        System.out.println(permutations[idxOfOriginal + 1]);
        // return the idx + 1;



    }

    public static String[] generatePermutations(String word) {
        List<String> perms = new ArrayList<>();
        permute(word.toCharArray(), 0, perms);
        return perms.toArray(new String[0]);
    }

    private static void permute(char[] word, int index, List<String> perms) {
        if (index == word.length - 1) {
            perms.add(new String(word));
        } else {
            for (int i = index; i < word.length; i++) {
                swap(word, index, i);
                permute(word, index + 1, perms);
                swap(word, index, i);
            }
        }
    }

    private static void swap(char[] word, int idx, int jdx) {
        char temp = word[idx];
        word[idx] = word[jdx];
        word[jdx] = temp;
    }

}

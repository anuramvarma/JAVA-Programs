import java.util.*;

public class MajorityElementNby3 {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;

        Integer cand1 = null, cand2 = null;
        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (count1 > n / 3) {
            result.add(cand1);
        }
        if (count2 > n / 3) {
            result.add(cand2);
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        MajorityElementNby3 sol = new MajorityElementNby3();
        int[] arr = {3, 2, 3, 2, 2, 1, 1};

        System.out.println("Array: " + Arrays.toString(arr));
        ArrayList<Integer> result = sol.findMajority(arr);
        System.out.println("Majority Elements (> n/3 times): " + result);
    }
}

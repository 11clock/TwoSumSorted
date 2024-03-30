public class Main {
    /*
    * Explanation
    * I was originally going to loop through all possible sums of the target, and use binary search on the integers to
    * see if any of the combinations were in the array. Unfortunately, due to negative numbers being a possibility this
    * proved highly impractical.
    *
    * I decided to instead loop through the array manually until I found a sum that matched the target. Because the
    * array is sorted, we can start one index on the left (index1) and another index on the right (index2). If the
    * current sum is greater than the target, we decrement index2 (since index2 is the bigger number and this lowers the
    * sum). Otherwise, we increment index1 (the lower number, so the sum increases). Once we find our target, the while
    * loop condition will be satisfied, and we can return the indices.
    *
    * The requirements state to return a 1-indexed array, but arrays in Java are 0-indexed with no way to change this
    * behavior. We'll instead treat the input array as 1-indexed and increment the returned index values, which is what
    * the provided example seems to suggest.
    */

    public int[] twoSumSorted(int[] integers, int target) {
        int index1 = 0;
        int index2 = integers.length - 1;

        int sum = integers[index1] + integers[index2];

        while (sum != target) {
            if (sum > target) {
                index2--;
            }
            else {
                index1++;
            }
            sum = integers[index1] + integers[index2];
        }

        return new int[] {index1+1, index2+1};
    }
}

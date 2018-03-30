public class BinarySearch {

    public static void main(String... args) {

        int[] nums = new int[]{10, 12, 14, 17, 19, 20, 23, 27, 28, 29, 30};
        int lookFor = 300;
        System.out.println(binarySearchFinding(lookFor, nums));
    }

    private static String binarySearchFinding(int lookFor, int[] nums) {

        int startIndex = -1;
        int endIndex = nums.length;
        int length = endIndex - startIndex;
        int half = length / 2;
        int midIndex = startIndex + half;
        int midValue = nums[midIndex];

        while (startIndex + 1 < endIndex) {

            if (lookFor == midValue)
                return "Found";

            if (lookFor < midValue) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }

            length = endIndex - startIndex;
            half = length / 2;
            midIndex = startIndex + half;
            midValue = nums[midIndex];
        }

        return "Not Found";
    }

}
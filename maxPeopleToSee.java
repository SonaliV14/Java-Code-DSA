public class maxPeopleToSee {
    public static void main(String[] args) {
        int[] heights = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(maxPeopleVisible(heights));
    }

    static int maxPeopleVisible(int[] heights) {
        int n = heights.length, maxVisible = 0;
        //compare heights using left and right pointers
        for (int i = 0; i < n; i++) {
            int count = 1, tallestLeft = heights[i], tallestRight = heights[i];
            
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] < tallestLeft) {
                    count++;
                    tallestLeft = heights[j];
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (heights[j] < tallestRight) {
                    count++;
                    tallestRight = heights[j];
                }
            }

            maxVisible = Math.max(maxVisible, count);
        }
        return maxVisible;
    }
}
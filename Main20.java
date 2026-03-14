// Sliding Window Maximum
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            if (i >= k - 1) {
                result[idx++] = nums[dq.peek()];
            }
        }

        return result;
    }
}

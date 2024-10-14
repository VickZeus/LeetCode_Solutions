import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    
    // Helper method to perform ceiling of division by 3
    public int Ceil(int n) {
        int mod = n % 3;
        int k = n / 3;
        if (mod > 0) return k + 1;
        return k;
    }
    
    // Optimized method to calculate the maximum sum over k iterations
    public long maxKelements(int[] nums, int k) {
        // Max-heap to store elements of nums
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all elements to the heap
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        long sum = 0;
        
        // Perform the process for k iterations
        for (int i = 0; i < k; i++) {
            // Extract the maximum element
            int maxElement = maxHeap.poll();
            
            // Add the maximum element to the sum
            sum += maxElement;
            
            // Apply the Ceil operation and push the new value back into the heap
            int newElement = Ceil(maxElement);
            maxHeap.add(newElement);
        }
        
        return sum;
    }
}

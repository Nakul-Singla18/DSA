class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        // Create pairs of (capital, profit) and store in a min-heap based on capital
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // Create pairs of (profit, capital) and store in a max-heap based on profit
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        
        // Add all projects to the min-heap based on their capital
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{capital[i], profits[i]});
        }
        
        // Process up to k projects
        for (int i = 0; i < k; i++) {
            // Move all projects from min-heap to max-heap whose capital <= current capital w
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= w) {
                maxHeap.offer(minHeap.poll());
            }
            
            // If max-heap is empty, break since no more projects can be undertaken
            if (maxHeap.isEmpty()) {
                break;
            }
            
            // Select the project with maximum profit from max-heap
            w += maxHeap.poll()[1];
        }
        
        return w;
    }
}

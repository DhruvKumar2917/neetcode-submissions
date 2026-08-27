class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;


        for(int i = 0; i < n; i++) {
            pq.offer(stones[i]);
        }

        while(pq.size() > 1){
            int first = pq.peek();
            pq.poll();
            int second = pq.peek();
            pq.poll();

            if(first - second != 0) pq.offer(first-second);


        }

        return pq.isEmpty()? 0 :pq.peek();

        
    }
}

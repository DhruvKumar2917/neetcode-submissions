class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];

        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i],1);
            }
            else mpp.put(nums[i],mpp.get(nums[i]) + 1);
        }

         PriorityQueue<List<Integer>> pq =
            new PriorityQueue<>((a, b) -> b.get(0) - a.get(0));

        for(Map.Entry<Integer,Integer> entry: mpp.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getValue());
            list.add(entry.getKey());
            pq.offer(list);
        }
        int i = 0; 


        while(!pq.isEmpty() && k>0) {
            int first = pq.peek().get(1);
            pq.poll();
            arr[i++] = first; 
            k--;     
        }

        return arr;




        
    }
}

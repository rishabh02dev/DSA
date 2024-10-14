class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int x : nums)
            pq.offer(x);
        long sc = 0;
        while(!pq.isEmpty() && k > 0) {
            sc += pq.peek();
            int tmp = (int)Math.ceil(pq.poll()/3.0);
            pq.add(tmp);
            k--;
        }
        return sc;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer ,Integer> map = new HashMap<>();

        for (int  num : nums){
            map.put(num, map.getOrDefault(num ,0)+1);
        }
        PriorityQueue<Integer> minheap = new  PriorityQueue <>((e1 ,e2)-> map.get(e1)-map.get(e2));

        for(int ele :map.keySet()){
            minheap.add(ele);
            if(minheap.size() >k){
                minheap.poll();
            }
        }
        int [] res =new int[k];
        int i =0; 
        while(!minheap.isEmpty()){
            res[i] =minheap.poll();
            i++;
        }

    return res ;
    }
}
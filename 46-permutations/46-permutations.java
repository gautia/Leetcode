class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList();
       // List<Integer> tmp = new ArrayList();
        backTrack(answer, new ArrayList<>(), nums);
        return answer;
    }
    
    public static void backTrack(List<List<Integer>> answer, List<Integer> tmp,int[] nums){
        
         if(tmp.size() == nums.length){
              answer.add(new ArrayList<>(tmp));
         } else{
        for(int i=0;i<nums.length;i++){
            
            if(tmp.contains(nums[i])) continue;
            tmp.add(nums[i]);
            backTrack(answer, tmp, nums);
            tmp.remove(tmp.size()-1);
        }
           
         }
        
        
    }
}  

class Solution {
    public boolean evendigitsnumber(int n){
            int digitscount=0;
            while(n!=0){
                n=n/10;
                digitscount++;
            }
            return digitscount%2==0;
        }
    public int findNumbers(int[] nums) {
        int numberscount=0;

        for(int i=0;i<nums.length;i++){
            if(evendigitsnumber(nums[i])){
                numberscount++;
            }
        }
        return numberscount;
    }
}
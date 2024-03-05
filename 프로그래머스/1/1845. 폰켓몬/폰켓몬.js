function solution(nums) {
    let uniqueNum = [...new Set(nums)];
    if(uniqueNum.length >= nums.length /2){
        return nums.length /2;
    }
    return uniqueNum.length;
}
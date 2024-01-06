/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

let numbers = [];
let arrInput = (nums) => {
    let n = prompt("enter the size of array");
    for (let i=1;i<=n;i++){
        nums.push(parseInt(prompt("enter number")));
    }
    return nums;
}
let nums = arrInput(numbers);
let target = parseInt(prompt("Enter the target value"));
console.log(nums);


let twoSum = (nums,target) => {
    let outputArray = [];
    for(let i = 0;i<(nums.length);i++){
        for(let j = 0;j<(nums.length);j++){
            if(i != j && i < j){
                if (nums[i] + nums[j] === target){
                    outputArray.push(i,j);
                    
                }
            }
        }
    }
    console.log(outputArray);
};

twoSum(nums,target);
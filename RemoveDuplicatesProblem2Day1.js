let numbers = [];
let arrInput = (nums) => {
    let n = prompt("enter the size of array");
    for (let i=1;i<=n;i++){
        nums.push(parseInt(prompt("enter number")));
    }
    return nums;
}
let nums = arrInput(numbers);
console.log(nums);

let removeDuplicates = (nums) => {
    let i = 0;
    let outputArray = [];
    for (let j = 1; j < nums.length; j++) {
        if (nums[i] !== nums[j]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;

};

console.log(removeDuplicates(nums));
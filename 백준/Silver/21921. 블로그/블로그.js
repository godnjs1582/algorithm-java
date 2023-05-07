
let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [n,x]= input[0].split(" ").map(Number)
let arr=[0,...input[1].split(" ").map(Number)]
//n=7
//x=5
//arr=[0,1,1,1,1,1,5,1]

let sum = 0;
for(let i=1;i<=n;i++){
  //1부터 x번째 날의 방문자 수의 합
  if(i<=x) sum=sum+arr[i]
}
let maxSum=sum; //가장 큰 합
let count=1;//기간의 개수


// 슬라이딩 윈도우 시작
let left = 1;
let right = x;

while(right+1<=n){//윈도우를 한 칸 오르쪽으로 이동하기
  left++
  right++
  sum=sum+arr[right]-arr[left-1]
  if(sum===maxSum) count++
  else if(maxSum<sum){
    maxSum=sum
    count=1
  }
}

if(maxSum===0) console.log("SAD")
else{
  console.log(maxSum)
  console.log(count)
}






let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [n,x]=input[0].split(" ").map(Number)
//n=5
//x=2
let arr=input[1].split(" ").map(Number)
let sum=0;
for(i=0;i<n;i++){
  if(i<x) sum=sum+arr[i]
}
//초기값 5
let start=0;
let end=x;
let count=1;
let maxSum=sum;

while(end<n){
  sum =sum+arr[end++]-arr[start++]
  if(maxSum===sum){
    count++
  }

  if(maxSum<sum){
    count=1;
    maxSum=sum
  }


}

if(sum===0){
  console.log("SAD")
}else{
  console.log(maxSum+"\n"+count)
}





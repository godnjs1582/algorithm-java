let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [n,k]= input[0].split(" ").map(Number)
let arr=[]
for (i=1;i<=2;i++){
  temp=input[i].split(" ").map(Number)
  arr.push(...temp)
}


console.log(arr.sort((a,b)=>a-b).join(' '))
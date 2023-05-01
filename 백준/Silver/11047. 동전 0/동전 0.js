let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");
let [n,k] =input[0].split(" ").map(Number)
let answer=0
for(i=n;i>0;i--){
  if(input[i]<=k){
    answer=answer+parseInt(k/input[i])
    k=k%input[i]
  } 
}
console.log(answer)
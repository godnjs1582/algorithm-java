let fs = require("fs");
let input = fs.readFileSync("dev/stdin").toString().split("\n");
let group = input[0].split("-")
let answer=0;
for(let i=0;i<group.length;i++){
  let temp = group[i].split("+").map(Number).reduce((a,b)=>a+b)
  if(i==0) answer= answer+temp
  else answer= answer-temp
}

console.log(answer)
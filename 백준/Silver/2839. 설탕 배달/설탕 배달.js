let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");
let n = Number(input[0]);
let cnt = 0;
let flag = false;

while(n>=0){
  if(n%5==0|| n==0){
    cnt = cnt+parseInt(n/5)
    console.log(cnt);
    flag=true;
    break;
  }else{
   n=n-3
   cnt=cnt+1
  }
}
if(!flag){
  console.log(-1)
} 
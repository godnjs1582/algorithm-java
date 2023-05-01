let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");
let distanceArray = input[1].split(" ").map(Number)
let costArray=input[2].split(" ").map(Number)
costArray.pop()
let totalCost=0

for(i=0;i<distanceArray.length;i++){
    if(Math.min(...costArray)!==costArray[i]){
      totalCost=totalCost+costArray[i]*distanceArray[i] 
      distanceArray[i]=0
      costArray[i]=Number.MAX_SAFE_INTEGER
    }else{
      let leftDistance=distanceArray.reduce((a,b)=>a+b)
      totalCost=totalCost+leftDistance*Math.min(...costArray)
      break
    }

}

console.log(totalCost)
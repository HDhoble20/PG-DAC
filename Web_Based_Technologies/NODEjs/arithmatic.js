
function add(num1,num2){
    return `Addition of ${num1} + ${num2}= ${num1+num2}`;
}
function sub(num1,num2){
    return `Subtraction of ${num1} - ${num2}= ${num1-num2}`;
}
function mul(num1,num2){
    return `Multiplication of ${num1} * ${num2}= ${num1*num2}`;
}
function div(num1,num2){
    return `Division of ${num1} / ${num2}= ${num1/num2}`;
}

// console.log(add(100,200));
module.exports={add,sub,mul,div}


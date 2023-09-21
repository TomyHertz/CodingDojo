//FUNCION 1
function printUpTo(x) {
if (x < 0) {
    console.log("número negativo");
    return false;
}
for (let i = 1; i <= x; i++) {
    console.log(i);
}
return true;
}
printUpTo(1000);
y = printUpTo(-10);
console.log(y);

//FUNCION 2
function printSum(x) {
var sum = 0;

for (var i = 0; i <= x; i++) {
    sum += i;
    console.log(i, sum);
}

return sum;
}

y = printSum(255); 
console.log(y);

//FUNCION 3
function printSumArray(x) {
var sum = 0;
for (var i = 0; i < x.length; i++) {
    sum += x[i];
}
return sum;
}

console.log(printSumArray([1, 2, 3]));

function LargestElement(x) {
largest = 0;
for (let i = 0; i < x.length; i++) {
    if (x[i] > largest) {
largest = x[i];
    }
}
return largest;
}
console.log(LargestElement([1, 30, 5, 7]));

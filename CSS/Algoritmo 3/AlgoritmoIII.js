//FUNCION 1
function a(x, y) {
return 5; 
}
console.log(a(5, 5));

//FUNCION 2
function a(x, y) {

z = [];
z.push(x);
z.push(y);
z.push(5);
console.log(z);
return z;
}
b = a(2, 2);
console.log(b);
console.log(a(6, 8));

//FUNCION 3
function a(x) {
z = [];
z.push(x);
z.pop();
z.push(x);
z.push(x);
return z;
}
y = a(2);
y.push(5);
console.log(y);

//FUNCION 4
function a(x) {

if (x[0] < x[1]) {
    return true;
} else {
    return false;
}
}
b = a([2, 3, 4, 5]);
console.log(b);

//FUNCION 5
function a(x) {
  //X=[1,2,3,4]
for (var i = 0; i < x.length; i++) {
    //X.LENGTH = 4
    if (x[i] > 0) {
    x[i] = "Coding";
    }
}
return x;
}
console.log(a([1, 2, 3, 4]));

//FUNCION 6
function a(x) {
for (var i = 0; i < x.length; i++) {
    if (x[i] > 5) {

    x[i] = "Coding";
    } else if (x[i] < 0) {
    x[i] = "Dojo";
    }
}
return x;
}
console.log(a([5, 7, -1, 4]));

//FUNCION 7
function a(x) {
  //X=[5,10]
if (x[0] > x[1]) {

    return x[1];
}
return 10;
}
b = a([5, 10]); 
Console.log(b); 

//FUNCION 8
function sum(x) {

sum = 0;
for (var i = 0; i < x.length; i++) {

    sum = sum + x[i];
    console.log(sum);
}
return sum;
}

//PARTE 2

//FUNCION 9
function printAverage(x) {
var sum = 0;
for (var i = 0; i < x.length; i++) {
    sum += x[i];
}
const average = sum / x.length;
return average;
}

var y = printAverage([1, 2, 3]);
console.log(y);

y = printAverage([2, 5, 8]);
console.log(y);

//FUNCION 10
function returnOddArray() {
var oddArray = [];
for (let i = 1; i <= 255; i += 2) {

    oddArray.push(i);
}
return oddArray;
}

var y = returnOddArray();
console.log(y); 

//FUNCION 11
function squareValue(x) {

for (let i = 0; i < x.length; i++) {

    x[i] = x[i] * x[i];
}
return x;
}


let y = squareValue([1, 2, 3]);
console.log(y); 

y = squareValue([2, 5, 8]);
console.log(y); 

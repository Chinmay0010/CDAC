/*
Exercise 2: 
Write a function forEachElement that accepts an array and a callback. This 
function should apply the callback to each element of the array. 
Requirements: 
●  Pass an anonymous function as the callback that multiplies each element by 
2 and logs the result with the index. 
*/



function forEachElement(arr , callback){
    arr.forEach((element,index) => callback(element, index));
}

forEachElement([1,2,3,4],(element, index)=>{
    console.log(`index: ${index}, value: ${element *2}`);
});


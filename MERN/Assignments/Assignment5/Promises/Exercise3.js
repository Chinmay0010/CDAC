console.log("Promis Started");


const myPromise = new Promise((resolve, reject) => {
    
    setTimeout(() =>{
        resolve({data: "Hello, friend", error: null});
    }, 5000);

});

console.log(myPromise);
console.log("Promise in progress....");

// Fisr promise chain
myPromise
.then((val)=>{
    console.log(val);

    return new Promise((resolve, reject) => {
        setTimeout(() =>{
            resolve("First promise chain is completed!");
        }, 2000);
    })
    
})
.then((val) =>{
    console.log(val);
});


// Second promise chain
myPromise
.then((val) =>{
    console.log(val);
});

return new Promise((resolve, reject) =>{
    setTimeout(() =>{
        resolve("Second promise chain is completed!")
    }, 10000);
})
.then((val) =>{
    console.log(val);
});



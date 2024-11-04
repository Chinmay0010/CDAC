console.log("Promise Started");

const myPromise = new Promise((resolve,reject)=>{
    setTimeout(() =>{
        resolve();
    },3000);

});

console.log(myPromise);
console.log("Promise in progress....");

myPromise
.then(()=> {
    console.log("Step 1 Completed");

    return new Promise((resolve,reject) =>{
        setTimeout(() =>{
            resolve("Step 2 Completed");
        },3000);
    })
    .then((val)=>{
        console.log(val);
    })
})
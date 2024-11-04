const promise1 = new Promise((resolve , reject) =>{
    setTimeout(() => {
        resolve(10);
    }, 5000);

});

const promise2 = new Promise((resolve, reject) =>{
    setTimeout(() =>{
        resolve(20);
    }, 2000);
})

Promise.all([promise1, promise2]).then((values) =>{
    const fvalue = values[0];
    const svalue = values[1];
    console.log(values);
    console.log(fvalue, svalue);
    console.log(fvalue + svalue);

})
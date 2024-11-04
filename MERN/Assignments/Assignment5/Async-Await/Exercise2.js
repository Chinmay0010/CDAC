//2
const fetchFast = () =>{
    return new Promise((resolve, reject) =>{
        setTimeout(() =>{
            resolve("Fast Done!");
        }, 2000);
    });
};

//6
const fetchSlow = () =>{
    return new Promise((resolve, reject) =>{

        setTimeout(() =>{
            resolve("Slow Done!");
        }, 6000);

    });
};

console.log("Program Starting...");
// const firstTimeStamp = new Date();

const useData = async () =>{
    // const fastResult = await fetchFast();

    const fastResult = fetchFast(); /* Vanilla promise */ 
    console.log(fastResult);

    // const slowResult = await fetchSlow();

   const slowResult =  fetchSlow(); /* Vanilla promise */ 
    console.log(slowResult);

    const result = await Promise.all([fastResult, slowResult]); /* Vanilla promise */ 
    console.log(result);

    // const secondTimeStamp = new Date();
    // const timeElapsed =(secondTimeStamp - firstTimeStamp);
    // console.log("Program Complete!",timeElapsed );
}

useData();
console.log("Program Complete!");


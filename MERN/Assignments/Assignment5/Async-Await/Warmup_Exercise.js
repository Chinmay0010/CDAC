const fetchPokemon = () =>{
    return new Promise((resolve, reject) =>{
        setTimeout(() =>{
            //resolve({data : {name : "Pikachu", power :20}});
            reject(new Error("Danger, danger !"));
        }, 2000);
        });
};

console.log("Program is starting...")

const usePokemon = async () =>{

    try {
        const data = await fetchPokemon();
    console.log(data);
    console.log("Done Fetching...");
    } catch (error){
        console.log(error);
    }
    console.log("There was error in our code but we're now ok!")
};

usePokemon();
console.log("Program Completed!")
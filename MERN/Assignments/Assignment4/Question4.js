/*Exercise 4: 
Modify fetchData from Exercise 3 to include error handling. 
Requirements: 
●  Call the callback with an error message if an error occurs; otherwise, pass 
the “response.” 
●  Handle the error gracefully by logging it if it occurs.*/

function fetchData(url,callback){
    setTimeout(() =>{
        const error = Math.random() > 0.5;
        if(error){
            callback("error: Failed to fetch data");
        }
        else{
            callback(null ,"Fetched data from url is "+ url);
        }
        
    },1000);
}

fetchData("https://www.uefa.com/uefachampionsleague/",(error,response)=>{
    if (error){
        console.log(error);
    }
    else{
        console.log(response);
    }
});
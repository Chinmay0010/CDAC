/**Exercise 5: 
Using fetchData from Exercise 4, create another function processData that 
simulates processing the fetched data. Chain these functions together using nested 
callbacks. 
Requirements: 
●  First, call fetchData. Once the response is received, pass it to processData. 
●  processData should modify the data and log the processed result.*/

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

function processData(data) {
    console.log("Processed data: " + data.toUpperCase());
  }
  
  fetchData("https://www.uefa.com/uefachampionsleague/", (error, response) => {
    if (error) {
      console.log(error);
    } else {
      processData(response);
    }
  });
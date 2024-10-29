/* Exercise 3: 
Simulate a network request by creating a function fetchData that takes a URL and a 
callback as parameters. Use setTimeout to simulate a delay and then call the 
callback with a string representing a response. 
Requirements: 
●  After a delay, log the “response” to the console. */

function fetchData(url,callback){
    setTimeout(() =>{
        callback("Fetched data from url is "+ url)
    },1000)
}

fetchData("https://www.uefa.com/uefachampionsleague/",(response)=>console.log(response));

//Rest Operator (...args):
function sum(...args) {
    return args.reduce((total, current) => total + current, 0);
}
       
console.log(sum(5, 10, 15, 20, 25));  
 

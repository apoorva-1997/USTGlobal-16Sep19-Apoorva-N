const message = new Promise(function(resolve, reject){
if(30>02){
    resolve('success')
}else{
    reject('faliure')
}})
message.then(function(msg){
    console.log('success message' ,msg)
}).catch(function(error)
{
    console.log('faliure  message' ,error)
})

console.log("*************************************************")
const message1 = new Promise(function(resolve, reject){
    if(30>20){
        resolve([{
            name : 'asd',
            age : 67
        },{
            name : 'fgh',
            age : 40,
        },{
            name : 'jkl',
            age : 67,
            } ])
    }else{
        reject('faliure')
    }})
    message1.then(function(msg){
        console.log('employee message' ,msg)
    }).catch(function(error)
    {
        console.log('faliure  message' ,error)
    })
    
console.log("*************************************************")
function outrefunction(counter){
    function innerfunction(){
        let count = counter + 10;
        return count
    }
return innerfunction
}
let innerfun = outrefunction(10)
let counter = innerfun()
console.log('Counter Value',counter)

const arra = ['asd','asdg','ff']          //object destructuring
let[x, y] = arra
console.log(arra)

const data = [1, 2, 3]
const data2 = [11, 21, 31]
const data3 = [...data,...data2]
console.log(data3)


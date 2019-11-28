/*function first (){
    setTimeout(function(){
    console.log('First function Executed');
    callback();
    },0)
    console.log('Executed')
}
function second(){
    console.log('Second function Executed');
}
first();
second();*/

//////////////////////////////////
function first (callback){
    setTimeout(function(){
    console.log('First function Executed');
    callback();
    },0)
    console.log('Executed');
}
function second(){
    console.log('Second function Executed');
}
first(second);
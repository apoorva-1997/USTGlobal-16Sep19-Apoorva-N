//named finction
function add(n1,n2)
{
    console.log('sum=',n1+n2);
    }
    add(20,10);
    function add(n1,n2,n3){
        console.log('sum=',n1+n2+n3);
            }
            add(10,20,30); //no method overloading in js


//FUNCTION EXPRESSION
var res = function(n1,n2)
{
    var resValue = n1-n2;
    return resValue;
}
var value = res(67,76)
console.log('value=',value);


//ALTERNATIVE
var res = function(n1,n2){
    console.log('sum=',n1+n2);
        }
    res(45,23);
    

    // IIE FUNCTION
    ( function(n1,n2){
        console.log('sum=',n1+n2);
            })
        (45,23);

    //FAT ARROW FUNCTION
    var div =(n1,n2)=>{
        console.log('res=',n1+n2);
            }
div(25,26);

//2
var add = n1 => {
    console.log('add=',n1);
}
add(19);

//3
var div = (n1,n2) => console.log(n1+n2);
div(7,8);


//function calling before decler
greeting('hand');
function greeting(msg)
{
    console.log('hello',msg);
}

greeting('Dinga');
var greet = function(msg){
    console.log('hi,msg');
}

greeting('Dinga');
var greet = (msg) =>{
    console.log('hi,msg');
}





    
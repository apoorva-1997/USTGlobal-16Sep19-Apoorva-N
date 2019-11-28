//named function
function add(arr){
    var i, sum = 0;
    for(i = 0; i < arr.length; i++)
    {
    sum = sum + arr[i];
    }
    console.log(sum);
}
add([10, 20, 30, 40]);

//function expression
 var res = function (arr){
    var i, sum = 0;
    for(i = 0; i < arr.length; i++)
    {
    sum = sum + arr[i];
    }
    console.log(sum);
}
add([10, 20, 30, 40]);

//self invoked function
(function (arr){
    var i,sum = 0;
    for(i = 0; i < arr.length; i++)
    {
    sum = sum + arr[i];
    }
    console.log(sum);
})
([10, 20, 30, 40]);

//fat arrow function
var add = (arr) => {
    
        var i, sum = 0;
        for(i = 0; i < arr.length; i++)
        {
        sum = sum + arr[i];
        }
        console.log(sum);
    }
    add([10,20,30,40]);

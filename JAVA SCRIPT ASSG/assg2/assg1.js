//named function
function circum(r){
    var r, pi = 3.142,res;
    res = 2 * pi * r;
    console.log('res =' +res);
    }
    circum(4);

    //function expression
    var res = function (r){
    var r, pi = 3.142, res;
    res = 2 *pi *r;
    console.log('res =' +res);
    }
    circum(4);

    //self invoked funcction
    (function (r){
        var r, pi = 3.142, res;
        res = 2 *pi *r;
        console.log('res =' +res);
        })
        (4);

    //fat arrow function
    var circum = (r) =>{
           var r, pi = 3.142, res;
            res = 2 *pi *r;
            console.log('res =' +res);
            }
            circum(4);
    
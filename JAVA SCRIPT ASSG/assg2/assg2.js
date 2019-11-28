//named function
function fact(n){
    var i, fact = 1,n;
    for(i = 1; i <= n; i++)
    {
       fact = fact * i;
           }
    console.log('factorial =' +fact);
    }
    fact(5);
    
    //function expression
    var res = function(n)
    {
        var i, fact = 1, n;
    for(i = 1; i <= n; i++)
    {
       fact = fact * i;
           }
    console.log('factorial ='+fact);
    }
    fact(4);
    
    //self invoked function
    (function (n){
        var i, fact = 1, n;
        for(i = 1; i <= n; i++)
        {
           fact = fact * i;
               }
        console.log('factorial =' +fact);
        })
        (2);
    
    //fat arrow function
    var fact = (n) => {
            var i, fact = 1, n;
            for(i = 1; i <= n; i++)
            {
               fact = fact * i;
                   }
            console.log('factorial =' +fact);
            }
    fact(1);
    
    
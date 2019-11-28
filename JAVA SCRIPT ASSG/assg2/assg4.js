//named function
function fibo(n){
    var a = 0;
    var b = 1;
    var c = 0, i;
    console.log('a='+a);
    console.log('b='+b);
    for(i = 2; i <= n; i++){
    c = a+b;
    a = b;
    b = c;
    }
       console.log('c=' +c); 
 }
 fibo(4);
 
 //function expression
 var res = function (n){
     var a = 0;
     var b = 1;
     var c = 0, i;
     console.log('a='+a);
     console.log('b=' +b);
     for(i = 2; i <= n; i++){
     c = a+b;
     a = b;
     b = c;
     }
        console.log('c='+c); 
  }
  fibo(4);
 
  //self invoked function
  (function (n){
     var a = 0;
     var b = 1;
     var c = 0, i;
     console.log('a='+a);
     console.log('b='+b);
     for(i = 2; i <= n; i++){
     c = a+b;
     a = b;
     b = c;
     }
        console.log('c='+c); 
  })(4);
 
  //fat arrow function
  var fibo = (n) =>{
     
         var a = 0;
         var b = 1;
         var c = 0, i;
         console.log('a ='+a);
         console.log('b ='+b);
         for(i = 2; i <= n; i++){
         c = a+b;
         a = b;
         b = c;
         }
            console.log('c=' +c); 
      }
      fibo(4);
  
 
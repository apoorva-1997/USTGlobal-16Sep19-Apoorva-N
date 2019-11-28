//named function
function prime(q)
{
    var i, p = 0;
  for(i = 1;i <= q/2; i++)
  {
      if(q % i == 0)
      {
          p = 1;
          break;
      }
    }
      if(p === 0)
      {
          console.log("prime");
      }else
      {
          console.log("notprime");
      }
    }
prime(6);

//function expression
var res = function (q)
{
    var i, p = 0;
  for(i = 1; i <= q/2; i++)
  {
      if(q%i === 0)
      {
          p = 1;
          break;
      }
    }
      if(p === 0)
      {
          console.log("prime");
      }else
      {
          console.log("notprime");
      }
    }
res(2);

//self invoked function
(function (q)
{
    var i, p = 0;
  for(i = 1;i <= q/2; i++)
  {
      if(q % i === 0)
      {
          p = 1;
          break;
      }
    }
      if(p === 0)
      {
          console.log("prime");
      }else
      {
          console.log("notprime");
      }
    })
(4);

//fat arrow functiom
var prime = (q) => {
   
  var i, p = 0;
  for(i = 1 ;i <= q/2; i++)
  {
      if(q%i === 0)
      {
          p = 1;
          break;
      }
    }
      if(p === 0)
      {
          console.log("prime");
      }
      else
      {
          console.log("notprime");
      }
    }

prime(3);

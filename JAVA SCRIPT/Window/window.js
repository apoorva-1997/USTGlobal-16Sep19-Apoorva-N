console.log('window', window);
console.log('This Keyword',this);
console.log(this === window)

//window.alert('welcome to UST')
//alert('welcome to UST n testyantra')

//let data = confirm('are you employee')
//console.log(data)

 let data1 = prompt('whats your name6','Apoorva')
 console.log(data1)

 const person = {
     firstname : 'apoorva',
     lastname : 'navalgund',
     age : 26,
     
     getname : function(){
        return this.firstname+  ' ' +this.lastname;
     }
 }
 let fullname = person.getname()
 console.log('full name',fullname)
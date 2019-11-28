const person = {
                name : 'Apoorva',
                age : 22,
                color : 'white',
                address : {
                        city : 'Blore',
                        state : 'Karnataka',
                        pincode : 582201
                },
                hobbies : ['coding', 'Bird Watching', 'Singing']
 }
 console.log('JavaScript person Object' ,person)
 const jsonObject =JSON.stringify(person) 
 console.log('JSON person Object' ,jsonObject)
 const javaScriptPersonObject = JSON.parse(jsonObject)
 console.log('JavaScript person Object after prase' ,javaScriptPersonObject)

localStorage.setItem('email' ,'apoorvan84@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear()
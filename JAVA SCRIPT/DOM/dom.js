/*let h1Element  = document.getElementById('demo')
console.log('Element =',h1Element)
console.log('Element Text =',h1Element.textContent)
h1Element.textContent = 'Evenin'   //to change text
console.log('*****************************************')

let buttonElement = document.createElement('button')
console.log('Button Element',buttonElement)
buttonElement.textContent='Click Me!!!'               //add txt to button

document.body.appendChild(buttonElement)       //to add body to web page

let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')              //to create list
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'java'
li2Element.textContent = 'angular'
li3Element.textContent = 'java script'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'blue'
h1Element.style.fontSize = '30px'
*/

function showMessage(){
    alert('Hi Hello Welcome!!!!!!')
}

function changeColour(){
    let pelement = document.getElementById('mover')
    pelement.style.color = 'green'
    console.log(color)
}

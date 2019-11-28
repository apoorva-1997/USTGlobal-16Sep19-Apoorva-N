const hobbies = ['Sleeping', 'Chatting', 'Eating']
console.log(typeof hobbies);

const isArrayorNot = Array.isArray(hobbies)
console.log('hobbies array or not',isArrayorNot )

const hasChatting = hobbies.includes('Chatting')
console.log('using includes method',hasChatting)

hobbies.push('Music', 'Dance')
console.log('After push method',hobbies)

hobbies.pop()
console.log('After pop method',hobbies)

hobbies.unshift('Tv', 'Singing')
console.log('After Unshifting',hobbies)

hobbies.shift()
console.log('After shifting',hobbies)

hobbies.splice(2,3,'PUBG','Drama')
console.log('after splicing',hobbies)

const hobbies1 = ['asd','fgh', 'jkl', 'rty','hjk']
const data = hobbies1.slice(2,4)
console.log('after slicing',data)

const data1 = hobbies1.indexOf('nmb',3)
console.log('index of',data1)

const data2 = hobbies1.indexOf('rty',3)
console.log('index of',data2)

const data3 = hobbies1.join('')
console.log('string',data3)

const data4 = hobbies1.join('-')
console.log('string',data4)


const numbers = [100, 200, 300, 400]
const num1 = numbers.map(function(value,index){
    let newvalue = value + 50
    return newvalue
})
console.log('after map method',num1)

const num2 = numbers.map(value => value + 500)
console.log('after map arrow function',num2)

const num = numbers.filter(function(value,index){
    if(value>200)
{
    return true
}
else{
    return false
}}
)
console.log('after filter function',num)

const num3=numbers.filter(value => value>200)
console.log('after filter method using fat arrow function',num3)

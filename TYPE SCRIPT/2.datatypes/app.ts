let myName : string = 'Apoooo';
console.log('myName',myName, typeof myName)

let age = 10;
console.log('age',age, typeof age)

let mobnno : number;
console.log('mobnno',mobnno, typeof mobnno)

let address;
address = 'blore';
address = 90;
console.log('address',address ,typeof address);

let calage = function() : void {
    console.log('age in 22')
}
calage();


class Person {
    constructor(public name : string, public age : number){

    }
}
let person1 = new Person('apoo',77)
console.log(person1);

class Student extends Person {
    constructor (name:string, age: number, public phno: number ){
        super(name ,age);
    }
}
let Student1 = new Student ( "amohgh", 44, 256572587)        //object creation
console.log(Student1);



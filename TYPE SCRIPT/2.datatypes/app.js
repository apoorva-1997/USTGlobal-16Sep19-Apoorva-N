var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = 'Apoooo';
console.log('myName', myName, typeof myName);
var age = 10;
console.log('age', age, typeof age);
var mobnno;
console.log('mobnno', mobnno, typeof mobnno);
var address;
address = 'blore';
address = 90;
console.log('address', address, typeof address);
var calage = function () {
    console.log('age in 22');
};
calage();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person('apoo', 77);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, phno) {
        var _this = _super.call(this, name, age) || this;
        _this.phno = phno;
        return _this;
    }
    return Student;
}(Person));
var Student1 = new Student("amohgh", 44, 256572587);
console.log(Student1);

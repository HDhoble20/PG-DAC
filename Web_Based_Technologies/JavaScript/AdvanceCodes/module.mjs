
import { Employee } from './class.mjs';
import {addition,subtraction,multiplication,division,myName} from './arithmetic.mjs';
console.log(myName);
console.log(addition(100,20));
console.log(subtraction(100,20));
console.log(multiplication(100,20));
console.log(division(100,20));
let empObj= new Employee(101,"Pawan","Puen",2000);
empObj.empDetails()

export class Employee{
    eid=101;
    ename="Himaanshu";
    epost="Manager";
    esal=1500000;

    constructor(id,name,post,salary)
    {
        this.eid=id;
        this.ename=name;
        this.epost=post;
        this.esal=salary;
    }
//memeber function
    empDetails(){
        console.log(`ID:${this.eid} Name:${this.ename} Post:${this.epost} Salary:${this.esal}`);
    }
    
}
//create object
// let empObj= new Employee();
// empObj.empDetails()

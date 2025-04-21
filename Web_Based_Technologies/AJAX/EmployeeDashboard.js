//get request code

let parentElement = document.getElementById("d2");
//create object of XMLHttRequest
let xmlObj = new XMLHttpRequest();

//write callback method to handle request
xmlObj.onload = function () {
    // console.log(this.responseText);
    let data = JSON.parse(this.responseText);

    for (let d of data) {
        let newRow = document.createElement("tr");
        newRow.innerHTML = `<td>${d.id}</td><td>${d.name}</td> <td>${d.post}</td> <td>${d.salary}</td> <td>${d.location}</td> <td>${d.mode}</td>`;
        parentElement.appendChild(newRow);
    }

}
//create request 
xmlObj.open("GET", "http://localhost:8888/Employee");

//send request
xmlObj.send();


//delete request code
function deleteEmployee() {
    let id = document.getElementById("pid").value;
    if (window.confirm(`Are you sure to delete product with id:${id}`)) {
        // window.alert("test");

        // console.log(id);
        let xmlObje = new XMLHttpRequest();
        xmlObje.onload = function () {
            window.alert("Employee deleted successfully...")
        }
        xmlObje.open("DELETE", `http://localhost:8888/Employee/${id}`);
        xmlObje.send();
    }

}

//POST request
function addEmployee() {
    let empObj = {
        name: document.getElementById("eName").value,
        post: document.getElementById("ePost").value,
        salary: document.getElementById("eSalary").value,
        location: document.getElementById("eLocation").value,
        mode: document.getElementById("eMode").value
    };

    let empJson = JSON.stringify(empObj);
    let xmlObje = new XMLHttpRequest();
    xmlObje.onload = function () {
        window.alert("EMPLOYEE ADDED SUCCESSFULLY...");
    }
    xmlObje.open("POST", `http://localhost:8888/Employee`);
    xmlObje.send(empJson);
}

let id;
function getEmployee() {
    id = document.getElementById("empId").value;
    let xmlObj = new XMLHttpRequest();
    xmlObj.onload = function () {
        console.log(this.responseText);
        let data = JSON.parse(this.responseText);
        document.getElementById("empName").value = data.name;
        document.getElementById("empPost").value = data.post;
        document.getElementById("empSalary").value = data.salary;
        document.getElementById("empLocation").value = data.location;
        document.getElementById("empMode").value = data.mode;
    }
    xmlObj.open("GET", `http://localhost:8888/Employee/${id}`)
    xmlObj.send();

}



function updateEmployee() {
    let empObj = {
        name: document.getElementById("empName").value,
        post: document.getElementById("empPost").value,
        salary: document.getElementById("empSalary").value,
        location: document.getElementById("empLocation").value,
        mode: document.getElementById("empMode").value
    }
    let empJson = JSON.stringify(empObj);
    let xmlObj = new XMLHttpRequest();
    xmlObj.onload = function () {
        window.alert("Employee updated successfully...")
    }
    xmlObj.open("PUT", `http://localhost:8888/Employee/${id}`);
    xmlObj.send(empJson);


}

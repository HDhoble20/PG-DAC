
//get request code

let parentElement = document.getElementById("d1");
//create object of XMLHttRequest
let xmlObj = new XMLHttpRequest();

//write callback method to handle request
xmlObj.onload = function () {
    // console.log(this.responseText);
    let data = JSON.parse(this.responseText);

    for (let d of data) {
        let newRow = document.createElement("tr");
        newRow.innerHTML = `<td>${d.id}</td> <td>${d.name}</td> <td>${d.price}</td> <td>${d.company}</td> <td>${d.quantity}</td>`;
        parentElement.appendChild(newRow);
    }

}
 //create request 
 xmlObj.open("GET", "http://localhost:8888/products");

 //send request
 xmlObj.send();

  //delete request code
  function deleteProduct() {
    let id = document.getElementById("pid").value;
    if (window.confirm(`Are you sure to delete product with id:${id}`)) {
        // window.alert("test");
     
        // console.log(id);
        let xmlObje = new XMLHttpRequest();
        xmlObje.onload = function () {
            window.alert("Product deleted successfully...")
        }
        xmlObje.open("DELETE", `http://localhost:8888/products/${id}`);
        xmlObje.send();
    }

}


//POST  request code
function addProduct(){
    // window.alert("test");
    let productObj={
        name:document.getElementById("txtName").value,
        price:document.getElementById("txtPrice").value,
        company:document.getElementById("txtCompany").value,
        quantity:document.getElementById("txtQuantity").value
    };
    
    // console.log(productObj);
    let productJson=JSON.stringify(productObj);
    let xmlObjec=new XMLHttpRequest();
    xmlObjec.onload=function(){
        window.alert("Product added successfully...")
    }
    xmlObjec.open("POST",`http://localhost:8888/products`);
    xmlObjec.send(productJson);
    }


//PUT requuest code
let id;
function getSingleProduct(){
     id=document.getElementById("prodId").value;
    let xmlObj= new XMLHttpRequest();
    xmlObj.onload=function(){
        //  console.log(this.responseText);
        let data=JSON.parse(this.responseText);
    
                  document.getElementById("uName").value=data.name;
                  document.getElementById("uPrice").value=data.price;
                  document.getElementById("uCompany").value=data.company;
                  document.getElementById("uQuantity").value=data.quantity;
    
    
}
xmlObj.open("GET",`http://localhost:8888/products/${id}`)
    xmlObj.send();
}


function updateProduct(){
    // window.alert("test");
    
    
    let productObj={
        name:document.getElementById("uName").value,
        price:document.getElementById("uPrice").value,
        company:document.getElementById("uCompany").value,
        quantity:document.getElementById("uQuantity").value
    };
    let productJson=JSON.stringify(productObj);
    let xmlObject=new XMLHttpRequest();
    xmlObject.onload=function(){
        window.alert("Product updated successfully...")
    }
    xmlObject.open("PUT",`http://localhost:8888/products/${id}`);
    xmlObject.send(productJson);
}




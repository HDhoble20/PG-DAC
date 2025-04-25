import react, { Component } from 'react';

class FriendDetailComp extends Component{

    constructor(){
        super();
        this.state={
            fname:"Himanshu",
            lname:"Dhoble",
            contact:8390455454,
            email:"hdhoble@gmail.com",
            address:"Nagpur"
        }
    }

        render () {
            return(
                <div>
                    <h1>My Friend Details Using Class Component</h1>
                    <h3>My Friend First Name: {this.state.fname}</h3>
                    <h3>My Friend Last Name: {this.state.lname}</h3>
                    <h3>My Friend Contact Number: {this.state.contact}</h3>
                    <h3>My Friend Email ID: {this.state.email}</h3>
                    <h4>My Friend Address: {this.state.address}</h4>
                </div>
            )
        }
    
}

export default FriendDetailComp;
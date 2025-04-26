import React, { Component } from 'react'
import ChildComp from './ChildComp'
import MyPureComp from './MyPureComp'
import MemoComp from './MemoComp'
 class ParentComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            institute: "DCAC",
            fees: 100000,
            location: "Pune"
        }
    }
    changeState() {
        this.setState((prevState) => ({ institute: "Infoway CDAC", fees: this.state.fees + 5000 }))
    }

    render() {
        const { institute, fees, location } = this.state; //destructuring of  state
        console.log("This is Parent Comp");
        return (

            <div>
                <h2>THIS IS CLASS COMPONENT</h2>
                <p>
                    Institue Name:<strong>{this.state.institute}</strong><br />
                    Fees:<strong>{this.state.fees}</strong><br />
                    Location:<strong>{this.state.location}</strong><br />
                    <button type="button" onClick={() => this.changeState()}>Update State</button>
                </p>
                <hr/>
                <ChildComp institute={institute} fees={fees} location={location} changeState={()=>this.changeState()}></ChildComp>
                <MyPureComp institute={institute}></MyPureComp><hr/>
                <MemoComp institute={institute}></MemoComp>
            </div>
        )
    }

}

export default ParentComp

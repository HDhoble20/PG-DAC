import React, { Component, PureComponent } from 'react'

 class MyPureComp extends PureComponent {
    render() {
        console.log("This is MyPureComp");

        return (
            <div>
                <h1>This is my pure comp</h1>
                <p>
                Institue Name:<strong>{this.props.institute}</strong><br />
                {/* Fees:<strong>{this.props.fees}<zz/strong><br/> */}
                </p>
                
            </div>
        )
    }
}

export default MyPureComp

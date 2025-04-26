import React from 'react'

const ChildComp = (props) => {
    const{institute,fees,location,changeState}=props;
    return (
        <div>
            <h2>This is Child Component</h2>
            <p>
                    Institue Name:<strong>{institute}</strong><br />
                    Fees:<strong>{fees}</strong><br />
                    Location:<strong>{location}</strong><br />
             </p>
             <h2 onMouseOver={changeState} >change state data when you hover on me</h2>
        </div>
    )
}

export default ChildComp


const MyDetails = (props)=>{
    return(
        <div>
            <h1>This is My Details Using Function Component</h1>
            <h2>My Name: <strong>{props.fname}</strong> <strong>{props.lname}</strong></h2>
            <h3>My Contact: <strogn>{props.contact}</strogn></h3>
            <h3>My Email: <em>{props.email}</em></h3>
            <h4>My Address: <b><em>{props.address}</em></b></h4>
        </div>
    )
}

export default MyDetails;
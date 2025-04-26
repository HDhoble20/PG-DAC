import React from 'react'

const MemoComp = (props) => {
    console.log("This is memoComp")
    return (
        <div>
            <h2>This is memoComp</h2>
            <p>Institute Name: <strong>{props.institute}</strong></p>
        </div>
    )
}

export default React.memo(MemoComp);

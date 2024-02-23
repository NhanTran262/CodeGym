import React, { useState } from 'react'

function Calculater2() {
    const [num1, setNum1] = useState(0)
    const [num2, setNum2] = useState(0)
    const [result, setResult] = useState(0)
    

    const addition = (event) => {
        event.preventDefault();
        let num1Value=0;
        let num2Value=0;
        if(!isNaN(parseInt(num1))){
            num1Value= parseInt(num1);
        }
        if(!isNaN(parseInt(num2))){
            num2Value= parseInt(num2);
        }
        setResult(num1Value + num2Value);
    };
    const subtraction = (event) => {
        event.preventDefault();
        setResult(num1 - num2);
    };
    const multily = (event) => {
        event.preventDefault();
        setResult(num1 * num2);
    };
    const devide = (event) => {
        event.preventDefault();
        setResult(num1 / num2);
    };
    const handleChangeNum1 = (event) => {
        event.preventDefault();
        setNum1(event.target.value)    
    }
    const handleChangeNum2 = (event) => {
        event.preventDefault();
        setNum2(event.target.value)    
    }
    return (
        <div style={{ margin: '50px' }}>
            <h3>Calculator</h3>
            <form>
                <label>
                    Num1: <input
                        type='number'
                        name='num1'
                        value={num1}
                        onChange={handleChangeNum1} />
                </label>
                <br />
                <label>
                    Num2: <input
                        type='number'
                        name='num2'
                        value={num2}
                        onChange={handleChangeNum2} />
                </label>
                <h2>Result:{result}</h2>
                <button onClick={addition}>+</button>
                <button onClick={subtraction}>-</button>
                <button onClick={multily}>x</button>
                <button onClick={devide}>/</button>
            </form>
        </div>
    )
}

export default Calculater2
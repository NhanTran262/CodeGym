import React, { useState } from "react";

// const App = () => {
//   const value = 1;

//   return (
//     // <div>
//     //   <h1>Default value</h1>
//     //   <div className="default-value">{value}</div>
//     // </div>
//     <>
//     <div className="app-pages">Hello word</div>
//     </>
//   );
// };

// export default App;

const App = () => {
  const [counter, setcounter] = useState(0);
 
  return (
    <div>
      <h1>This is counter app</h1>
      <div className="counter-value">Count: {counter}</div>
      <button className="increment" style={{marginRight: '5px'}} onClick={() => setcounter(counter + 1)}>
        Increment
      </button>
      <button className="decrement" onClick={() => setcounter(counter - 1)}>
        Decrement
      </button>
    </div>
  );
}
 
export default App;
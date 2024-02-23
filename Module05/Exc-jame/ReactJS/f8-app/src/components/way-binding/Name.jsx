import React, { useState } from 'react'
//One-way-binding
// function Name() {
//     const[name,setName]=useState('')
//     const handleChange=(e)=>{
//         setName(e.target.value)
//     }
//     console.log(name);
//   return (
//     <div style={{padding: 32}}>
//         <input onChange={handleChange}/>
        
//     </div>
//   )
// }
// export default Name
//Two-way-binding
// function Name() {
//     const[name,setName]=useState('')
//     const handleChange=(e)=>{
//         setName(e.target.value)
//     }
//     const handleSubmit=()=>{
//         setName("Trần Nhân")
//     }
//     console.log(name);
//   return (
//     <div style={{padding: 32}}>
        
//         <input value={name} onChange={handleChange}/>
//         <button onClick={handleSubmit}>Change</button>
//     </div>
//   )
// }
// export default Name
// VD3:
function Name() {
  const[name,setName]=useState("")
  const[email,setEmail]=useState("")
  
  const handleSubmit=()=>{
      console.log({name,email});
  }
  console.log(name);
return (
  <div style={{padding: 32}}>
      
      <input value={name} onChange={e=>setName(e.target.value)}/>
      <input value={email} onChange={e=>setEmail(e.target.value)}/>
      <button onClick={handleSubmit}>Register</button>
  </div>
)
}
export default Name
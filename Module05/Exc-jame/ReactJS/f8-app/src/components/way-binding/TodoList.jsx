import React, { useState } from 'react'
const jobs = [

]
function TodoList() {
    const [job,setJob]=useState('')
    const [jobs, setJobs] = useState(()=>{
        const storageJobs=JSON.parse(localStorage.getItem("jobs"))
        console.log(storageJobs);
        return storageJobs ?? []
    })

const handleSubmit=()=>{
    setJobs(prev=>{
        const newJobs=[...prev,job]
        const jsonJobs= JSON.stringify(newJobs)
        localStorage.setItem("jobs",jsonJobs)
        return newJobs
    })
    setJob('')
}
    return (
        <div style={{ padding: 32 }}>
            <input 
            value={job} 
            onChange={e=>setJob(e.target.value)}
            />
            <button onClick={handleSubmit}>Add</button>
            <ul>
                {console.log(jobs)}
                {jobs.map((job, index) => (
                    <li key={index}>
                        {job}
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default TodoList
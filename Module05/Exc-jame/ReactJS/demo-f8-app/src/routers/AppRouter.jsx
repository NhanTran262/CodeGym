import React from 'react'
import { Routes, Route } from 'react-router-dom'
import JobList from '../components/job/JobList'
import JobAdd from '../components/job/JobAdd'
import JobDetail from '../components/job/JobDetail'
import JobEdit from '../components/job/JobEdit'
function AppRouter() {
  return (
    <div>
    <h1>Welcom to ITViec</h1>
    <Routes>
        <Route path="/" element={<JobList/>}/>
        <Route path="/jobs" element={<JobList/>}/>
        <Route path="/jobs/add" element={<JobAdd/>}/>
        <Route path="/jobs/:jobId" element={<JobDetail/>}/>
        <Route path="/jobs/edit/:jobId" element={<JobEdit/>}/>
    </Routes>
    </div>
  )
}

export default AppRouter
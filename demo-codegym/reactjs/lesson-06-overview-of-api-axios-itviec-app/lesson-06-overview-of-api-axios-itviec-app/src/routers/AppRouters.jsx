import React from "react";
import { Route, Routes } from "react-router-dom";
import JobList from "../components/job/JobList";
import JobDetail from "../components/job/JobDetail";
import JobAdd from "../components/job/JobAdd";
import JobEdit from "../components/job/JobEdit";

function AppRouters() {
  return (
    <Routes>
      <Route path="/" element={<JobList />} />
      <Route path="/jobs" element={<JobList />} />
      <Route path="/jobs/:jobId" element={<JobDetail />} />
      <Route path="/jobs/add" element={<JobAdd />} />
      <Route path="/jobs/edit/:jobId" element={<JobEdit />} />
    </Routes>
  );
}

export default AppRouters;

import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { JOBS_API_PREFIX } from '../../constants/AppConstants';

function JobList() {
    const [jobs, setJobs] = useState([]);
    const navigate = useNavigate();
    useEffect(() => {
        fetchJobs();
    }, [])
    async function fetchJobs() {
        await axios
            .get(`${JOBS_API_PREFIX}/jobs`)
            .then((res) => {
                setJobs(res.data);
            })
            .catch((error) => {
                throw error;
            });
    }
    function handleCreate() {
        navigate("/jobs/add");
    }
    return (
        <div>
            <h1>List Of Jobs</h1>
            <table border={1}>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Posted Time</th>
                        <th>Title</th>
                        <th>Image</th>
                        <th>Company</th>
                        <th>Salary</th>
                        <th>Type</th>
                        <th>City</th>
                        <th>Description</th>
                        <th colSpan={2}>
                            <button type="button" onClick={handleCreate}>Create</button>
                        </th>
                    </tr>
                </thead>

                <tbody>
                    {jobs.map((job) => (
                        <tr key={job.id}>
                            <td>{job.id}</td>
                            <td>{job.postedTime}</td>
                            <td>{job.title}</td>
                            <td>
                                <img width={100} height={100} src={job.image} alt="Job Avatar" />
                            </td>
                            <td>{job.company}</td>
                            <td>{job.salary}</td>
                            <td>{job.type}</td>
                            <td>{job.city}</td>
                            <td>{job.description}</td>
                            <td>
                                <a href={`/jobs/${job.id}`}>Detail</a>
                            </td>
                            <td>
                                <a href={`/jobs/edit/${job.id}`}>Edit</a>
                            </td>

                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    )
}

export default JobList
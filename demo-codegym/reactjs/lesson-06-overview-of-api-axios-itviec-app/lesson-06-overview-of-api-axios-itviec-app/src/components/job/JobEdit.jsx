import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { JOBS_API_PREFIX } from "../../constants/AppConstant";

function JobEdit() {
  const { jobId } = useParams();
  const [job, setJob] = useState({});
  const navigate = useNavigate();

  useEffect(() => {
    if (jobId) {
      axios
        .get(`${JOBS_API_PREFIX}/jobs/${jobId}`)
        .then((res) => {
          setJob(res.data);
        })
        .catch((err) => {
          throw err;
        });
    }
  }, [jobId]);

  function handleChange(event) {
    setJob({
      ...job,
      [event.target.name]: event.target.value,
    });
  }

  function handleSubmit() {
    axios
      .put(`${JOBS_API_PREFIX}/jobs/${jobId}`, job)
      .then((res) => {
        alert(`Edit book ${JSON.stringify(res.data)} successfully!!!`);
        navigate("/");
      })
      .catch((err) => {
        throw err;
      });
  }

  function getJobs() {
    navigate("/");
  }

  return (
    <div>
      <h1>Job Edit</h1>
      <form>
        <div>
          <label>Id</label>
          <input
            readOnly
            name="id"
            value={job.id || ""}
            onChange={handleChange}
          />
        </div>
        <div>
          <label>Posted Time</label>
          <input
            name="postedTime"
            value={job.postedTime || ""}
            onChange={handleChange}
          />
        </div>
        <div>
          <label>Title</label>
          <input name="title" value={job.title || ""} onChange={handleChange} />
        </div>
        <div>
          <label>Image</label>
          <input name="image" value={job.image || ""} onChange={handleChange} />
        </div>
        <div>
          <label>Company</label>
          <input
            name="company"
            value={job.company || ""}
            onChange={handleChange}
          />
        </div>
        <div>
          <label>Salary</label>
          <input
            name="salary"
            value={job.salary || ""}
            onChange={handleChange}
          />
        </div>
        <div>
          <label>Type</label>
          <input name="type" value={job.type || ""} onChange={handleChange} />
        </div>
        <div>
          <label>City</label>
          <input name="city" value={job.city || ""} onChange={handleChange} />
        </div>
        <div>
          <label>Description</label>
          <input
            name="description"
            value={job.description || ""}
            onChange={handleChange}
          />
        </div>
        <button type="button" onClick={getJobs}>
          Back
        </button>
        &nbsp;
        <button type="button" onClick={handleSubmit}>
          Edit
        </button>
      </form>
    </div>
  );
}

export default JobEdit;

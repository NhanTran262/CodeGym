import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { JOBS_API_PREFIX } from "../../constants/AppConstant";

function JobAdd() {
  const [job, setJob] = useState({});
  const navigate = useNavigate();

  function handleChange(event) {
    setJob({
      ...job,
      [event.target.name]: event.target.value,
    });
  }

  function handleSubmit() {
    axios
      .post(`${JOBS_API_PREFIX}/jobs`, job)
      .then((res) => {
        alert(`"Create job ${JSON.stringify(res.data)} successfully!!!`);
        navigate("/");
      })
      .catch((err) => {
        throw err;
      });
  }

  return (
    <div>
      <h1>Job Add</h1>
      <form>
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
        <button type="button" onClick={handleSubmit}>
          Add
        </button>
      </form>
    </div>
  );
}

export default JobAdd;

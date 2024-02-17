import React, { useEffect, useState } from 'react'
import { deleteEmployee, listEmployees } from '../services/EmployeeService'
import { useNavigate } from 'react-router-dom'

const ListEmployeeComponents = () => {

  const [employees, setEmployees] = useState([])

  const navigator = useNavigate();

  useEffect(() => {
    getAllEmployees();
  }, [])

  function getAllEmployees() {
    listEmployees().then((reponse) => {
      setEmployees(reponse.data);
    }).catch(error => {
      console.error(error);
    })
  }




  // const dummyData = [
  //   {
  //     "id": 1,
  //     "firstName": "Vikrant",
  //     "lastName": "Yadav",
  //     "email": "vikrant@gmai.com"
  //   },
  //   {
  //     "id": 2,
  //     "firstName": "Mani",
  //     "lastName": "Yadav",
  //     "email": "mani@gmai.com"
  //   },
  //   {
  //     "id": 1,
  //     "firstName": "Vikky",
  //     "lastName": "Yadav",
  //     "email": "vikky@gmai.com"
  //   }
  // ]
  //
  function view(employee) {
    console.log(employee);
  }

  function addNewEmployee() {
    navigator('/add-employee')
  }

  function updateEmployee(id) {
    navigator(`/edit-employee/${id}`)
  }

  function removeEmployee(id) {
    console.log(id);

    deleteEmployee(id).then((reponse) => {
      getAllEmployees();
    }).catch(error => {
      console.error(error);
    })
  }

  return (
    <div className='container'>
      <h2 className='text-center'>
        List of Employees
      </h2>
      <button className='btn btn-primary mb-2' onClick={addNewEmployee}>Add Employee</button>
      <table className='table table-striped table-bordered'>
        <thead>
          <tr>
            <th>Employee ID</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
            <th>Employee Email ID</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {
            employees.map(employee =>
              <tr key={employee.id}>
                <td>{employee.id}</td>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
                <td>
                  <button className='btn btn-info' onClick={() => updateEmployee(employee.id)}>Update</button>
                  <button className='btn btn-danger' onClick={() => removeEmployee(employee.id)}
                    style={{ marginLeft: '10px' }}
                  >Delete</button>
                </td>
              </tr>
            )
          }
        </tbody>
      </table>
    </div>
  )
}

export default ListEmployeeComponents
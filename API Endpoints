POST /employees
[ localhost:8080/employees ]  
Request Body:
{
    "location": "ooty",
    "employeeID": "9",
    "employeeEmail": "malar@gmail.com",
    "employeeName": "Malar"
}
Response:
{
    "location": "ooty",
    "employeeID": "9",
    "employeeEmail": "malar@gmail.com",
    "employeeName": "Malar"
}



GET /employees
[ localhost:8080/employees ] 
Response:
[
  {
    "employeeID": "68ce7e42e524b6ec71acde67",
    "employeeName": "Malar",
    "employeeEmail": "malar@gmail.com",
    "location": "ooty"
  },
  {
    "employeeID": "68ce7ea0e524b6ec71acde68",
    "employeeName": "Vishnu",
    "employeeEmail": "vishnu@gmail.com",
    "location": "Tiruppur"
  },
  {
    "employeeID": "68ce7eb2e524b6ec71acde69",
    "employeeName": "Danush",
    "employeeEmail": "danush@gmail.com",
    "location": "Chennai"
  },
]


#Get Particular ID Details
GET /employees/{id}
[ localhost:8080/employees/68ce7e42e524b6ec71acde67 ]
Response:
 {
    "employeeID": "68ce7e42e524b6ec71acde67",
    "employeeName": "Malar",
    "employeeEmail": "malar@gmail.com",
    "location": "ooty"
  }



PUT /employees/{id}
[ localhost:8080/employees/68ce7e42e524b6ec71acde67 ]
Request Body:
 {
    "employeeName": "Dharma",
    "employeeEmail": "dharma@gmail.com",
    "location": "Dharmapuri"
  }
Response:
 {
    "employeeID": "68ce7e42e524b6ec71acde67",
    "employeeName": "Dharma",
    "employeeEmail": "dharma@gmail.com",
    "location": "Dharmapuri"
  }



DELETE /employees/{id}
[ localhost:8080/employees/68ce7e42e524b6ec71acde67 ]
Response:
Id deleted successfully


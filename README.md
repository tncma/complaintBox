Team Name: Digital Dreamers

Team Members:
Praveenn A Xavier  - Place : Bangalore
Praveen T - Place : Chennai
Arvind Sridharan - Place : Chennai
Kiran Venkatarao- Place : Bangalore


===============================================================
COMPLIANT BOX
-------------------------

Technology - Andriod and web services
Description  -
Android application for grievance system at a municipality level
The data communication between the server and client would be done using
web services built on google app engine



Citizen – User. User reports an issue / complaint
Can add and close a resolved complaint
Search / View will give all complaint in the ward
Tracker – will track each individual complaint
ADD new compliant, take a photo and post it

Supervisor – Many ‘Admins’, i.e. the actual worker who addresses the problem report to a supervisor i.e. a super admin.
Supervisors can assign and monitor progress of a particular task.

Employee – The worker on the street who addresses the problem
Can view all assigned tasks
Can mark it resolved on completion of the task


Server side apis

- data 
https://appengine.google.com/datastore/explorer?&app_id=s~custom-rigging-429&version_id=1.372343444212450309

- get a user's complaints
http://1.custom-rigging-429.appspot.com/loadUserComplaints.action?userId=13122

- get a wards complants for the employee
http://1.custom-rigging-429.appspot.com/loadWardComplaints.action?wardNo=1-A

- load a particular complaint's details.
http://1.custom-rigging-429.appspot.com/loadComplaint.action?id=5629499534213120

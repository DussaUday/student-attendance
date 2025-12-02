<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Attendance Form</title>
</head>
<body>
<h2>Student Attendance</h2>

<form action="markAttendance" method="post">
    <label>Student Name:</label>
    <input type="text" name="studentName" required/><br/><br/>

    <label>Date:</label>
    <input type="date" name="date" required/><br/><br/>

    <label>Status:</label>
    <select name="status">
        <option>Present</option>
        <option>Absent</option>
    </select><br/><br/>

    <input type="submit" value="Mark Attendance"/>
</form>

</body>
</html>

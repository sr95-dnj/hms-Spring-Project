<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<h1>Create Employee</h1> <br>
<p>${map.status}</p>
<div class="row">
    
        <div class="col-md-6">
            <form action="#">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
                </div>
                <div class="form-group">
                    <label for="salary">Salary:</label>
                    <input type="text" class="form-control" id="salary" placeholder="Enter Salary" name="salary">
                </div>
                <div class="form-group">
                    <label for="nid">NID:</label>
                    <input type="text" class="form-control" id="nid" placeholder="Enter nid" name="nid">
                </div>
                <div class="form-group">
                    <label for="area">Area:</label>
                    <input type="text" class="form-control" id="area" placeholder="Enter area" name="area">
                </div>

                <div class="form-group">
                    <label for="city">City:</label>
                    <input type="text" class="form-control" id="city" placeholder="Enter city" name="city">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
                <button id="btnCreate" class="btn btn-primary">Create Ajax Emp</button><br>
            </form>
        </div>
        <div class="col-md-6">
            <button id="btnViewAll" class="btn btn-primary">View All</button><br>
            <table id="empTable">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Salary</th>
                        <th>NID</th>
                        <th>Area</th>
                        <th>City</th>
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
            </table>
            
        </div>
   
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />


<script>
    $("#btnViewAll").on("click", function () {
        $("#empTable tbody").empty();
        $.ajax({
            url: '/employee/getAllEmployees',
            type: 'GET',
            dataType: 'json',
            success: function (data, textStatus, jqXHR) {
                for(i=0; i<data.length; i++){
                    var html = '<tr>';
                    html += '<td>'+ data[i].id + '</td>';
                    html += '<td>'+ data[i].name + '</td>';
                    html += '<td>'+ data[i].salary + '</td>';
                    html += '<td>'+ data[i].nid + '</td>';
                    html += '<td>'+ data[i].area + '</td>';
                    html += '<td>'+ data[i].city + '</td>';
                    html += '</tr>';
                    $("#empTable tbody").append(html);
                }
            }
        });


    });

 $("#btnCreate").on("click", function () {
    
        $.ajax({
            url: '/employee/save1',
            type: 'POST',
            dataType: 'json',
            data: {
                name : $("#name").val(),
                salary : $("#salary").val(),
                nid : $("#nid").val(),
                area : $("#area").val(),
                city : $("#city").val()
            }
            
        });


    });

</script>
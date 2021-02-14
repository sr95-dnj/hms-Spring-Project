<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/resources/vendor/css/bootstrap.css">
  
</head>
<body>

<div class="container">
  <h2>Stacked form</h2>
  <form action="/reception/save" method="post">
    <div class="form-group col-6">
      <label for="email">Reception Name : </label>
      <input type="text" class="form-control" id="name" placeholder="Enter reception name" name="name">
    </div>
      <div class="form-group col-6">
      <label for="email">Reception Code : </label>
      <input type="text" class="form-control" id="name" placeholder="Enter department code" name="code">
    </div>
      <div class="form-group col-6">
      <label for="email">Department : </label>
      <input type="text" class="form-control" id="name" placeholder="Enter department " name="department">
    </div>
      <div class="form-group col-6">
      <label for="email">Receptionist : </label>
      <input type="text" class="form-control" id="name" placeholder="Enter receptionist name" name="receptionist">
    </div>
   
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>
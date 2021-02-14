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
  <h2>Add New Pathology</h2>
  <form action="/pathology_save" method="post">
    <div class="form-group col-6">
      <label for="email">Pathology Name : </label>
      <input type="text" class="form-control" id="name" placeholder="Enter pathology name" name="name">
    </div>
   
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>
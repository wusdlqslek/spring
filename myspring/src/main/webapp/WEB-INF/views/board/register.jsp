<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%> 

<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>John's Blog</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Home</a></li>
        <li><a href="#section2">Friends</a></li>
        <li><a href="#section3">Family</a></li>
        <li><a href="#section3">Photos</a></li>
      </ul><br>
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search Blog..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
      </div>
    </div>
	
	<form role="form" method ="post">
		<div class="col-sm-9">
	    	<div class = "form-group">
	    		<label for ="exampleInputTitle">Title</label>
	    		<input type = "text" name="board_title" class = "form-control" placeholder = "Enter Title" />
	    	</div>  
	    	<div class = "form-group">
	    		<label for ="exampleInputContent">Content</label>
	    		<textarea class = "form-control" rows = "3" name="board_content" placeholder = "Enter Content"></textarea>
	    	</div> 
	    	<div class = "form-group">
	    		<label for ="exampleInputWriter">Writer</label>
	    		<input type = "text" name="board_writer" class = "form-control" placeholder = "Enter Writer" />
	    	</div>
	    	<div class = "form-group">
	    		<input type = "submit" class = "btn btn-primary"></div>
	    </div> 
		</form>
		</div>
		</div>
		
<footer class="container-fluid">
  <p>Footer Text</p>
</footer>

</body>
</html>


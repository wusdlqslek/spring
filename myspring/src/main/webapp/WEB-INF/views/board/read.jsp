<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<input type = 'hidden' name='board_bno' value = "${boardVO.board_bno}">
	
	
	
	</form>
		<div class="col-sm-9">
	    	<div class = "form-group">
	    		<label for ="exampleInputTitle">Title</label>
	    		<input type = "text" name="board_title" class = "form-control" 
	    		value ="${boardVO.board_title}" readonly = "readonly" />
	    	</div>  
	    	<div class = "form-group">
	    		<label for ="exampleInputContent">Content</label>
	    		<textarea class = "form-control" rows = "3" name="board_content" readonly = "readonly">${boardVO.board_content}</textarea>
	    	</div> 
	    	<div class = "form-group">
	    		<label for ="exampleInputWriter">Writer</label>
	    		<input type = "text" name="board_writer" class = "form-control" readonly = "readonly" value ="${boardVO.board_writer}"/>
	    	</div>
	    	<div class = "form-group">
				
	    		<button type = "submit" class = "btn btn-warning">수정</button>
	    		<button type = "submit" class = "btn btn-danger">삭제</button>
	    		<button type = "submit" class = "btn btn-primary">목록</button>
	    	</div> 
		
		</div>
		</div>
		</div>
		<script>
		$(document).ready(function(){
			var formObj = $("form[role='form']");
				console.log(formObj);
			$(".btn-warning").on("click",function(){
				formObj.attr("action", "/board/modify");	
				formObj.attr("method", "get");
				formObj.submit();
			})
			$(".btn-danger").on("click",function(){
				formObj.attr("action", "/board/remove");
				formObj.submit();
			})
			$(".btn-primary").on("click", function(){
				self.location = "/board/listAll";
			})
		})
		
		</script>
		
<footer class="container-fluid">
  
</footer>

</body>
</html>


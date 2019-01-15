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
  <script>
  	var result = '${msg}';
  	if(result=='success'){
  		alert("처리완료");
  	}
  </script>
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
	
	
		<div class="col-sm-9">
	    	<table class = "table table-bordered">
	    		<tr>
	    			<th style = "width: 10px">글번호</th>
	    			<th>제목</th>
	    			<th>글쓴이</th>
	    			<th>등록일</th>
	    			<th style = "width:40px">조회수</th>
	    		</tr>
	    		
	    		<c:forEach items="${list}" var="board_vo">
	    			<tr>
	    				<td>${board_vo.board_bno}</td>
	    				<td><a href='/board/read?board_bno=${board_vo.board_bno }'>${board_vo.board_title }</a></td>
	    				<td>${board_vo.board_writer }</td>
	    				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" 
	    					value ="${board_vo.board_regdate }"/></td>
	    				<td><span class = "badge bg-red">${board_vo.board_viewcnt }</span></td>
	    				
	    			</tr>
	    		</c:forEach>
	    	</table>
		</div>
		</div>
		</div>
<footer class="container-fluid">
  <p>Footer Text</p>
</footer>

</body>
</html>


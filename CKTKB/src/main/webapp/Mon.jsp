<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>MonHoc</title>
   <!--Google font-->
  <link href="https://fonts.googleapis.com/css?family=Raleway:500" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Muli" rel="stylesheet" type="text/css">
  <!--Bootstrap-->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
  <!--Font awesome-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
  
  <link rel="stylesheet" href="css/Mon.css">
  
</head>
<body>
<!-- Header -->
  <div class="custom-header d-flex align-items-center" onclick="redirectToIndex()">
    <img src="img/image-1.png" alt="Icon" class="custom-icon float-left">
    <div class="custom-title text-left">Thông Tin Môn Học</div>
  </div>

  <!-- Bang Bootstrap -->
  <form action=""  method="post">
  <div class="container">
    <table class="table custom-table">
      <thead>
        <tr>
          <th scope="col">ID Môn Học</th>
          <th scope="col">Tên Môn Học</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="x" items="${ListM}">
        <tr>
          <td scope="row">${x.idMon}</td>
          <td>            ${x.tenMon}</td>
          <td>
              <button type="button" class="btn btn-danger" onclick="deleteMon('${x.idMon}')">
                           Delete
              </button>
              
           </td> 
        </tr>
        </c:forEach>
        <!-- Thêm các dòng dữ liệu khác nếu cần -->
      </tbody>
    </table>
  </div>
  </form>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
  <script>
  // Hàm xử lý khi button được click
  function deleteMon(idMon) {
    // Tạo URL với tham số idm
    var url = 'deletemon?idm=' + idMon;
    
    // Chuyển hướng trang
    window.location.href = url;
  }
  // Hàm xử lý khi phần tử được click
  function redirectToIndex() {
    // Chuyển hướng trang về index.jsp
    window.location.href = 'index.jsp';
  }
  </script>
</body>
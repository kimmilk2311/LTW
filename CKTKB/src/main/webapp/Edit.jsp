<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Lớp Học</title>
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
    <div class="custom-title text-left">Chi Tiết Lịch Học</div>
  </div>
  
<div class="container mt-5">
    <h1>Tên Lớp học: ${data.tenLop}</h1>
    
    <form class="center-form mb-2" action="editlop" method="post">
        <c:forEach var="x" items="${Listmon}">
            <div class="mb-3">
                <label class="form-label">Tên Môn: ${x.tenMon}</label>
            </div>
            <div class="mb-3">
                <label class="form-label">Id Lịch Học</label>
                <input type="text" class="form-control" id="teacherName"  name="idLH" value="${param.idLH}" placeholder="Nhập mã ID LH">
            </div>
            <div class="mb-3">
                <label  class="form-label">Id Môn: </label>
                <input type="text" class="form-control" id="mon" name="idMon" value="${param.idMon}"  placeholder="Nhập ID Môn">${x.idMon}
            </div>
            <div class="mb-3">
                <label class="form-label">Lớp:</label>
                <input type="text" class="form-control" id="lop"  name="idLop" value="${param.idLop}" placeholder="Nhập ID Lớp">${data.idLop}
            </div>
            <div class="mb-3">
                <label class="form-label">Giáo Viên</label>
                <input type="text" class="form-control" id="giaovien" name="idGV" value="${param.idGV}" placeholder="Nhập ID Giáo Viên">
            </div>
            <div class="mb-3">
                <label class="form-label">Phòng</label>
                <input type="text" class="form-control" id="Phong"  name="idPhong" value="${param.idPhong}" placeholder="Nhập ID Phòng">
            </div>
            <div class="mb-3">
                <label class="form-label">Thứ</label>
                <input type="text" class="form-control" id="thu"  name="thu" value="${param.thu}" placeholder="Nhập Thứ">
            </div>
            <div class="mb-3">
                <label class="form-label">Tiết Bắt Đầu</label>
                <input type="text" class="form-control" id="tietBD"  name="tietBD" value="${param.tietBD}" placeholder="Nhập Tiết Bắt Đầu">
            </div>
            <div class="mb-3">
                <label class="form-label">Tổng tiết</label>
                <input type="text" class="form-control" id="tongtiet"  name="tongtiet" value="${param.tongtiet}" placeholder="Nhập Tổng Số Tiết">
            </div>	
             <button type="submit" class="btn btn-primary">Submit</button>
        </c:forEach>
        
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script>
  // Hàm xử lý khi phần tử được click
  function redirectToIndex() {
    // Chuyển hướng trang về index.jsp
    window.location.href = 'index.jsp';
  }
</script>
</body>
</html>

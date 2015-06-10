<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Map" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="site.css" rel="stylesheet">

<title>Insert title here</title>

</head>
<body>

    <div id="main">
        <div id="header" >
           <center><h1><a href="#">Firms</a></h1></center>
        </div>
        <div id="menu">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About us</a></li>
                <li><a href="http://localhost:8080/TotalService/firms">Firms</a></li>
                <li><a href="#">Help</a></li>
                <li><a href="#">Contact Us</a></li>
               <li><a href="http://localhost:8080/TotalService/login">Login</a></li>
               
				
                
            </ul>
        </div>
        <div id="middle">
            <div id="sidebar"><div id="sidebar2">
                    <h2> </h2>
                    <ul>
                        
                    </ul>

                    <ul>
                        
                    </ul>
                    <h2></h2>
                    <ul>
                        
                        
                    </ul>
            </div></div>
            <div id="right"><div id="right2">
                    <h2>  </h2>
                    <div class="box">
                        <p></p>
                    </div>
                    
                    <h2></h2>
                   <div class="CSSTablepc" >
<table>
                   		 <tr >
                       	  <td >
                            <font size="5"><b>Name</b></font>
                          </td>
                          <td >
                            <font size="5"><b>Email</b></font>
                          </td>
                          <td >
                            <font size="5"><b>Description</b></font>
                          </td>
                                                    <td >
                              Choose
                          </td>
                         </tr >
<c:forEach  var="i" begin="1" end="${firms.size()}">

<tr>
         
             <td ><font size="4"><c:out value="${firms[i-1].getName()}"/></font></td>
  			 <td ><font size="4"><c:out value="${firms[i-1].getEmail()}"/></font></td>
  	         <td ><font size="4"><c:out value="${firms[i-1].getDescription()}"/></font></td>
                                    <td>
                            <input type="checkbox" name="vehicle" value="Bike"> <br>
                          </td>

</tr>
</c:forEach>
</table>
</div>


<br>
<br>
<br>
<br>
<br>
<div class="CSSTablepc" >
<table>
                   		 <tr >
                       	  <td >
                            <font size="5"><b>Name</b></font>
                          </td>
                          <td >
                            <font size="5"><b>Email</b></font>
                          </td>
                          <td >
                            <font size="5"><b>Description</b></font>
                          </td>
                         </tr >
<c:forEach  var="i" begin="1" end="${firms.size()}" varStatus="counter">
<c:set var="number1" value="${firms[i-1].getName()}"/>
<c:set var="number2" value="aaa"/>
<c:choose>
 <c:when test="${number1 == number2}">
     <tr>
         
             <td ><font size="4"><c:out value="${firms[i-1].getName()}"/></font></td>
  			 <td ><font size="4"><c:out value="${firms[i-1].getEmail()}"/></font></td>
  	         <td ><font size="4"><c:out value="${firms[i-1].getDescription()}"/></font></td>
          

</tr>
 </c:when>
</c:choose>
</c:forEach>
</table>
</div>
<br>
                        <center><h2>Message</h2></center><br>


                     
                      <center><textarea rows="10" cols="60"></textarea></center>

                        <br>

                        <center>  <button type="button" value="Send">Send</button></center>
		</div>	 
		<br>

  
                    <h2></h2>
                    <div class="box">
                        <p></p>
                    </div>
            </div></div>
            <div class="clearing">&nbsp;</div>
        </div>
        <div id="footer">
            <p>Copyright &copy; Your Name, designed by <a href="http://www.alphastudio.pl" target="_blank">Alpha Studio</a></p>
        </div>
    </div>
</body>
</html>

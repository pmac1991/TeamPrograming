<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="site.css" rel="stylesheet">
<title>Insert title here</title>
<style>
table, td, th {
    border: 2px solid green;
}

th {
    background-color: green;
    color: white;
}
</style>
</head>
<body>
    <div id="main">
        <div id="header">
            <h1><a href="#">Firms</a></h1>
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
                   <!--   <div class="box">
                        <p></p>
                        <ul>
                        <table>
                        	<tr>
	                        	<tr>
	                        	${firms[0].getName()}  
	                        	</tr>
	                        	<tr>
	                        	${firms[0].getEmail()}  
	                        	</tr>
	                        	<tr>
	                        	${firms[0].getDescription()}  
	                        	</tr>
                        	</tr>
                        	<tr>
	                        	<tr>
	                        	${firms[1].getName()}  
	                        	</tr>
	                        	<tr>
	                        	${firms[1].getEmail()}  
	                        	</tr>
	                        	<tr>
	                        	${firms[1].getDescription()}  
	                        	</tr>
                        	</tr>
                        </table> 
                        </ul>
                        <p> </p>
                    </div> -->
                    <div class="CSSTableGenerator" >
              		  <table >
                   		 <tr >
                       	  <td >
                            <font size="6"><b>Name</b></font>
                          </td>
                          <td >
                            <font size="6"><b>Email</b></font>
                          </td>
                          <td >
                            <font size="6"><b>Description</b></font>
                          </td>
                         </tr >
                    <tr >
                        <td >
                           <font size="4"> ${firms[0].getName()}</font>
                        </td>
                        <td >
                         <font size="4">   ${firms[0].getEmail()} </font>
                        </td>
                        <td >
                          <font size="4">  ${firms[0].getDescription()}</font>
                        </td>
                    </tr>
                    <tr >
                        <td >
                           <font size="4"> ${firms[1].getName()}</font>
                        </td>
                        <td >
                          <font size="4">  ${firms[1].getEmail()} </font>
                        </td>
                        <td >
                          <font size="4">  ${firms[1].getDescription()}</font>
                        </td>
                    </tr>
                    <tr >
                        <td >
                          <font size="4">  ${firms[2].getName()}</font>
                        </td>
                        <td>
                           <font size="4"> ${firms[2].getEmail()} </font>
                        </td>
                        <td>
                            <font size="4">${firms[2].getDescription()}</font>
                        </td>
                    </tr>
                    <tr>
                        <td >
                            <font size="4">${firms[3].getName()}</font>
                        </td>
                        <td>
                           <font size="4"> ${firms[3].getEmail()} </font>
                        </td>
                        <td>
                            <font size="4">${firms[3].getDescription()}</font>
                        </td>
                    </tr>
                </table>
            </div>
            
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

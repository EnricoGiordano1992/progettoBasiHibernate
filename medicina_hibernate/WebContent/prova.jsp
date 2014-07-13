<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX calls to Servlet using JQuery and JSON</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $(document).ready(function() {
        $('#paziente').change(function(event) {  
        var $paziente=$("select#paziente").val();
           $.get('ActionServlet',{paziente:$paziente},function(responseJson) {   
            var $select = $('#cartelle');                           
               $select.find('option').remove();                          
               $.each(responseJson, function(key, value) {               
                   $('<option>').val(key).text(value).appendTo($select);      
                    });
            });
        });
    });          
</script>
</head>
<body>
<h1>AJAX calls to Servlet using JQuery and JSON</h1>
Select paziente:
<select id="paziente">
<option>Select paziente</option>
<option value="CGPDRD1X71L140A">CGPDRD1X71L140A</option>
<option value="FSPBXX9X94U631F">FSPBXX9X94U631F</option>
</select>
<br/>
<br/>
Select cartelle:
<select id="cartelle">
<option>Select State</option>
</select>
</body>
</html>
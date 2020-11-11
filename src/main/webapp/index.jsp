<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/4/20
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to MoodyBooze</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<FORM ACTION="findCocktailName" METHOD="POST">
    <TABLE>
        <div class="row form-group">
            <div class="col-md-6 mb-3 mb-md-0">
                <label class="text-black" for="mood">Mood</label>
                <input type="text" id="mood" name="mood" class="form-control">
            </div>
            <div class="col-md-6">
                <label class="text-black" for="season">Season</label>
                <input type="text" id="season" name="season" class="form-control">
            </div>
        </div>

        <div class="row form-group">
            <div class="col-md-12">
                <input type="submit" name="submit" value="Send Message" class="btn btn-primary py-2 px-4 text-white">
            </div>
        </div>



    </TABLE>
</FORM>
</body>
</html>

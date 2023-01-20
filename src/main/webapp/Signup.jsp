<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="registration.css">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="container" id="wrap">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form action="signup" method="post" accept-charset="utf-8" class="form" role="form">
                <legend>Sign Up</legend>
                <h4>It's free and always will be.</h4>
                <div class="row">
                    <div class="col-xs-6 col-md-6">
                        <input type="text" name="firstname" class="form-control input-lg"
                               placeholder="First Name" />
                    </div>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" name="lastname" class="form-control input-lg"
                               placeholder="Last Name" />
                    </div>
                </div>
                <input type="text" name="email" class="form-control input-lg" placeholder="Your Email" />
                <input
                    type="password" name="password" value="" class="form-control input-lg"
                    placeholder="Password" />
                <input type="password" name="confirm_password"
                                                    class="form-control input-lg" placeholder="Confirm Password" />
                <label for="dob">Birth Date</label>
                <div class="row">
                    <div class="col-xs-4 col-md-4">
                       <input type="date" id="dob" name="dob" class="form-control">
                    </div>
                </div>

<%--                <label>Gender : </label> <label class="radio-inline">--%>
<%--                <input type="radio" name="gender" value="M" id=male /> Male--%>
<%--            </label>--%>
<%--                <label class="radio-inline">--%>
<%--                    <input type="radio" name="gender" value="F" id=female /> Female--%>
<%--                </label>--%>
                <br />
                <span class="help-block">By clicking Create my account, you agree to our Terms and that you have read
                        our Data Use Policy, including our Cookie Use.</span>
                <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                    Create my account</button>
            </form>
            <a href=""> </a>
        </div>
    </div>
</div>
</div>
</body>
</html>
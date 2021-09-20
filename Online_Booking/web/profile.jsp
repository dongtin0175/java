<%-- 
    Document   : profile
    Created on : Sep 18, 2021, 8:09:14 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
                        <html>
                            <head>
                                <meta charset='utf-8'>
                                <meta name='viewport' content='width=device-width, initial-scale=1'>
                                <title>Online Booking</title>
                                <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>
                                <link href='' rel='stylesheet'>
                                <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
                                <style>@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box
}

body {
    font-family: 'Poppins', sans-serif;
    background-color: aliceblue
}

.wrapper {
    padding: 30px 50px;
    border: 1px solid #ddd;
    border-radius: 15px;
    margin: 10px auto;
    max-width: 600px
}

h4 {
    letter-spacing: -1px;
    font-weight: 400
}

.img {
    width: 70px;
    height: 70px;
    border-radius: 6px;
    object-fit: cover
}

#img-section p,
#deactivate p {
    font-size: 12px;
    color: #777;
    margin-bottom: 10px;
    text-align: justify
}

#img-section b,
#img-section button,
#deactivate b {
    font-size: 14px
}

label {
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 500;
    color: #777;
    padding-left: 3px
}

.form-control {
    border-radius: 10px
}

input[placeholder] {
    font-weight: 500
}

.form-control:focus {
    box-shadow: none;
    border: 1.5px solid #0779e4
}

select {
    display: block;
    width: 100%;
    border: 1px solid #ddd;
    border-radius: 10px;
    height: 40px;
    padding: 5px 10px
}

select:focus {
    outline: none
}

.button {
    background-color: #fff;
    color: #0779e4
}

.button:hover {
    background-color: #0779e4;
    color: #fff
}

.btn-primary {
    background-color: #0779e4
}

.danger {
    background-color: #fff;
    color: #e20404;
    border: 1px solid #ddd
}

.danger:hover {
    background-color: #e20404;
    color: #fff
}

@media(max-width:576px) {
    .wrapper {
        padding: 25px 20px
    }

    #deactivate {
        line-height: 18px
    }
}</style>
                                </head>
                                <body oncontextmenu='return false' class='snippet-body'>
                                <div class="wrapper bg-white mt-sm-5">
    <h4>User profile</h4>
    <h6 class="pb-4 border-bottom">${error}</h6>
    <form action="profile" method="post">
        <div class="d-flex align-items-start py-3 border-bottom"> <img src="https://images.pexels.com/photos/1037995/pexels-photo-1037995.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" class="img" alt="">
        <div class="pl-sm-4 pl-2" id="img-section"> <b>Profile Photo</b>
            <p>Accepted file type .png. Less than 1MB</p> <button class="btn button border"><b>Upload</b></button>
        </div>
    </div>
    <div class="py-2">
        <div class="row py-2">
            <div class="col-md-6"> <label for="ID">ID</label> <input type="text" name="id" class="bg-light form-control" readonly value="${user.userId}"> </div>
            <div class="col-md-6 pt-md-0 pt-3"> <label for="userName">User Name</label> <input type="text" name="uname" class="bg-light form-control" value="${user.userName}"> </div>
        </div>
        <div class="row py-2">
            <div class="col-md-6"> <label for="firstname">First Name</label> <input type="text" name="fname" class="bg-light form-control" value="${user.fname}"> </div>
            <div class="col-md-6 pt-md-0 pt-3"> <label for="lastname">Last Name</label> <input type="text" name="lname" class="bg-light form-control" value="${user.lname}"> </div>
        </div>
        <div class="row py-2">
            <div class="col-md-6"> <label for="email">Email Address</label> <input type="text" name="email" class="bg-light form-control" readonly value="${user.email}"> </div>
            <div class="col-md-6 pt-md-0 pt-3"> <label for="phone">Phone Number</label> <input type="tel" name="phone" class="bg-light form-control" value="${user.phone}"> </div>
        </div>
                <div class="row py-2">
            <div class="col-md-6"> <label for="role">Role</label> <select name="role" id="country" class="bg-light">
                    <option value="${role}">${role}</option>
                    <option value="admin">Admin</option>
                    <option value="booker">Booker</option>
                    <option value="owner">Owner</option>
                </select> </div>
        </div>
        <div class="py-3 pb-4 border-bottom"> <input type="submit" name="submit" value="Save" class="btn btn-primary mr-3"> <input type="submit" name="submit" value="Cancel" class="btn border button"> </div>
    </div>
        </form>
</div>
                                <script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>
                                <script type='text/javascript'></script>
                                </body>
                            </html>

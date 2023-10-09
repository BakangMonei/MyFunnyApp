<%--
  Created by IntelliJ IDEA.
  User: Monei Bakang
  Date: 6/6/23
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Bakang Monei" name="description">
    <meta content="Bakang Monei" name="keywords">
    <!-- Favicons -->
    <link href="assets/img/main_logo.png" rel="icon">
    <link href="assets/img/main_logo.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
          rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <form action="LoginServlet" method="post">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                    <div class="card bg-dark text-white" style="border-radius: 1rem;">
                        <div class="card-body p-5 text-center">
                            <div class="mb-md-5 mt-md-4 pb-2">
                                <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                                <p class="text-white-50 mb-5">Please enter your login and password!</p>
                                <div class="form-outline form-white mb-4">
                                    <input name="email" type="email" class="form-control form-control-lg text-center"
                                           placeholder="Email"/>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <input name="password" type="password"
                                           class="form-control form-control-lg text-center" placeholder="Password"/>
                                </div>
                                <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="#!">Forgot password?</a>
                                </p>
                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>
                            </div>
                            <div>
                                <p class="mb-0">Don't have an account? <a href="SignUpServlet"
                                                                          class="text-white-50 fw-bold">Sign Up</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>
</body>
</body>
</html>

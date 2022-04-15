<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" href="Styles.css">
	<meta charset="UTF-8">
	<title>Weather Simulator Home</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/bower_components/bootstrap-horizon/bootstrap-horizon.css">
</head>

<body>
	<nav class="navbar navbar-expand-sm bg-dark">
		<a class="navbar-brand " href="#" style="color:gray">The Weather Station</a>
        <!-- Links -->
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">API</a>
            </li>
        </ul>
    </nav>
	
	<div class="container">
        <!-- Content here -->
        <h1>Weather Station App - 
            <small >Please select a city below!</small>
          
        </h1>
    </div>
    
    <div class="container" style="margin-top: 100px">
        <h4 style="margin-bottom: 50px">Cities</h4>
        <div class="row flex-row flex-nowrap">
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://www.telegraph.co.uk/content/dam/Travel/2019/June/la-observatory.jpg?imwidth=960"
                        height="200px" width="200">
                    <h6 class="card-title">Los Angeles</h6>
                    <p class="card-text" class="h8"> California, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="LA.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>
            </div>
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2021%2F02%2F19%2Fnew-york-city-evening-NYCTG0221.jpg&w=1100&h=737&c=sc&poi=face&q=60"
                        height="200px" width="200">
                    <h6 class="card-title">New York City</h6>
                    <p class="card-text" class="h8"> New York, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="NY.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>

            </div>
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://www.visittheusa.com/sites/default/files/styles/hero_xl_2x_3200x1400/public/images/hero_media_image/2018-09/9c536d2695835a99bbcd04bfe46dbc51.jpeg?h=e1b94005&itok=sAqB3h0X"
                        height="200px" width="200">
                    <h6 class="card-title">Atlanta</h6>
                    <p class="card-text" class="h8"> Georgia, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="ATL.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>

            </div>
        </div> 
        <div class="row flex-row flex-nowrap" style="margin-top: 50px">
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Denver_skyline.jpg/532px-Denver_skyline.jpg"
                        height="200px" width="200">
                    <h6 class="card-title">Denver</h6>
                    <p class="card-text" class="h8"> Colorado, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="DEN.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>

            </div>
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/12/06/09/seattle-cityscape.jpg?quality=75&width=990&auto=webp&crop=982:726,smart"
                        height="200px" width="200">
                    <h6 class="card-title">Seatlle</h6>
                    <p class="card-text" class="h8"> Washington, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="SEA.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>

            </div>
            <div class="col-3">
                <div class="card card-block">
                    <img class="card-img-top" src="https://www.miamigov.com/files/sharedassets/public/news/2020/miami-shutterstock-01.jpg?dimension=pageimage&w=480"
                        height="200px" width="200">
                    <h6 class="card-title">Miami</h6>
                    <p class="card-text" class="h8"> Florida, United States
                    </p>
                    <p><%= (new java.util.Date()).toLocaleString()%></p>
                    <form action="MIA.jsp">
    					<input type="submit" value="View" style="width: 253px" />
					</form>
                </div>

            </div>
        </div>
    </div>
    <footer class="bg-light text-center text-lg-start" style="margin-top: 100px">
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2)">
            <p>Weather Station Web App - Sarthak Shukla & Shane O'Hagan</p>
        </div>
    </footer>
</body>
</html>
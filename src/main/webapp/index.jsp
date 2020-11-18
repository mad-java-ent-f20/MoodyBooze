<!DOCTYPE html><!--  This site was created in Webflow. http://www.webflow.com  -->
<!--  Last Published: Mon Nov 02 2020 09:08:50 GMT+0000 (Coordinated Universal Time)  -->
<html data-wf-page="5ea837e8c81001b668dffd4a" data-wf-site="5ea837e8c8100167b2dffd49">
<head>
    <meta charset="utf-8">
    <title>MoodyBooze</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <meta content="Webflow" name="generator">
    <link href="css/normalize.css" rel="stylesheet" type="text/css">
    <link href="css/webflow.css" rel="stylesheet" type="text/css">
    <link href="css/split-opl.webflow.css?ver=1.1" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js" type="text/javascript"></script>
    <script type="text/javascript">WebFont.load({  google: {    families: ["Inter:regular,600","Lora:regular"]  }});</script>
    <!-- [if lt IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js" type="text/javascript"></script><![endif] -->
    <script type="text/javascript">!function(o,c){var n=c.documentElement,t=" w-mod-";n.className+=t+"js",("ontouchstart"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+"touch")}(window,document);</script>
    <link href="images/favicon.png" rel="shortcut icon" type="image/x-icon">
    <link href="images/webclip.jpg" rel="apple-touch-icon">
    <style type="text/css">
        body {
            -webkit-font-smoothing: antialiased;
        }
    </style>
</head>
<body class="body">
<div class="columns w-row">
    <div class="leftcontent w-col w-col-6 w-col-stack">
        <div data-w-id="b84f5156-c6e2-fb1d-6606-98a08030a472" width="50" height="60" class="image"></div>

    </div>
    <div class="rightcontent w-col w-col-6 w-col-stack">
        <div data-w-id="3fd5aeb3-22da-ed60-7286-0d11f16597d3" style="opacity:0" class="content">
            <div class="name">Welcome to</div>
            <h1 class="tagline"><strong class="bold-text">MoodyBooze</strong></h1>
            <div class="list">
            <h2>Choose your mood:</h2>
                <ul>
                    <li>Celebratory</li>
                    <li>Crushed</li>
                    <li>Blissful</li>
                    <li>Calm</li>
                    <li>Stressed</li>
                    <li>Excited</li>
                    <li>Energetic</li>
                    <li>Flirty</li>
                    <li>Drained</li>
                    <li>Disappointed</li>
                    <li>Gloomy</li>
                    <li>Anxious</li>
                    <li>Grumpy</li>
                    <li>Peaceful</li>
                    <li>Cranky</li>
                    <li>Ambitious</li>
                    <li>Relieved</li>
                    <li>Hopeful</li>
                </ul>
                <br>
                <h2>Choose your Season:</h2>
                <ul>
                    <li>Spring</li>
                    <li>Summer</li>
                    <li>Fall</li>
                    <li>Winter</li>
                </ul>
            </div>
            <br><br><br>
            <div class="list">
            <FORM ACTION="findCocktailName" METHOD="Post">
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

                    <br> <br>

                    <div class="row form-group">
                        <div class="col-md-12">
                            <input type="submit" name="submit" value="Find My Drink!" class="btn btn-primary py-2 px-4 text-white">
                        </div>
                    </div>
                    <br> <br>
                    <br> <br>
                </TABLE>
            </FORM>
            </div>
            <div class="links w-row">
                <div class="column w-col w-col-4">
                    <div class="text-block-2">API DOCUMENTATION</div>
                    <a href="apiDoc.js">API DOCUMENTATION</a>
                    <ul role="list" class="list w-list-unstyled">
                        <li>
                            <a href="#">link to doc</a>
                        </li>
                       <!-- <li>
                            <a href="#">Email</a>
                        </li>
                        <li>
                            <a href="#">Newsletter</a>
                        </li>
                    </ul>
                </div>
                <div class="column-2 w-col w-col-4">
                    <div class="text-block-2">social</div>
                    <ul role="list" class="list w-list-unstyled">
                        <li>
                            <a href="#">Twitter</a>
                        </li>
                        <li>
                            <a href="#">Instagram</a>
                        </li>
                        <li>
                            <a href="#">Dribbble</a>
                        </li>
                    </ul>
                </div>
                <div class="w-col w-col-4">
                    <div class="text-block-2">network</div>
                    <ul role="list" class="list w-list-unstyled">
                        <li>
                            <a href="#">Link One</a>
                        </li>
                        <li>
                            <a href="#">Link Two</a>
                        </li>
                        <li>
                            <a href="#">Link Three</a>
                        </li> -->
                    </ul>
                </div>
            </div>
            <div class="credit">©2020 MoodyBooze - <a href="https://onepagelove.com/split" target="_blank" class="credit-links">Split Template</a> by <a href="https://onepagelove.com" target="_blank" class="credit-links">One Page Love</a>
            </div>
        </div>
    </div>
</div>
<script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=5ea837e8c8100167b2dffd49" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script src="js/webflow.js" type="text/javascript"></script>
<!-- [if lte IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/placeholders/3.0.2/placeholders.min.js"></script><![endif] -->
</body>
</html>
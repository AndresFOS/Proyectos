<?php
    session_start();
    if(isset($_SESSION['usuario']))
    {
        header("location: index2.php");
    }
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/logo.png">
    <link rel="stylesheet" href="css/estilos.css">
    <title>Producciones rico</title>
</head>
<body>
    <!--Menú-->
    <header class="header">
        <div class="logo">
            <a href="index.php">
                <img src="img/logo.png" alt="Logo de la marca">
            </a>
        </div>
        <ul class="nav-links">
            <li><a href="index.php">Inicio</a></li>
            <li><a href="Productos.php">Productos</a></li>
            <li><a href="Nosotros.php">Sobre la empresa</a></li>
        </ul>
        <a href="registro.php" class="btn"><button>Registrarse</button></a>
        <a href="login.php" class="btn"><button>Iniciar Sesión</button></a>

        <a onclick="openNav()" href="#" class="menu"><button>Menu</button></a>
    
        <div class="overlay" id="mobile-menu">
            <a onclick="closeNav()" class="close">&times;</a>
            <div class="overlay-content">
                <a href="index.php">Inicio</a>
                <a href="Productos.php">Productos</a>
                <a href="Nosotros.php">Sobre la empresa</a>
                <a href="registro.php">Registrarse</a>
                <a href="login.php">Iniciar sesion</a>
            </div>
        </div>

    </header>

    <script type="text/javascript" src="nav.js"></script>

    <!--Article-->
    <div class="row">
        <article class="article">
            <section class="section">
                <div class="img">
                    <img src="img/cerealmaiz.jpg" alt="">
                </div>
                <div class="section-info">
                    <h2>Cereal de maiz</h2>
                    <p>El maíz, es uno de los cereales más importantes del mundo, suministra elementos nutritivos a los seres humanos. Contiene fibra que es beneficiosa para la digestión y puede ayudar a prevenir problemas gastrointestinales. Es una fuente de varias vitaminas como la niacina, el ácido fólico y la vitamina B6, así como minerales como el magnesio y el fósforo.</p>
                    <a href="Productos.php" class="botonproducto">Ir a comprar</a>
                </div>
            </section>
            <hr>
            <section class="section">
                <div class="section-info">
                    <h2>Cereal de arroz</h2>
                    <p>El arroz es un cereal abundante en carbohidratos y proteínas, lo que lo convierte en un alimento que aporta gran cantidad de energía. Es naturalmente bajo en grasas y no contiene colesterol, lo que lo convierte en una opción saludable para las personas que buscan mantener un corazón sano. Aunque el arroz no es una fuente completa de proteínas, proporciona aminoácidos esenciales y es una parte importante de la dieta para muchas personas en todo el mundo.</p>
                    <a href="Productos.php" class="botonproducto">Ir a comprar</a>
                </div>
                <div class="img">
                    <img src="img/cerealarroz.jpg" alt="">
                </div>
            </section>
        </article>
    </div>

    <!--Footer o pie de página-->
    <footer class="footer">
        <div class="contenedor-tarjeta">
            <div class="tarjeta-footer">
                <div class="contenedor-tel1">
                    <h2>Ubicación</h2>
                    <p>Neiva-Huila</p>
                    <p>Calle 6 Sur No. 21 - 64 Barrio Sta Isabel</p>
                </div>
            </div>
            <div class="tarjeta-footer">
                <div class="contenedor-tel">
                    <h2>Contactos</h2>
                    <a href="https://api.whatsapp.com/send/?phone=3115483725" target="_blank" class="enlace">
                        <img src="img/iconowp.png" alt="Icono del telefono" class="icono">
                        <p class="tel">3115483725</p>
                    </a>
                </div>
                <div class="contenedor-tel">
                    <a href="mailto:jeismenolaya@hotmail.com" target="_blank" class="enlace">
                    <img src="img/iconocorreo.png" alt="Icono de correo" class="icono">
                    <p class="tel">jeismenolaya@hotmail.com</p>
                    </a>
                </div>
            </div>
            <div class="tarjeta-footer">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3984.647235245831!2d-75.27806622544215!3d2.917419154534292!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e3b738a6a76c65f%3A0x7b1a87264820ee45!2sCl.%206%20Sur%20%2321-64%2C%20Neiva%2C%20Huila!5e0!3m2!1ses-419!2sco!4v1699209278063!5m2!1ses-419!2sco" width="250" height="150" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>
        </div>
        <div class="contenedor-copy">
            <div class="tarjeta-footer">
                <p>Copyright© 2016 Producciones Rico</p>
            </div>
        </div>
    </footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <style><%@include file="/Front.css"%></style>
</head>

<body>
    <header class="header__main">
        <navbar class="navbar__main">
            <ul class="navbar__ul">
                <li>Home</li>
                <li>Back</li>
            </ul>
        </navbar>
    </header>
    <main>
        <h2 class="form__heading">Please Fill the Details</h2>
        <div class="form__box">
            <form action="submit" method="post">
                <label for="name">Your name</label><br>
                <input type="text" id="name" name="name"><br>
                <label for="rno">Res Number</label><br>
                <input type="text" id="rno" name="rno"><br>
                <label for="math">Math</label><br>
                <input type="number" id="math" name="math"><br>
                <label for="java">Java</label><br>
                <input type="number" id="java" name="java"><br>
                <label for="dbms">DBMS</label><br>
                <input type="number" id="dbms" name="dbms"><br>
                <label for="python">Python</label><br>
                <input type="number" id="python" name="python"><br>
                <label for="dcn">DCN</label><br>
                <input type="number" id="dcn" name="dcn"><br><br>
                <button type="submit" id="submit" name="submit">Submit</button>
            </form>
        </div>
    </main>
    <footer class="footer_main">
        <ul class="footer__ul">
            <li>Home</li>
            <li>FAQ</li>
            <li>T&C</li>
        </ul>
    </footer>
</body>

</html>
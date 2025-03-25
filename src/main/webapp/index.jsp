
<html>
<head>
    <title>DES Algorithm</title>
    <style>
        sbutton:hover {
            background-color: darkblue;
        }
    </style>
</head>
<body style=" display: flex;flex-direction: column;align-items: center;justify-content: center;height: 100vh; font-family: Arial, sans-serif;">

    <h1>Generate Your Encrypted Text Using DES Algorithm</h1>

    <form action="HelloServlet" method="post" style=" display: flex;align-items: center;gap: 10px; ">
        <input type="text" name="text" 
        style="  padding: 10px;width: 300px;font-size: 16px;border: 1px solid #ccc;border-radius: 5px;outline: none;" 
        placeholder="Enter any message to encrypt" required />
        <input type="submit" 
        value="Encrypt" 
        class="sbutton" 
        style="padding: 10px 20px;background-color: cornflowerblue;color: white;border: none;border-radius: 5px;cursor: pointer;font-size: 16px;"/>
    </form>

</body>
</html>



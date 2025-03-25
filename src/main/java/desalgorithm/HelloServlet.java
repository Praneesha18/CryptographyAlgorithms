package desalgorithm;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        String text = req.getParameter("text");
    
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

         try {
                
                 DESalgorithm des = new DESalgorithm();
                 String encryptedText = des.encrypt(text);
                 String decryptedText = des.decrypt(encryptedText);
                 out.println("<html><head>");
                 out.println("<title>DES Encryption</title>");
                 out.println("<style>");
                 out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; text-align: center; padding: 20px; margin-top: 10%; }");
                 out.println("h2 { color: black; font-size: 22px; margin-bottom: 5px; }");
                 out.println(".result-container { background: white; padding: 20px; margin: auto; width: 75%; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
                 out.println(".text-row { display: flex; justify-content: space-between; align-items: center; margin: 10px 0; }");
                 out.println(".text-label { font-size: 20px; font-weight: bold; flex: 1; text-align: justify; padding-right: 10px; }");
                 out.println(".text-value { font-size: 18px; flex: 2; text-align: left; padding-left: 10px;  }");
                 out.println("</style>");
                 out.println("</head><body>");
                 out.println("<div class='result-container'>");
                 out.println("<div class='text-row'><span class='text-label'>Original Text:</span><span class='text-value'>" + text + "</span></div>");
                 out.println("<div class='text-row'><span class='text-label'>Encrypted Text:</span><span class='text-value'>" + encryptedText + "</span></div>");
                 out.println("<div class='text-row'><span class='text-label'>Decrypted Text:</span><span class='text-value'>" + decryptedText + "</span></div>");
                 
                 out.println("</div>");
                 
                 out.println("</body></html>");   
        } catch (Exception e) {
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
           
        }
    }
}
    

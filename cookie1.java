    import java.io.*;  
    import javax.servlet.*;  
    import javax.servlet.http.*;  
      
      
    public class servlet1 extends HttpServlet {  
      
      public void doPost(HttpServletRequest request, HttpServletResponse response){  
        try{  
      
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
              
        String n=request.getParameter("userName");  
                String n2=request.getParameter("password");  
        out.print("Welcome "+n);  
      
        Cookie ck=new Cookie("uname",n);
        
        Cookie ck1=new Cookie("pass",n2);
        response.addCookie(ck);  
      response.addCookie(ck1);
        //creating submit button  
        out.print("<form action='servlet2' method='post'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
              
        out.close();  
      
            }catch(Exception e){System.out.println(e);}  
      }  
    }  

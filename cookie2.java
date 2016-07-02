    import java.io.*;  
    import javax.servlet.*;  
    import javax.servlet.http.*;  
      
    public class servlet2 extends HttpServlet {  
      
    public void doPost(HttpServletRequest request, HttpServletResponse response){  
        try{  
      
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        Cookie ck[]=request.getCookies();  
        out.print("Hello your user name is "+ck[0].getValue()+"</br>password is "+ck[1].getValue());  
        
      
        out.close();  
      
             }catch(Exception e){System.out.println(e);}  
        }  
          
      
    }  

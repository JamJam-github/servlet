package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {
    
    // 기존 Servlet 호출 시 동작하는 첫 로직과 동일하게 만듦
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
}

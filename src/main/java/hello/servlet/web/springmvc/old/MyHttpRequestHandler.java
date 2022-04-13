package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/springmvc/request-handler")
public class MyHttpRequestHandler implements HttpRequestHandler {
    /**
     * 1. handler mapping 조회, 스프링 빈에서 name 찾아와 MyHttpRequestHandler 반환
     * 2. handler adapter 조회, HttpRequestHandlerAdapter가 HttpRequestHandler 인터페이스를 지원하므로 어댑터 대상이 된다.
     */

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MyHttpRequestHandler.handleRequest");
    }
}

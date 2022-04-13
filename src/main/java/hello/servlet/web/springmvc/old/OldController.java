package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller")
public class OldController implements Controller {
    /**
     * 1. handler mapping을 실행해서 스프링 빈으로 등록된 name을 찾고 OldController 반환한다.
     * 2. handler adapter 조회, OldController는 어노테이션이 아닌 Controller 인터페이스를 사용하기 때문에 SimpleControllerHandlerAdapter 가 지원한다.
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}

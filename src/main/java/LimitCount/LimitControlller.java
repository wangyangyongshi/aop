//package LimitCount;
//
//import com.duia.ucenter.common.annotation.AccessLimit;
//import com.duia.ucenter.common.annotation.IgnoreVerify;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by wangyang on 2018/12/1.
// */
//
//@RestController
//@RequestMapping("/active")
//public class LimitControlller {
//
//    @RequestMapping("/limit")
//    @IgnoreVerify
//    @AccessLimit(limit = 4, sec = 10)
//    public String test(HttpServletRequest request, @RequestParam(value = "username", required = false) String username) {
//        return "hello wangyang=================limit";
//    }
//}

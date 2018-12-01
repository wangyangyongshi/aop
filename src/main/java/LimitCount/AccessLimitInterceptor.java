//package LimitCount;
//
//import com.duia.ucenter.common.annotation.AccessLimit;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Component;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by wangyang on 2018/12/1.
// */
//@Component
//public class AccessLimitInterceptor implements HandlerInterceptor {
//    Logger logger = LoggerFactory.getLogger(AccessLimitInterceptor.class);
//    @Resource
//    private RedisTemplate<String, Object> redisTemplate;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (handler instanceof HandlerMethod) {
//            HandlerMethod handlerMethod = (HandlerMethod) handler;
//            Method method = handlerMethod.getMethod();
//            if (!method.isAnnotationPresent(AccessLimit.class)) {
//                return true;
//            }
//            AccessLimit accessLimit = method.getAnnotation(AccessLimit.class);
//            if (accessLimit == null) {
//                return true;
//            }
//            int limit = accessLimit.limit();
//            int sec = accessLimit.sec();
//            String key = request.getRemoteAddr() + request.getRequestURI();
//            logger.info("=============================================getRemoteAddr====" + request.getRemoteAddr());
//            logger.info("=============================================getRequestURI====" + request.getRequestURI());
//            logger.info("=============================================getRemoteHost====" + request.getRemoteHost());
//            ValueOperations valueOperations = redisTemplate.opsForValue();
//            Integer maxLimit = (Integer) valueOperations.get(key);
//            if (maxLimit == null) {
//                redisTemplate.opsForValue().set(key, 1, sec, TimeUnit.MINUTES);
//            } else if (maxLimit < limit) {
//                redisTemplate.opsForValue().set(key, maxLimit + 1, sec, TimeUnit.MINUTES);
//            } else {
//                output(response, "请求太频繁");
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//
//
//    public void output(HttpServletResponse response, String msg) throws IOException {
//        response.setContentType("application/json;charset=UTF-8");
//        ServletOutputStream outputStream = null;
//        try {
//            outputStream = response.getOutputStream();
//            outputStream.write(msg.getBytes("UTF-8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            outputStream.flush();
//            outputStream.close();
//        }
//    }
//}

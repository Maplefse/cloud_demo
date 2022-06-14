package cn.itcast.order.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 规则授权,获取请求头
 *
 * @Author: fxiao
 * @Version: 2022/06/12/17:42
 */

@Component
public class HeaderOriginParser implements RequestOriginParser {

    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {

        //获取请求头
        String origin = httpServletRequest.getHeader("origin");

        if (StringUtils.isEmpty(origin)){
            origin = "empty";
        }
        return origin;
    }
}

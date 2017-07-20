package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jh on 2017/6/16.
 * @Controllerע�⣺����ע��ķ�ʽ��������ȷ�ض������Ϊ���������Controller�ࣻ
 */
@Controller
public class MainController {
    /**
     * @return �����������󷵻ص�ҳ�棬�����󷵻� index.jspҳ��
     * @RequestMapping()ע�⣺���ڶ���һ������ӳ�䣬valueΪ�����url��ֵΪ / ˵������������ҳ����method����ָ�����������ͣ�һ��Ϊget��post��
     */
    @RequestMapping(value = "/indexx", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/tt", method = RequestMethod.GET)
    public String tt() {
        return "tt";
    }
}

package practice1;

import java.util.HashMap;
import java.util.Map;

interface ApplicationContext {
    Object getBean(String name);
}

// 지시사항 2번을 참고하여 코드를 작성하세요.
public class SimpleApplicationContext implements ApplicationContext {
    private Map<String, Object> beans = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beans.put(name, bean);
    }

    @Override
    public Object getBean(String name) {
        return beans.get(name);
    }

}

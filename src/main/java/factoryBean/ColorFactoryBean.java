package factoryBean;

import impo.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by wangyang on 2018/10/17.
 */
public class ColorFactoryBean implements FactoryBean<Color> {


    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }


    //是否单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}

package impo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by wangyang on 2018/10/17.
 */
//自定义逻辑返回需要导入的 组件
public class MyImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        //方法不要返回null
        return new String[]{"impo.Red"};
    }
}

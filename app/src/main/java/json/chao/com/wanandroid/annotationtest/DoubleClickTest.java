package json.chao.com.wanandroid.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: Awesome-WanAndroid
 * @Package: json.chao.com.wanandroid.annotationtest
 * @ClassName: DoubleClickTest
 * @Description: 描述
 * @Author: zengxy
 * @CreateDate: 2021/4/16 11:12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoubleClickTest {
    /**
     *  间距时间
     * @return
     */
    int time() default 2;


}
